package top.builbu.website.login.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import top.builbu.business.user.dto.UserDTO;
import top.builbu.business.user.service.UserService;
import top.builbu.common.dto.BaseResultCode;
import top.builbu.common.dto.ResultCode;
import top.builbu.common.dto.ResultDO;
import top.builbu.common.dto.UserCode;

@Slf4j
@Controller
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
	private UserService userService;
	
	
	
	
	@RequestMapping("/loginIng")
	public String loginIng(String name,String pwd,HttpServletRequest request){
		log.info("for:"+name+"--"+pwd);
		Subject currentUser = SecurityUtils.getSubject();
		ResultDO<UserDTO> result = null;
	 
		UsernamePasswordToken token = new UsernamePasswordToken(name,pwd);
		token.setRememberMe(true);
		try {
			
			currentUser.login(token);	
			String userID = (String) currentUser.getPrincipal();
			log.info("userID:"+userID);
			result = new ResultDO<>(BaseResultCode.TRUE,Boolean.TRUE);  
		} catch (UnknownAccountException uae) {  
            result = new ResultDO<>(BaseResultCode.COMMON_NO_USER,Boolean.FALSE);  
        } catch (IncorrectCredentialsException ice) {  
        	result = new ResultDO<>(BaseResultCode.COMMON_NO_USER,Boolean.FALSE);   
        }  catch (AuthenticationException e) {
        	result = new ResultDO<>(BaseResultCode.COMMON_NO_USER,Boolean.FALSE);  
			token.clear();	
		}
		if(result.isSuccess()){
			result.setModule((UserDTO)currentUser.getSession().getAttribute(UserCode.LOGINUSER));
			request.setAttribute(ResultCode.RESULTDATA,result);
			log.info("for:index 登录成功");
			return "/system/index";
		}else{
			request.setAttribute(ResultCode.RESULTDATA,result);
			log.info("for:login 登录失败");
			return "/login/login";
		}
		
	}
	

	

	

}
