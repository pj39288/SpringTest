package com.doongie.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.database.bo.StoresBO;
import com.doongie.test.database.model.Stores;

@Controller
public class StoresController {
	
	@Autowired
	private StoresBO storesBO;
	
	@RequestMapping("/database/test01")
	@ResponseBody
	public List<Stores> test01(){
		
		List<Stores> storesList = storesBO.getStoresList();
		
		return storesList;
	}
	

}
