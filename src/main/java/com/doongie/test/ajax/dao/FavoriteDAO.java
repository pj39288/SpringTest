package com.doongie.test.ajax.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.doongie.test.ajax.model.Favorite;

@Repository
public interface FavoriteDAO {

	public List<Favorite> selectFavoriteList();
	
	public int insertFavorite(
					@Param("name") String name
					, @Param("url") String url);
	
	
	// count 0 또는 1 등 개수만 return받는거니까 int로
	public int selectCountUrl(@Param("url") String url);
	
	
	public int deleteFavorite(@Param("id") int id);
	
}
