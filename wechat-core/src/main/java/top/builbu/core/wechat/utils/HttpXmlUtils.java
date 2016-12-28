package top.builbu.core.wechat.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.net.ssl.HttpsURLConnection;

import top.builbu.core.wechat.entity.Unifiedorder;



/**
 * post提交xml格式的参数
 */
public class HttpXmlUtils {

	/**
	 * 开始post提交参数到接口 并接受返回
	 * 
	 * @param url
	 * @param xml
	 * @param method
	 * @param contentType
	 * @return
	 */
	public static String xmlHttpProxy(String url, String xml, String method, String contentType) {
		InputStream is = null;
		OutputStreamWriter os = null;

		try {
			URL _url = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) _url.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setRequestProperty("Content-type", "text/xml");
			conn.setRequestProperty("Pragma:", "no-cache");
			conn.setRequestProperty("Cache-Control", "no-cache");
			conn.setRequestMethod("POST");
			os = new OutputStreamWriter(conn.getOutputStream());
			os.write(new String(xml.getBytes(contentType)));
			os.flush();

			// 返回值
			is = conn.getInputStream();
			return getContent(is, "utf-8");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 解析返回的值
	 * 
	 * @param is
	 * @param charset
	 * @return
	 */
	public static String getContent(InputStream is, String charset) {
		String pageString = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		StringBuffer sb = null;
		try {
			isr = new InputStreamReader(is, charset);
			br = new BufferedReader(isr);
			sb = new StringBuffer();
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
			pageString = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
				if (isr != null) {
					isr.close();
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			sb = null;
		}
		return pageString;
	}
	/**
	 * 构造xml参数
	 * @param xml
	 * @return
	 */
	public static String xmlInfo(Unifiedorder unifiedorder){
		//构造xml参数的时候，至少又是个必传参数
		/*
		 * <xml>
			   <appid>wx2421b1c4370ec43b</appid>
			   <attach>支付测试</attach>
			   <body>JSAPI支付测试</body>
			   <mch_id>10000100</mch_id>
			   <nonce_str>1add1a30ac87aa2db72f57a2375d8fec</nonce_str>
			   <notify_url>http://wxpay.weixin.qq.com/pub_v2/pay/notify.v2.php</notify_url>
			   <openid>oUpF8uMuAJO_M2pxb1Q9zNjWeS6o</openid>
			   <out_trade_no>1415659990</out_trade_no>
			   <spbill_create_ip>14.23.150.211</spbill_create_ip>
			   <total_fee>1</total_fee>
			   <trade_type>JSAPI</trade_type>
			   <sign>0CB01533B8C1EF103065174F50BCA001</sign>
			</xml>
		 */

		if(unifiedorder!=null){
			StringBuffer bf = new StringBuffer();
			bf.append("<xml>");

			bf.append("<appid><![CDATA[");
			bf.append(unifiedorder.getAppId());
			bf.append("]]></appid>");

			bf.append("<mch_id><![CDATA[");
			bf.append(unifiedorder.getMchId());
			bf.append("]]></mch_id>");

			bf.append("<nonce_str><![CDATA[");
			bf.append(unifiedorder.getNonceStr());
			bf.append("]]></nonce_str>");

			bf.append("<sign><![CDATA[");
			bf.append(unifiedorder.getSign());
			bf.append("]]></sign>");

			bf.append("<body><![CDATA[");
			bf.append(unifiedorder.getBody());
			bf.append("]]></body>");

			bf.append("<detail><![CDATA[");
			bf.append(unifiedorder.getDetail());
			bf.append("]]></detail>");

			bf.append("<attach><![CDATA[");
			bf.append(unifiedorder.getAttach());
			bf.append("]]></attach>");

			bf.append("<out_trade_no><![CDATA[");
			bf.append(unifiedorder.getOutTradeNo());
			bf.append("]]></out_trade_no>");

			bf.append("<total_fee><![CDATA[");
			bf.append(unifiedorder.getTotalFee());
			bf.append("]]></total_fee>");

			bf.append("<spbill_create_ip><![CDATA[");
			bf.append(unifiedorder.getSpbillCreateIp());
			bf.append("]]></spbill_create_ip>");

			bf.append("<time_start><![CDATA[");
			bf.append(unifiedorder.getTimeStart());
			bf.append("]]></time_start>");

			bf.append("<time_expire><![CDATA[");
			bf.append(unifiedorder.getTimeExpire());
			bf.append("]]></time_expire>");

			bf.append("<notify_url><![CDATA[");
			bf.append(unifiedorder.getNotifyUrl());
			bf.append("]]></notify_url>");

			bf.append("<trade_type><![CDATA[");
			bf.append(unifiedorder.getTradeType());
			bf.append("]]></trade_type>");

			bf.append("<openid><![CDATA[");
			bf.append(unifiedorder.getOpenId());
			bf.append("]]></openid>");
			
			bf.append("</xml>");
			return bf.toString();
		}

		return "";
	}
	/**
	 * post请求并得到返回结果
	 * 
	 * @param requestUrl
	 * @param requestMethod
	 * @param output
	 * @return
	 */
	public static String httpsRequest(String requestUrl, String requestMethod, String output) {
		try {
			URL url = new URL(requestUrl);
			HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setRequestMethod(requestMethod);
			if (null != output) {
				OutputStream outputStream = connection.getOutputStream();
				outputStream.write(output.getBytes("UTF-8"));
				outputStream.close();
			}
			// 从输入流读取返回内容
			InputStream inputStream = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			StringBuffer buffer = new StringBuffer();
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			inputStream = null;
			connection.disconnect();
			return buffer.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "";
	}

	/**
	 * post请求并得到返回结果
	 * 
	 * @param requestUrl
	 * @param requestMethod
	 * @param output
	 * @return
	 */
	public static String httpRequest(String requestUrl, String requestMethod, String output) {
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setUseCaches(false);
			connection.setRequestMethod(requestMethod);
			if (null != output) {
				OutputStream outputStream = connection.getOutputStream();
				outputStream.write(output.getBytes("UTF-8"));
				outputStream.close();
			}
			// 从输入流读取返回内容
			InputStream inputStream = connection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String str = null;
			StringBuffer buffer = new StringBuffer();
			while ((str = bufferedReader.readLine()) != null) {
				buffer.append(str);
			}
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			inputStream = null;
			connection.disconnect();
			return buffer.toString();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return "";
	}
	
	public static String httpsLogo(String requestUrl,File file) throws IOException {
		URL url = new URL(requestUrl);
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		String result = null;
		con.setDoInput(true);

		con.setDoOutput(true);

		con.setUseCaches(false); // post方式不能使用缓存

		// 设置请求头信息

		con.setRequestProperty("Connection", "Keep-Alive");

		con.setRequestProperty("Charset", "UTF-8");
		// 设置边界

		String BOUNDARY = "----------" + System.currentTimeMillis();

		con.setRequestProperty("Content-Type", "multipart/form-data; boundary="

				+ BOUNDARY);

		// 请求正文信息

		// 第一部分：

		StringBuilder sb = new StringBuilder();

		sb.append("--"); // 必须多两道线

		sb.append(BOUNDARY);

		sb.append("\r\n");

		sb.append("Content-Disposition: form-data;name=\"media\";filelength=\"" + file.length() + "\";filename=\""

				+ file.getName() + "\"\r\n");

		sb.append("Content-Type:application/octet-stream\r\n\r\n");

		byte[] head = sb.toString().getBytes("utf-8");

		// 获得输出流

		OutputStream out = new DataOutputStream(con.getOutputStream());

		// 输出表头

		out.write(head);

		// 文件正文部分

		// 把文件已流文件的方式 推入到url中

		DataInputStream in = new DataInputStream(new FileInputStream(file));

		int bytes = 0;

		byte[] bufferOut = new byte[1024];

		while ((bytes = in.read(bufferOut)) != -1) {

			out.write(bufferOut, 0, bytes);

		}

		in.close();

		// 结尾部分

		byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线

		out.write(foot);

		out.flush();

		out.close();

		StringBuffer buffer = new StringBuffer();

		BufferedReader reader = null;

		try {

			// 定义BufferedReader输入流来读取URL的响应

			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));

			String line = null;

			while ((line = reader.readLine()) != null) {

				buffer.append(line);

			}

			if (result == null) {

				result = buffer.toString();

			}

		} catch (IOException e) {

			System.out.println("发送POST请求出现异常！" + e);

			e.printStackTrace();

			throw new IOException("数据读取异常");

		} finally {

			if (reader != null) {

				reader.close();

			}

		}
		return result;
	}
	public static Map<String,Object> getResult(String jsapiTicket,String url) throws Exception {
		
	    Map<String,Object> map = null;
		SortedMap<Object,Object> parameters = new TreeMap<Object,Object>();
		String noncestr="843c124b-c5d4-4919-a163-fb9372d05889";//RandCharsUtils.getRandomString(16);//生成16位随机字符串
		String timestamp="1478145014";//(System.currentTimeMillis() / 1000) + "";//获取当前时间戳
	  
		//组装签名数据
		parameters.put("jsapi_ticket",jsapiTicket );//获取当前公众号的jsapiTicket
		parameters.put("noncestr", noncestr);
		parameters.put("timestamp", timestamp);
		parameters.put("url", url);		
		String sign=SHA1.encode(WXSignUtils.createSign(parameters));//签名生成   
		
		//组装返回数据
		map=new HashMap<String, Object>();
		map.put("noncestr", noncestr);
		map.put("timestamp", timestamp);
		map.put("sign", sign);
		map.put("appId", "");
		return map;
	 
	
	
}
public static void main(String[] args) {
	try {
		String s=httpRequest("http://weixinfoods1.suntory.com.cn/?openid=[openid]","GET", null);
		System.out.print(s);
//		Map<String,Object> b=getResult("kgt8ON7yVITDhtdwci0qeVQ6W_woEXDbTxsyJKTkRUzx89SOdl-hGnBhAgjxCx0QNZbvBG0SdGOLlRvo3A6p8w","http://www.qkvkcn.com/JQ/index/index!index.htm?null");
	//System.out.print(JsonUtil.toJson(b));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
