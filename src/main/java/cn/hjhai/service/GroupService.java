package cn.hjhai.service;

import org.springframework.stereotype.Service;

import cn.hjhai.pojo.Group;
import cn.hjhai.pojo.Msg;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/19 16:29
 */
@Service
public interface GroupService {
    List<Group> grouplist(Integer usertype);
    Group idgrouplist(Integer id);
    Msg addgroup(Group group);
    Integer GetCountFroUserType(Integer usertype);
    Msg delegroup(Integer id);
    Msg setgroup(Group group);
    Group getGroupFroUserType(Integer usertype);
}
