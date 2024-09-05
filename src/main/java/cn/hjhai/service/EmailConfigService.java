package cn.hjhai.service;

import cn.hjhai.pojo.EmailConfig;
import org.springframework.stereotype.Service;

@Service
public interface EmailConfigService {
    EmailConfig getemail();
    Integer updateemail(EmailConfig emailConfig);
}
