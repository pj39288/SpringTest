package com.doongie.test.ajax.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.ajax.dao.BookingDAO;
import com.doongie.test.ajax.model.Booking;

@Service
public class BookingBO {
	
	@Autowired
	private BookingDAO bookingDAO;
	
	public List<Booking> bookingList() {
		
		return bookingDAO.selectBooking();
		
	}
	

}
