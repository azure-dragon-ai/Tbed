package cn.hjhai.dao;

import cn.hjhai.pojo.Code;
import cn.hjhai.pojo.Keys;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CodeMapper {
    List<Code> selectCode(@Param("code") String code);
    Code selectCodekey(@Param("code") String code);
    Integer addCode(Code code);
    Integer deleteCode(@Param("code") String code);

}
