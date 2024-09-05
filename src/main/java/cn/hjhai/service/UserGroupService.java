package cn.hjhai.service;

import org.springframework.stereotype.Service;

import cn.hjhai.pojo.UserGroup;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/20 14:12
 */
@Service
public interface UserGroupService {

    UserGroup useridgetusergroup(Integer userid);

    UserGroup idgetusergroup(Integer id);

    Integer addusergroup(UserGroup userGroup);

    Integer updateusergroup(UserGroup userGroup);

    Integer updateusergroupdefault(Integer groupid);

    Integer deleusergroup(Integer userid);

}
