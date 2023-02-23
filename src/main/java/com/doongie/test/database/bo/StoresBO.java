package com.doongie.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.database.dao.StoresDAO;
import com.doongie.test.database.model.Stores;

@Service
public class StoresBO {
	
	@Autowired
	private StoresDAO storesDAO;
	
	public List<Stores> getStoresList() {
		
		List<Stores> storesList = storesDAO.selectStoresList();
		
		return storesList;
	}


}
