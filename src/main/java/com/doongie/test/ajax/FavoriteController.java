package com.doongie.test.ajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.doongie.test.ajax.bo.FavoriteBO;

@Controller
public class FavoriteController {

	@Autowired
	private FavoriteBO favoriteBO;
	

}
