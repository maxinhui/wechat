package top.builbu.business.user.repository;

import org.springframework.stereotype.Repository;

import top.builbu.business.user.entity.User;
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}