package com.doongie.test.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.mybatis.bo.RealEstateBO;
import com.doongie.test.mybatis.model.RealEstate;

@Controller
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO; 
	
	@RequestMapping("/mybatis/test01")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		
		return realEstate;
		
	}

}
