package com.doongie.test.ajax.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.doongie.test.ajax.model.Booking;

@Repository
public interface BookingDAO {

	public List<Booking> selectBooking();
	
	
	
	
}
