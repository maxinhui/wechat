package top.builbu.business.user.dto;  

import java.util.Date;      
  
public class PermissionDTO {  
	    /**
	     *
	     *权限id
	    **/
        private Long permissionId;  
	    /**
	     *
	     *权限名
	    **/
        private String permissionName;  
	    /**
	     *
	     *权限标示
	    **/
        private String permissionSys;  
	    /**
	     *
	     *权限等级
	    **/
        private Integer permissionLevel;  
          
          
        public Long getPermissionId(){  
            return this.permissionId;  
        }  
       
        public void setPermissionId(Long permissionId){  
            this.permissionId = permissionId;
        } 
         
        public String getPermissionName(){  
            return this.permissionName;  
        }  
       
        public void setPermissionName(String permissionName){  
            this.permissionName = permissionName == "" ? null : permissionName.trim();
        } 
         
        public String getPermissionSys(){  
            return this.permissionSys;  
        }  
       
        public void setPermissionSys(String permissionSys){  
            this.permissionSys = permissionSys == "" ? null : permissionSys.trim();
        } 
         
        public Integer getPermissionLevel(){  
            return this.permissionLevel;  
        }  
       
        public void setPermissionLevel(Integer permissionLevel){  
            this.permissionLevel = permissionLevel;
        } 
         
}  