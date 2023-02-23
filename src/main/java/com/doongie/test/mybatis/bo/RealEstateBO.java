package com.doongie.test.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.doongie.test.mybatis.dao.RealEstateDAO;
import com.doongie.test.mybatis.model.RealEstate;

@Service
public class RealEstateBO {

	@Autowired
	private RealEstateDAO realEstateDAO;
	
	public RealEstate getRealEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateDAO.selectRealEstate(id);
		
		return realEstate;
	}
}
