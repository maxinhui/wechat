package top.builbu.business.user.service;

import top.builbu.business.user.dto.UserDTO;
import top.builbu.business.user.entity.User;
import top.builbu.common.dto.PageDTO;
import top.builbu.common.dto.ResultDO;
import top.builbu.common.util.page.Pagination;

public interface UserService{
     
     PageDTO<UserDTO> selectByList(UserDTO dto, Pagination page);
     
     ResultDO<User> selectById(Long id);
     
     ResultDO<?> save(UserDTO dto);

     ResultDO<?> update(UserDTO dto);
     
     ResultDO<?> deleteById(Long id);
     
     ResultDO<?> deleteByCheck(Long[] delids);
}
