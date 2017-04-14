package top.builbu.business.wechat.service;

import top.builbu.business.wechat.dto.UserWxConfigDTO;
import top.builbu.business.wechat.entity.UserWxConfig;
import top.builbu.common.dto.PageDTO;
import top.builbu.common.dto.ResultDO;
import top.builbu.common.util.page.Pagination;

public interface UserWxConfigService{
     
     PageDTO<UserWxConfigDTO> selectByList(UserWxConfigDTO dto, Pagination page);
     
     ResultDO<UserWxConfig> selectById(Integer id);
     
     ResultDO<?> save(UserWxConfigDTO dto);

     ResultDO<?> update(UserWxConfigDTO dto);
     
     ResultDO<?> deleteById(Integer id);
     
     ResultDO<?> deleteByCheck(Integer[] delids);
}
