package top.builbu.business.wechat.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public interface WeChatService {

	/**
	 * 微信推送事件处理
	 * @param dataMap
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws Exception 
	 */
	String EventManage(Map<String, Object> dataMap)
			throws Exception;

}
