package com.doongie.test.ajax;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.ajax.bo.BookingBO;
import com.doongie.test.ajax.model.Booking;

@Controller
@RequestMapping("/ajax/booking")
public class BookingController {

	@Autowired
	private BookingBO bookingBO;
	
	@GetMapping("/list")
	public String bookingList(Model model) {
		
		List<Booking> bookingList = bookingBO.getBooking();
		
		model.addAttribute("bookingList", bookingList);
		
		return "/ajax/booking/list";
	
	}
	
	@GetMapping("/input")
	public String bookingInput() {
		return "/ajax/booking/input";
	}
	

	/*
	@GetMapping("/add")
	@ResponseBody
	public String bookingAdd(
			@RequestParam("name") String name
			, @RequestParam("date") Date date
			, @RequestParam("day") int day
			, @RequestParam("headCount") int headCount
			, @RequestParam("phoneNumber") String phoneNumber
			, Model model) {
		
		int count = bookingBO.addBooking(name, date, day, headCount, phoneNumber);	
		
		Booking bookingList = new Booking();
		bookingList.setName(name);
		bookingList.setDate(date);
		bookingList.setDay(day);
		bookingList.setHeadCount(headCount);
		bookingList.setPhoneNumber(phoneNumber);
		
		model.addAttribute("bookingList", bookingList);
		
		
		return "/ajax/booking/list";
	*/


	@PostMapping("/add")
	@ResponseBody
	public Map<String, String>  bookingAdd(
			@RequestParam("name") String name
			, @RequestParam("date") Date date
			, @RequestParam("day") int day
			, @RequestParam("headCount") int headCount
			, @RequestParam("phoneNumber") String phoneNumber) {
		
		int count = bookingBO.addBooking(name, date, day, headCount, phoneNumber);	
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
		
	
	}
}
