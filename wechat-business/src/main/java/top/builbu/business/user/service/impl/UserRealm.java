package top.builbu.business.user.service.impl;


	import java.util.Set;

	import org.apache.shiro.authc.AuthenticationException;
	import org.apache.shiro.authc.AuthenticationInfo;
	import org.apache.shiro.authc.AuthenticationToken;
	import org.apache.shiro.authc.LockedAccountException;
	import org.apache.shiro.authc.SimpleAuthenticationInfo;
	import org.apache.shiro.authc.UnknownAccountException;
	import org.apache.shiro.authz.AuthorizationInfo;
	import org.apache.shiro.authz.SimpleAuthorizationInfo;
	import org.apache.shiro.realm.AuthorizingRealm;
	import org.apache.shiro.subject.PrincipalCollection;

	import org.springframework.beans.factory.annotation.Autowired;
	   
	public class UserRealm extends AuthorizingRealm {

		@Override
		protected AuthorizationInfo doGetAuthorizationInfo(
				PrincipalCollection principals) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		protected AuthenticationInfo doGetAuthenticationInfo(
				AuthenticationToken token) throws AuthenticationException {
			// TODO Auto-generated method stub
			return null;
		}  
	  
	
	  
	}
