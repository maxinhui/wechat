package top.builbu.business.user.entity;  

import java.util.Date;      
  
public class Role {  
	    /**
	     *
	     *角色id
	    **/
        private Integer roleId;  
	    /**
	     *
	     *角色名
	    **/
        private String roleName;  
	    /**
	     *
	     *角色标示
	    **/
        private String roleSys;  
	    /**
	     *
	     *权限id
	    **/
        private String permissionId;  
          
          
        
        public Integer getRoleId(){  
            return this.roleId;  
        }  
       
        public void setRoleId(Integer roleId){            
            this.roleId = roleId;
        }  
          
                 
        
        public String getRoleName(){  
            return this.roleName;  
        }  
       
        public void setRoleName(String roleName){            
            this.roleName = roleName == null ? "" : roleName.trim();
        }  
          
                 
        
        public String getRoleSys(){  
            return this.roleSys;  
        }  
       
        public void setRoleSys(String roleSys){            
            this.roleSys = roleSys == null ? "" : roleSys.trim();
        }  
          
                 
        
        public String getPermissionId(){  
            return this.permissionId;  
        }  
       
        public void setPermissionId(String permissionId){            
            this.permissionId = permissionId == null ? "" : permissionId.trim();
        }  
          
                 
}  

