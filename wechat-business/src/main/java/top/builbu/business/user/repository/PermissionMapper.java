package top.builbu.business.user.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.builbu.business.user.dto.PermissionDTO;
import top.builbu.business.user.entity.Permission;

@Repository
public interface PermissionMapper {

    /**
     * 列表
     * @param dto
     * @return
     */
    List<PermissionDTO> selectByList(@Param("dto")PermissionDTO dto,@Param("offset")Integer offset,@Param("limit")Integer limit);
    
    /**
     *主键查询
     *
     */
    Permission selectByPrimaryKey(Long permission_id); 

   
    /**
     *主键查询
     *
     */
    int deleteByPrimaryKey(Long permission_id); 

      
    /**
     *插入
     *
     */
    int insert(Permission record); 
      
    /**
     * 修改
     *
     */  
    int updateByPrimaryKey(Permission record);  
    
    /**
     * 批量删除
     *
     */  
    int deleteByAll(@Param("delids")Long[] delids);
    
    int selectByCount(@Param("dto")PermissionDTO dto);

}
