package com.doongie.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.jsp.dao.RealtorDAO;
import com.doongie.test.jsp.model.Realtor;

@Service
public class RealtorBO {

	@Autowired
	private RealtorDAO realtorDAO;
	
	public int addRealtor(String office, String phoneNumber, String address, String grade) {
		
		return realtorDAO.insertRealtor(office, phoneNumber, address, grade);
	}
	
	public Realtor getLastRealtor() {
		
		return realtorDAO.selectLastRealtor();
	}
}
