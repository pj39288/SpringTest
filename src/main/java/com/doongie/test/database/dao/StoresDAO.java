package com.doongie.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.doongie.test.database.model.Stores;


@Repository
public class StoresDAO {
	
	public List<Stores> selectStoresList();

}
