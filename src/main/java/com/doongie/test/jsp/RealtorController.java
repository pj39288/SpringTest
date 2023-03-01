package com.doongie.test.jsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.jsp.bo.RealtorBO;
import com.doongie.test.jsp.model.Realtor;

@Controller
@RequestMapping("/jsp/realtor")
public class RealtorController {
	
	@Autowired
	private RealtorBO realtorBO;

	@PostMapping("/add")
	@ResponseBody
	public String addRealtor(
			@RequestParam("office") String office
			, @RequestParam("phoneNumber") String phoneNumber
			, @RequestParam("address") String address
			, @RequestParam("grade") String grade) {
		
		int count = realtorBO.addRealtor(office, phoneNumber, address, grade);
		
		return "입력완료 : " + count;
	}
	
	
	@GetMapping("/input")
	public String realtorInput() {
		
		return "jsp/realtorInput";
	}
	
	@GetMapping("/info")
	public String realtorInfo(Model model) {
		
		Realtor realtor = realtorBO.getLastRealtor();
		
		model.addAttribute("realtor", realtor);
		
		return "jsp/realtorInfo";
	}
}
