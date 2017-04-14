package top.builbu.business.user.dto;  

import java.util.Date;      
  
public class MemberDTO {  
	    /**
	     *
	     *会员id
	    **/
        private Long memberId;  
	    /**
	     *
	     *openId
	    **/
        private String openId;  
	    /**
	     *
	     *昵称
	    **/
        private String nickName;  
	    /**
	     *
	     *头像
	    **/
        private String icons;  
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
	     *创建时间
	    **/
        private Date createByDate;  
	    /**
	     *
	     *会员状态
	    **/
        private Integer onLineStatus;  
	    /**
	     *
	     *修改时间
	    **/
        private Date updateByDate;  
	    /**
	     *
	     *是否关注
	    **/
        private Integer isCon;  
	    /**
	     *
	     *所属单位token
	    **/
        private String parmToken;  
          
          
        public Long getMemberId(){  
            return this.memberId;  
        }  
       
        public void setMemberId(Long memberId){  
            this.memberId = memberId;
        } 
         
        public String getOpenId(){  
            return this.openId;  
        }  
       
        public void setOpenId(String openId){  
            this.openId = openId == "" ? null : openId.trim();
        } 
         
        public String getNickName(){  
            return this.nickName;  
        }  
       
        public void setNickName(String nickName){  
            this.nickName = nickName == "" ? null : nickName.trim();
        } 
         
        public String getIcons(){  
            return this.icons;  
        }  
       
        public void setIcons(String icons){  
            this.icons = icons == "" ? null : icons.trim();
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
         
        public Date getCreateByDate(){  
            return this.createByDate;  
        }  
       
        public void setCreateByDate(Date createByDate){  
            this.createByDate = createByDate;
        } 
         
        public Integer getOnLineStatus(){  
            return this.onLineStatus;  
        }  
       
        public void setOnLineStatus(Integer onLineStatus){  
            this.onLineStatus = onLineStatus;
        } 
         
        public Date getUpdateByDate(){  
            return this.updateByDate;  
        }  
       
        public void setUpdateByDate(Date updateByDate){  
            this.updateByDate = updateByDate;
        } 
         
        public Integer getIsCon(){  
            return this.isCon;  
        }  
       
        public void setIsCon(Integer isCon){  
            this.isCon = isCon;
        } 
         
        public String getParmToken(){  
            return this.parmToken;  
        }  
       
        public void setParmToken(String parmToken){  
            this.parmToken = parmToken == "" ? null : parmToken.trim();
        } 
         
}  