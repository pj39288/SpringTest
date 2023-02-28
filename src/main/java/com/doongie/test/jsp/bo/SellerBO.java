package com.doongie.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.jsp.dao.SellerDAO;
import com.doongie.test.jsp.model.Seller;

@Service
public class SellerBO {

	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String profileImage, double temperature) {
		
		return sellerDAO.insertSeller(nickname, profileImage, temperature);
		
	}
	
	public Seller getLastSeller() {
		
		return sellerDAO.selectLastSeller();
	}
	
	public Seller getSeller(int id) {
		return sellerDAO.selectSeller(id); 
	}
}
