package top.builbu.business.user.repository;

import org.springframework.stereotype.Repository;

import top.builbu.business.user.entity.Rolepermission;
@Repository
public interface RolepermissionMapper {
    int insert(Rolepermission record);

    int insertSelective(Rolepermission record);
}