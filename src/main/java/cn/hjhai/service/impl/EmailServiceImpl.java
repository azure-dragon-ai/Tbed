package cn.hjhai.service.impl;

import cn.hjhai.dao.EmailConfigMapper;
import cn.hjhai.pojo.EmailConfig;
import cn.hjhai.service.EmailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailConfigService {
    @Autowired
    EmailConfigMapper emailConfigMapper;

    @Override
    public EmailConfig getemail() {
        return emailConfigMapper.getemail();
    }

    @Override
    public Integer updateemail(EmailConfig emailConfig) {
        return emailConfigMapper.updateemail(emailConfig);
    }
}
