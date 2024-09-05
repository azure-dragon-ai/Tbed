package cn.hjhai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hjhai.dao.CodeMapper;
import cn.hjhai.pojo.Code;
import cn.hjhai.service.CodeService;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-08-11 14:21
 */
@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeMapper codeMapper;

    @Override
    public List<Code> selectCode(String value) {
        return codeMapper.selectCode(value);
    }

    @Override
    public Code selectCodekey(String code) {
        return codeMapper.selectCodekey(code);
    }

    @Override
    public Integer addCode(Code code) {
        return codeMapper.addCode(code);
    }

    @Override
    public Integer deleteCode(String code) {
        return codeMapper.deleteCode(code);
    }
}
