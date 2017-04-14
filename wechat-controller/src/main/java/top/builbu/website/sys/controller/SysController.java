package top.builbu.website.sys.controller;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;



@Slf4j
@Controller
@RequestMapping("/sys")
public class SysController {

	private final String localhostUrl="http://localhost/wechat-controller/";
	
	@RequestMapping("/loginLoad")
	public String loginLoad(String name,String pwd){
		log.info("for:loginindex");
		
		return "/login/login";
	}
	
	@RequestMapping("/forLoad")
	public String forLoad(String html){
		log.info("for:"+html);
		return html;
	}
	
	

}
