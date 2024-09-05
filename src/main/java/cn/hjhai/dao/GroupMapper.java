package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hjhai.pojo.Group;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/19 16:11
 */
@Mapper
public interface GroupMapper {
    List<Group> grouplist(Integer usertype);
    Group idgrouplist(@Param("id") Integer id);
    Integer addgroup(Group group);
    Integer GetCountFroUserType(@Param("usertype") Integer usertype);
    Integer delegroup(@Param("id") Integer id);
    Integer setgroup(Group group);
    Group getGroupFroUserType(@Param("usertype") Integer usertype);
}
