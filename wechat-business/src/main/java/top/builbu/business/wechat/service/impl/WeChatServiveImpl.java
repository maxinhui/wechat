package top.builbu.business.wechat.service.impl;

import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import top.builbu.business.wechat.service.WeChatService;
import top.builbu.core.wechat.entity.WXEventResult;

@Slf4j
@Service
public class WeChatServiveImpl implements WeChatService {
           
	
	/**
	 * 微信推送事件处理
	 * @throws Exception 
	 */
	@Override
	public String EventManage(Map<String,Object> dataMap) throws Exception {
		WXEventResult eventResult = null;
		if(null != dataMap){
			eventResult = JSONObject.parseObject(JSONObject.toJSONString(dataMap), WXEventResult.class);
			
			log.info(JSONObject.toJSONString(eventResult)+"---");
			
			
		}
		return "";
	}
}
