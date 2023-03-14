package com.doongie.test.ajax.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.ajax.dao.BookingDAO;
import com.doongie.test.ajax.model.Booking;

@Service
public class BookingBO {
	
	@Autowired
	private BookingDAO bookingDAO;
	
	public List<Booking> getBooking() {
		
		return bookingDAO.selectBooking();
		
	}
	
	public int addBooking(
			String name
			, Date date
			, int day
			, int headCount
			, String phoneNumber) {
		
		return bookingDAO.insertBooking(name, date, day, headCount, phoneNumber, "대기중");
	}
	
	
	public int deleteBooking(int id) {
		
		return bookingDAO.deleteBooking(id);
		
	}
	
	public Booking searchBooking(String name, String phoneNumber) {
		
		return bookingDAO.selectOneBooking(name, phoneNumber);
	}

}
