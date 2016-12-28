package top.builbu.core.wechat.utils;

import java.io.IOException;

import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;

import top.builbu.core.wechat.entity.WXJsapiTicketResult;
import top.builbu.core.wechat.entity.WXOpenIdResult;
import top.builbu.core.wechat.entity.WXOpenUserResult;
import top.builbu.core.wechat.entity.WXTokenResult;
import top.builbu.core.wechat.entity.WXUrl;

import com.alibaba.fastjson.JSONObject;

public class Aouth2Utils {
	

	

	/**
	 * 获取access_token
	 * @param appid 凭证
	 * @param appsecret 密钥
	 * @return
	 * @throws ClientProtocolException 
	 * @throws IOException 
	 * @throws ParseException 
	 */
	public static WXTokenResult getAccessToken(String appid, String appsecret) throws ClientProtocolException, IOException {
		// 获取access_token的接口地址（GET） 限200（次/天）
		String s=HttpXmlUtils.httpRequest(WXUrl.access_token_url.replace("APPID", appid).replace("APPSECRET", appsecret), "GET",null);
		WXTokenResult result= (WXTokenResult) JSONObject.parseObject(s, WXTokenResult.class);	
		return result;
	}
	
	
	/**
	 * 获取jsapi_ticket
	 * @param accessToken
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static WXJsapiTicketResult jsapiTicket(String accessToken) throws ParseException, IOException {
	     String s=HttpXmlUtils.httpRequest(WXUrl.ticket_url.replace("ACCESS_TOKEN",accessToken), "GET",null);
		 WXJsapiTicketResult result = (WXJsapiTicketResult) JSONObject.parseObject(s, WXJsapiTicketResult.class);		
         return result;
	}
	
	
	
	/**
	 * 通过微信返回的code获取openId
	 * @param appid
	 * @param appsecret
	 * @param code
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public static WXOpenIdResult getOpenId(String appid,String appsecret, String code) throws ClientProtocolException, IOException {
		 String s = HttpXmlUtils.httpRequest(WXUrl.oauth2_url.replace("APPID", appid).replace("SECRET", appsecret).replace("CODE", code), "GET", null);  
		 WXOpenIdResult result = (WXOpenIdResult) JSONObject.parseObject(s, WXOpenIdResult.class);   
         return result;
	}
	
	


	/**
	 * 根据openid获取会员信息		
	 * @param accessToken
	 * @param openId
	 * @return
	 * @throws ParseException
	 * @throws IOException
	 */
	public static WXOpenUserResult openAouth(String accessToken,String openId) throws ParseException, IOException{
		 String s = HttpXmlUtils.httpRequest(WXUrl.open_aouth_url.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId), "GET", null);  
		 WXOpenUserResult result = (WXOpenUserResult) JSONObject.parseObject(s, WXOpenUserResult.class);   
		 return result;
	}
		
	
	
	/**
	 * 判断用户是否关注公众号
	 * @param accessToken
	 * @param openId
	 * @return
	 */		
	public static boolean isFollow(String accessToken,String openId) throws ParseException, IOException{
		String s = HttpXmlUtils.httpsRequest(WXUrl.scribe_url.replace("ACCESS_TOKEN", accessToken).replace("OPENID", openId), "GET", null);			
        JSONObject jsonObject = null;			
		jsonObject = JSONObject.parseObject(s);			
		if (null != jsonObject) {				
				int subscribe=jsonObject.getIntValue("subscribe");				
				if(0==subscribe){//未关注
					return false;
				}else{//已关注
					return true;
				}			
		}else{
			return false;
		}
	}
		
		public static void main(String[] args) {
			WXTokenResult a = null;
			WXJsapiTicketResult b = null;
			try {
				a = getAccessToken("wx35eed173d89a147d","c740349f70f66175f9594fbb3a48e129");
				b = jsapiTicket(a.getAccess_token());
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			getOpenId();
//			openAouth();
//			isFollow();
			System.out.println(JSONObject.toJSON(a));
			System.out.println(JSONObject.toJSON(b));
		}

}
