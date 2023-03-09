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
}
