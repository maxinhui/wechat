package top.builbu.business.wechat.entity;  

import java.util.Date;      
  
public class UserWxConfig {  
	    /**
	     *
	     *主键id
	    **/
        private Integer id;  
	    /**
	     *
	     *app
	    **/
        private String appId;  
	    /**
	     *
	     *app
	    **/
        private String appSecret;  
	    /**
	     *
	     *接入验证token
	    **/
        private String token;  
	    /**
	     *
	     *支付key
	    **/
        private String payKey;  
	    /**
	     *
	     *创建时间
	    **/
        private Date createTime;  
	    /**
	     *
	     *修改时间
	    **/
        private Date updateTime;  
	    /**
	     *
	     *创建者id
	    **/
        private Long createId;  
	    /**
	     *
	     *修改者id
	    **/
        private Long updateId;  
	    /**
	     *
	     *标识
	    **/
        private String pramToken;  
          
          
        
        public Integer getId(){  
            return this.id;  
        }  
       
        public void setId(Integer id){            
            this.id = id;
        }  
          
                 
        
        public String getAppId(){  
            return this.appId;  
        }  
       
        public void setAppId(String appId){            
            this.appId = appId == null ? "" : appId.trim();
        }  
          
                 
        
        public String getAppSecret(){  
            return this.appSecret;  
        }  
       
        public void setAppSecret(String appSecret){            
            this.appSecret = appSecret == null ? "" : appSecret.trim();
        }  
          
                 
        
        public String getToken(){  
            return this.token;  
        }  
       
        public void setToken(String token){            
            this.token = token == null ? "" : token.trim();
        }  
          
                 
        
        public String getPayKey(){  
            return this.payKey;  
        }  
       
        public void setPayKey(String payKey){            
            this.payKey = payKey == null ? "" : payKey.trim();
        }  
          
                 
        
        public Date getCreateTime(){  
            return this.createTime;  
        }  
       
        public void setCreateTime(Date createTime){            
            this.createTime = createTime;
        }  
          
                 
        
        public Date getUpdateTime(){  
            return this.updateTime;  
        }  
       
        public void setUpdateTime(Date updateTime){            
            this.updateTime = updateTime;
        }  
          
                 
        
        public Long getCreateId(){  
            return this.createId;  
        }  
       
        public void setCreateId(Long createId){            
            this.createId = createId;
        }  
          
                 
        
        public Long getUpdateId(){  
            return this.updateId;  
        }  
       
        public void setUpdateId(Long updateId){            
            this.updateId = updateId;
        }  
          
                 
        
        public String getPramToken(){  
            return this.pramToken;  
        }  
       
        public void setPramToken(String pramToken){            
            this.pramToken = pramToken == null ? "" : pramToken.trim();
        }  
          
                 
}  

