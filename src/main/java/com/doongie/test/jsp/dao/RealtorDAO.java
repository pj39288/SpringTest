package com.doongie.test.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.doongie.test.jsp.model.Realtor;

@Repository
public interface RealtorDAO {

	public int insertRealtor(
			@Param("office") String office
			, @Param("phoneNumber") String phoneNumber
			, @Param("address") String address
			, @Param("grade") String grade);
	
	public Realtor selectLastRealtor();
}
