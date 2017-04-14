package top.builbu.business.user.service;

import top.builbu.business.user.dto.PermissionDTO;
import top.builbu.business.user.entity.Permission;
import top.builbu.common.dto.PageDTO;
import top.builbu.common.dto.ResultDO;
import top.builbu.common.util.page.Pagination;

public interface PermissionService{
     
     PageDTO<PermissionDTO> selectByList(PermissionDTO dto, Pagination page);
     
     ResultDO<Permission> selectById(Long id);
     
     ResultDO<?> save(PermissionDTO dto);

     ResultDO<?> update(PermissionDTO dto);
     
     ResultDO<?> deleteById(Long id);
     
     ResultDO<?> deleteByCheck(Long[] delids);
}
