package top.builbu.business.user.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.builbu.business.user.dto.UserDTO;
import top.builbu.business.user.entity.User;

@Repository
public interface UserMapper {

    /**
     * 列表
     * @param dto
     * @return
     */
    List<UserDTO> selectByList(@Param("dto")UserDTO dto,@Param("offset")Integer offset,@Param("limit")Integer limit);
    
    /**
     *主键查询
     *
     */
    User selectByPrimaryKey(Long user_Id); 

   
    /**
     *主键查询
     *
     */
    int deleteByPrimaryKey(Long user_Id); 

      
    /**
     *插入
     *
     */
    int insert(User record); 
      
    /**
     * 修改
     *
     */  
    int updateByPrimaryKey(User record);  
    
    /**
     * 批量删除
     *
     */  
    int deleteByAll(@Param("delids")Long[] delids);
    
    int selectByCount(@Param("dto")UserDTO dto);
    
    UserDTO login(@Param("loginName")String loginName,@Param("passWord")String passWord); 

}
