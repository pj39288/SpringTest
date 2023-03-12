package com.doongie.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.ajax.dao.FavoriteDAO;
import com.doongie.test.ajax.model.Favorite;

@Service
public class FavoriteBO {
	
	@Autowired
	public FavoriteDAO favoriteDAO;
	
	
	public List<Favorite> getFavoriteList(){
		
		return favoriteDAO.selectFavoriteList();
		
	}
	
	public int addFavorite(String name, String url) {
		return favoriteDAO.insertFavorite(name, url);
	}
	
	
	
	// 중복된 거 체크하는 함수
	public boolean isDuplicateUrl(String url) {
		
		int count = favoriteDAO.selectCountUrl(url);
		
		if(count == 0 ) {
			return false;
		} else {
			return true;
		}
		
		// return count != 0;
	}
	
	public int deleteFavorite(int id) {
		return favoriteDAO.deleteFavorite(id);
	}
}
