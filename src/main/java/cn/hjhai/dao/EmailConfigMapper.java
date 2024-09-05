package cn.hjhai.dao;

import cn.hjhai.pojo.EmailConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmailConfigMapper {
    EmailConfig getemail();
    Integer updateemail(EmailConfig emailConfig);
}
