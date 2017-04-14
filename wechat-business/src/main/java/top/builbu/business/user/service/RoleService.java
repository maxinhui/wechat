package top.builbu.business.user.service;

import top.builbu.business.user.dto.RoleDTO;
import top.builbu.business.user.entity.Role;
import top.builbu.common.dto.PageDTO;
import top.builbu.common.dto.ResultDO;
import top.builbu.common.util.page.Pagination;

public interface RoleService{
     
     PageDTO<RoleDTO> selectByList(RoleDTO dto, Pagination page);
     
     ResultDO<Role> selectById(Integer id);
     
     ResultDO<?> save(RoleDTO dto);

     ResultDO<?> update(RoleDTO dto);
     
     ResultDO<?> deleteById(Integer id);
     
     ResultDO<?> deleteByCheck(Integer[] delids);
}
