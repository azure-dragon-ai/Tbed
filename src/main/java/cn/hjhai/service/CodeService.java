package cn.hjhai.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import cn.hjhai.pojo.Code;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-08-11 14:20
 */
@Service
public interface CodeService {
    List<Code> selectCode(String value);
    Code selectCodekey(String code);
    Integer addCode(Code code);
    Integer deleteCode(String code);

}
