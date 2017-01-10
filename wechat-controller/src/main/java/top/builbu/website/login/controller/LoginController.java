package top.builbu.website.login.controller;

import javax.servlet.http.HttpServletRequest;

import lombok.extern.slf4j.Slf4j;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ThreadContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/sys")
public class LoginController {

	@RequestMapping("/login")
	public String test(String name,String pwd,HttpServletRequest request){
		log.info("for:"+name+"--"+pwd);
		Subject currentUser = SecurityUtils.getSubject();
		
	 
		UsernamePasswordToken token = new UsernamePasswordToken(name,pwd);
		token.setRememberMe(true);
		try {
			
			currentUser.login(token);	
			
		}catch (AuthenticationException e) {
			token.clear();
			
		}
		return "/sys/index";
	}
}
