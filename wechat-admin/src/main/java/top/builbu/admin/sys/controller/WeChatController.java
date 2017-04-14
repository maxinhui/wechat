package top.builbu.admin.sys.controller;


import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.builbu.business.wechat.service.WeChatService;
import top.builbu.core.wechat.entity.WXEventResult;
import top.builbu.core.wechat.utils.HttpXmlUtils;
import top.builbu.core.wechat.utils.WXSignUtils;

@Log4j
@Controller
@RequestMapping("/weChat")
public class WeChatController {

	@Autowired
	private WeChatService weChatService;
	
	/**
	 * 微信公众号认证
	 * @param response
	 * @param timestamp
	 * @param signature
	 * @param nonce
	 * @param echostr
	 */
	@ResponseBody
	@RequestMapping(value="/authC")
	public String authC(HttpServletRequest request,String timestamp,String signature,String nonce,String echostr,String pram_token){
        log.info(pram_token);
        try {
        	 if("GET".equals(request.getMethod())){
             	log.info("微信接入认证");
     			if(WXSignUtils.checkSignature("ec10c3b0dfd93ffb700abb6a9f41ebbb", timestamp, nonce, signature)){
     				return echostr;
     			}else{
     				return "";
     			}
             }else{
             	Map<String,Object> dataMap = HttpXmlUtils.requestResult(request);
             	return weChatService.EventManage(dataMap);
             }
		} catch (Exception e) {
			return "";
		}
	}
}
