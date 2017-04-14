package top.builbu.business.user.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.builbu.business.user.dto.RoleDTO;
import top.builbu.business.user.entity.Role;

@Repository
public interface RoleMapper {

    /**
     * 列表
     * @param dto
     * @return
     */
    List<RoleDTO> selectByList(@Param("dto")RoleDTO dto,@Param("offset")Integer offset,@Param("limit")Integer limit);
    
    /**
     *主键查询
     *
     */
    Role selectByPrimaryKey(Integer role_id); 

   
    /**
     *主键查询
     *
     */
    int deleteByPrimaryKey(Integer role_id); 

      
    /**
     *插入
     *
     */
    int insert(Role record); 
      
    /**
     * 修改
     *
     */  
    int updateByPrimaryKey(Role record);  
    
    /**
     * 批量删除
     *
     */  
    int deleteByAll(@Param("delids")Integer[] delids);
    
    int selectByCount(@Param("dto")RoleDTO dto);

}
