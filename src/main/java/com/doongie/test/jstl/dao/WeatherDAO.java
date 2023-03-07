package com.doongie.test.jstl.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.doongie.test.jstl.model.Weather;

@Repository
public interface WeatherDAO {
	
	public List<Weather> selectWeather();
	
	public int insertWeather(
				@Param("date") Date date
				,@Param("weather") String weather
				,@Param("temperature") double temperature
				,@Param("precipitation") double precipitation
				,@Param("microDust") String microDust
				,@Param("windSpeed") double windSpeed			
			);

}
