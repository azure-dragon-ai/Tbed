package cn.hjhai.service;

import com.alibaba.fastjson.JSONArray;

import cn.hjhai.pojo.Album;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-12-18 22:15
 */
@Service
public interface AlbumService {

    JSONArray getAlbumList(JSONArray array);

    Album selectAlbum(Album album);

    Integer addAlbum(Album album);

    Integer deleteAlbum(String albumkey);

    List<Album> selectAlbumURLList(Album album);

    Integer selectAlbumCount(Integer userid);

    Integer updateAlbum(Album album);
}
