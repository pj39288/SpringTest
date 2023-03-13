package com.doongie.test.ajax.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.doongie.test.ajax.model.Booking;

@Repository
public interface BookingDAO {

	public List<Booking> selectBooking();
	
	public int insertBooking(
			@Param("name") String name
			, @Param("date") Date date
			, @Param("day") int day
			, @Param("headCount") int headCount
			, @Param("phoneNumber") String phoneNumber
			, @Param("state") String state);
	
	public int deleteBooking(@Param("id") int id);
	
	public Booking selectOneBooking(
			@Param("name") String name
			, @Param("phoneNumber") String phoneNumber);
	
}
