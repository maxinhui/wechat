package top.builbu.business.user.dto;  

import java.util.Date;      
  
public class UserDTO {  
	    /**
	     *
	     *管理员id
	    **/
        private Long userId;  
	    /**
	     *
	     *创建时间
	    **/
        private Date createByDate;  
	    /**
	     *
	     *创建者id
	    **/
        private Long createById;  
	    /**
	     *
	     *登录名
	    **/
        private String loginName;  
	    /**
	     *
	     *邮箱
	    **/
        private String email;  
	    /**
	     *
	     *头像
	    **/
        private String icons;  
	    /**
	     *
	     *昵称
	    **/
        private String nickName;  
	    /**
	     *
	     *管理者状态
	    **/
        private Integer onLineStatus;  
	    /**
	     *
	     *密码
	    **/
        private String password;  
	    /**
	     *
	     *手机
	    **/
        private String phone;  
	    /**
	     *
	     *地址
	    **/
        private String address;  
	    /**
	     *
	     *修改时间
	    **/
        private Date updateByDate;  
	    /**
	     *
	     *修改者id
	    **/
        private Long updateById;  
	    /**
	     *
	     *角色id
	    **/
        private String roleId;  
          
          
        public Long getUserId(){  
            return this.userId;  
        }  
       
        public void setUserId(Long userId){  
            this.userId = userId;
        } 
         
        public Date getCreateByDate(){  
            return this.createByDate;  
        }  
       
        public void setCreateByDate(Date createByDate){  
            this.createByDate = createByDate;
        } 
         
        public Long getCreateById(){  
            return this.createById;  
        }  
       
        public void setCreateById(Long createById){  
            this.createById = createById;
        } 
         
        public String getLoginName(){  
            return this.loginName;  
        }  
       
        public void setLoginName(String loginName){  
            this.loginName = loginName == "" ? null : loginName.trim();
        } 
         
        public String getEmail(){  
            return this.email;  
        }  
       
        public void setEmail(String email){  
            this.email = email == "" ? null : email.trim();
        } 
         
        public String getIcons(){  
            return this.icons;  
        }  
       
        public void setIcons(String icons){  
            this.icons = icons == "" ? null : icons.trim();
        } 
         
        public String getNickName(){  
            return this.nickName;  
        }  
       
        public void setNickName(String nickName){  
            this.nickName = nickName == "" ? null : nickName.trim();
        } 
         
        public Integer getOnLineStatus(){  
            return this.onLineStatus;  
        }  
       
        public void setOnLineStatus(Integer onLineStatus){  
            this.onLineStatus = onLineStatus;
        } 
         
        public String getPassword(){  
            return this.password;  
        }  
       
        public void setPassword(String password){  
            this.password = password == "" ? null : password.trim();
        } 
         
        public String getPhone(){  
            return this.phone;  
        }  
       
        public void setPhone(String phone){  
            this.phone = phone == "" ? null : phone.trim();
        } 
         
        public String getAddress(){  
            return this.address;  
        }  
       
        public void setAddress(String address){  
            this.address = address == "" ? null : address.trim();
        } 
         
        public Date getUpdateByDate(){  
            return this.updateByDate;  
        }  
       
        public void setUpdateByDate(Date updateByDate){  
            this.updateByDate = updateByDate;
        } 
         
        public Long getUpdateById(){  
            return this.updateById;  
        }  
       
        public void setUpdateById(Long updateById){  
            this.updateById = updateById;
        } 
         
        public String getRoleId(){  
            return this.roleId;  
        }  
       
        public void setRoleId(String roleId){  
            this.roleId = roleId == "" ? null : roleId.trim();
        } 
         
}  