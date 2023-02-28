package com.doongie.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.jsp.bo.SellerBO;
import com.doongie.test.jsp.model.Seller;

@Controller
@RequestMapping("/jsp/seller")
public class SellerController {
	
	@Autowired
	private SellerBO sellerBO;
	
	
	@PostMapping("/add")
	@ResponseBody
	public String addSeller(
			@RequestParam("nickname") String nickname
			, @RequestParam("profileImage")  String profileImage
			, @RequestParam("temperature")  double temperature) {
		
		
		int count = sellerBO.addSeller(nickname, profileImage, temperature);
		
		return "삽입결과 : " + count;
	
	}
	
	@GetMapping("/input")
	public String sellerInput() {
		return "jsp/sellerInput";
	}
	
	@GetMapping("/info")
	public String sellerInfo(@RequestParam(value="id", required=false) Integer id, Model model) {
		
		// id 파라미터가 있으면 id로 조회한 결과 보여주기
		if (id != null) {
			Seller seller = sellerBO.getSeller(id);
			
			model.addAttribute("seller", seller);
		} else {
			Seller seller = sellerBO.getLastSeller();
			
			model.addAttribute("seller", seller);
			
		}
		
		return "jsp/sellerInfo";
		
	}
	
	
}
