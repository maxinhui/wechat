package top.builbu.business.wechat.repository;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.builbu.business.wechat.dto.UserWxConfigDTO;
import top.builbu.business.wechat.entity.UserWxConfig;

@Repository
public interface UserWxConfigMapper {

    /**
     * 列表
     * @param dto
     * @return
     */
    List<UserWxConfigDTO> selectByList(@Param("dto")UserWxConfigDTO dto,@Param("offset")Integer offset,@Param("limit")Integer limit);
    
    /**
     *主键查询
     *
     */
    UserWxConfig selectByPrimaryKey(Integer id); 

   
    /**
     *主键查询
     *
     */
    int deleteByPrimaryKey(Integer id); 

      
    /**
     *插入
     *
     */
    int insert(UserWxConfig record); 
      
    /**
     * 修改
     *
     */  
    int updateByPrimaryKey(UserWxConfig record);  
    
    /**
     * 批量删除
     *
     */  
    int deleteByAll(@Param("delids")Integer[] delids);
    
    int selectByCount(@Param("dto")UserWxConfigDTO dto);

}
