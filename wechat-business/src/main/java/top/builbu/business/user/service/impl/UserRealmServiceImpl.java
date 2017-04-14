package top.builbu.business.user.service.impl;


import java.util.Set;

import lombok.extern.slf4j.Slf4j;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import top.builbu.business.user.dto.UserDTO;
import top.builbu.business.user.repository.UserMapper;
import top.builbu.common.dto.UserCode;
@Slf4j  
@Service
public class UserRealmServiceImpl extends AuthorizingRealm {

	    @Autowired
	    private UserMapper userMapper;
	
		@Override
		protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
			 String username = (String) principals.getPrimaryPrincipal();  
			  log.info(username);
		        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo(); 
		        
		        
		        return authorizationInfo;  
		}

		
		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
			 UsernamePasswordToken token = (UsernamePasswordToken)authcToken;  
			 String loginName = String.valueOf(token.getUsername());
			 String passWord = String.valueOf(token.getPassword());
			 UserDTO resultDTO = userMapper.login(loginName, passWord);
			 log.info(resultDTO.getLoginName());
			 if (resultDTO == null) {  
		            throw new UnknownAccountException();//没找到帐号  
		        }  
			 
			  //交给AuthenticatingRealm使用CredentialsMatcher进行密码匹配，如果觉得人家的不好可以自定义实现  
		        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(  
		        		resultDTO.getLoginName(), //用户名  
		        		resultDTO.getPassword(), //密码  
		                getName()  //realm name  
		        );
		        this.setSession(UserCode.LOGINUSER, resultDTO);
		        return authenticationInfo; 
			
		}  
	  
	
		/** 
	     * 将一些数据放到ShiroSession中,以便于其它地方使用 
	     * @see  比如Controller,使用时直接用HttpSession.getAttribute(key)就可以取到 
	     */  
	    private void setSession(Object key, Object value){  
	        Subject currentUser = SecurityUtils.getSubject();  
	        if(null != currentUser){  
	            Session session = currentUser.getSession();  
	            System.out.println("Session默认超时时间为[" + session.getTimeout() + "]毫秒");  
	            if(null != session){  
	                session.setAttribute(key, value);  
	            }  
	        }  
	    } 
	  
	}

