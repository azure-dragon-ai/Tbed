package cn.hjhai.service;

import cn.hjhai.pojo.Imgreview;
import org.springframework.stereotype.Service;

@Service
public interface ImgreviewService {
    int deleteByPrimaryKey(Integer id);

    int insert(Imgreview record);

    int insertSelective(Imgreview record);

    Imgreview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Imgreview record);

    int updateByPrimaryKey(Imgreview record);

    Imgreview selectByusing(Integer using);

}
