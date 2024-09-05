package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hjhai.pojo.Album;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-12-18 22:15
 */
@Mapper
public interface AlbumMapper {

    Album selectAlbum(Album album);

    Integer addAlbum(Album album);

    Integer deleteAlbum(@Param("albumkey") String albumkey);

    List<Album> selectAlbumURLList(Album album);

    Integer selectAlbumCount(@Param("userid")  Integer userid);

    Integer updateAlbum(Album album);
}
