package top.builbu.business.wechat.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.BeanUtils;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import top.builbu.common.util.page.Pagination;
import top.builbu.common.dto.PageDTO;
import top.builbu.common.dto.BaseResultCode;
import top.builbu.common.dto.ResultDO;
import top.builbu.business.wechat.dto.UserWxConfigDTO;
import top.builbu.business.wechat.entity.UserWxConfig;
import top.builbu.business.wechat.service.UserWxConfigService;
import top.builbu.business.wechat.repository.UserWxConfigMapper;
@Slf4j
@Service
public class UserWxConfigServiceImpl implements UserWxConfigService{
 
    @Autowired
	private UserWxConfigMapper userWxConfigMapper;
	
	
	@Override
	public PageDTO<UserWxConfigDTO> selectByList(UserWxConfigDTO dto,Pagination page ){
	    PageDTO<UserWxConfigDTO> pageDo = new PageDTO<UserWxConfigDTO>();
	    List<UserWxConfigDTO> result = userWxConfigMapper.selectByList(dto,page.getCurrentResult(),page.getPageSize());
		if(null!=result&&result.size()>0){
		    pageDo.setList(result);
		   
		}
		 pageDo.setPageCurrent(page.getPageCurrent());
		 pageDo.setPageSize(page.getPageSize());
		 pageDo.setTotal(userWxConfigMapper.selectByCount(dto));
		return pageDo;
	}
	
    @Override
	public ResultDO<UserWxConfig> selectById(Integer id){
	    ResultDO<UserWxConfig> resultDo = null;
	    if(null!=id&&!"".equals(id)){
	        UserWxConfig result = userWxConfigMapper.selectByPrimaryKey(id);
	        if(null!=result){
	            resultDo = new ResultDO<>(result);
	        }else{
	            resultDo = new ResultDO<>(BaseResultCode.COMMON_NO_DATA,Boolean.FALSE);
	        }
	    }else{
	        resultDo = new ResultDO<>(BaseResultCode.COMMON_WRONG_PARAMS,Boolean.FALSE);
	    }
	    return resultDo;
	}
	
    @Override
    public ResultDO<?> save(UserWxConfigDTO dto){
    	ResultDO<?> result = null;
    	UserWxConfig record = new UserWxConfig(); 
    	BeanUtils.copyProperties(dto, record);
    	Integer rowId = userWxConfigMapper.insert(record);
    	if(null != rowId && rowId > 0){
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_CHENGGONG,Boolean.TRUE);
    		result.setTabid("userWxConfigList");
    	}else{
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_LOSE,Boolean.FALSE);
    		result.setCloseCurrent(Boolean.FALSE);
    	}
    	return result;
    }
    
    @Override
    public ResultDO<?> update(UserWxConfigDTO dto){
    	ResultDO<?> result = null;
    	UserWxConfig record = new UserWxConfig();
    	BeanUtils.copyProperties(dto, record);
    	Integer rowId = userWxConfigMapper.updateByPrimaryKey(record);
    	if(null != rowId && rowId > 0){
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_CHENGGONG,Boolean.TRUE);
    		result.setTabid("userWxConfigList");
    	}else{
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_LOSE,Boolean.FALSE);
    		result.setCloseCurrent(Boolean.FALSE);
    	}
    	return result;
    }
    
    @Override
    public ResultDO<?> deleteById(Integer id){
    	ResultDO<?> result = null;
    	Integer rowId = userWxConfigMapper.deleteByPrimaryKey(id);
    	if(null != rowId && rowId > 0){
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_CHENGGONG,Boolean.TRUE);
    	}else{
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_LOSE,Boolean.FALSE);
    	}
    	return result;
    }
    
    @Override
    public ResultDO<?> deleteByCheck(Integer[] delids){
    	ResultDO<?> result = null;
    	Integer rowId = userWxConfigMapper.deleteByAll(delids);
    	if(null != rowId && rowId > 0){
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_CHENGGONG,Boolean.TRUE);
    	}else{
    		result = new ResultDO<>(BaseResultCode.COMMON_MESSAGE_LOSE,Boolean.FALSE);
    		result.setCloseCurrent(Boolean.FALSE);
    	}
    	return result;
    }
}
