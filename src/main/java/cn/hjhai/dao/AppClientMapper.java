package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hjhai.pojo.AppClient;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2022-06-10 18:33
 */

@Mapper
public interface AppClientMapper {
    AppClient getAppClientData(@Param("id") String id);

    Integer editAppClientData(AppClient appClient);

}
