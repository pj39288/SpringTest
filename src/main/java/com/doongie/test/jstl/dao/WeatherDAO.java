package com.doongie.test.jstl.dao;

import org.springframework.stereotype.Repository;

import com.doongie.test.jstl.model.Weather;

@Repository
public interface WeatherDAO {
	
	public Weather selectWeather();
	
	public int insertWeather(
				String weather
			
			);

}
