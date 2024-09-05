package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hjhai.pojo.UserGroup;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/20 13:45
 */
@Mapper
public interface UserGroupMapper {
    UserGroup useridgetusergroup(@Param("userid") Integer userid);
    UserGroup idgetusergroup(@Param("id") Integer id);
    Integer addusergroup(UserGroup userGroup);
    Integer updateusergroup(UserGroup userGroup);
    Integer updateusergroupdefault(@Param("groupid") Integer groupid);
    Integer deleusergroup(@Param("userid") Integer userid);



}
