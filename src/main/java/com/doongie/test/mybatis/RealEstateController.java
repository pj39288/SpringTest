package com.doongie.test.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.mybatis.bo.RealEstateBO;
import com.doongie.test.mybatis.model.RealEstate;

@Controller
@RequestMapping("/mybatis")
public class RealEstateController {
	
	@Autowired
	private RealEstateBO realEstateBO; 
	
	// 전달받은 id와 일치하는 데이터를 json으로 response추가
	@RequestMapping("/test01/1")
	@ResponseBody
	public RealEstate realEstate(@RequestParam("id") int id) {
		
		RealEstate realEstate = realEstateBO.getRealEstate(id);
		
		return realEstate;
		
	}
	
	// 전달받은 월세금액보다 낮은 매물 정보를 json으로 response에 담기
	@RequestMapping("/test01/2")
	@ResponseBody
	public List<RealEstate> realEstateByRentPrice(@RequestParam("rentPrice") int rentPrice) {
		
		List<RealEstate> realEstateList = realEstateBO.getRealEstateListByRentPrice(rentPrice);
		
		return realEstateList;
	}
	
	@RequestMapping("/test01/3")
	@ResponseBody
	public List<RealEstate> realEstateByAreaPrice(
			@RequestParam("area") int area
			, @RequestParam("price") int price) {
		
		List<RealEstate> realEstateList = realEstateBO.getRealEstateListByAreaPrice(area, price);
		
		return realEstateList;
	}
	
	// 객체로 insert
	@RequestMapping("/test02/1")
	@ResponseBody
	public String addRealEstateByObject() {
		
		RealEstate realEstate = new RealEstate();
		realEstate.setRealtorId(3);
		realEstate.setAddress("푸르지오 리버 303동 1104호");
		realEstate.setArea(89);
		realEstate.setType("매매");
		realEstate.setPrice(100000);
		
		int count = realEstateBO.addRealEstateByObject(realEstate);

		return ("입력 성공 : " + count);
	}
	
	
	// field로 insert
	@RequestMapping("/test02/2")
	@ResponseBody
	public String addRealEstate(@RequestParam("realtorId") int realtorId) {
		
		int count = realEstateBO.addRealEstate(realtorId, "썅떼빌리버 오피스텔 814호", 45, "월세", 100000, 120);
		
		return ("입력 성공 : " + count);
		
	}
	

}
