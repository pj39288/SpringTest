package com.doongie.test.jstl.bo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doongie.test.jstl.dao.WeatherDAO;
import com.doongie.test.jstl.model.Weather;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherDAO;
	
	public List<Weather> getWeather() {
		return weatherDAO.selectWeather();
	}
	
	public int addWeather(Date date, String weather, double temperature, double precipitation, String microDust, double windSpeed) {
		return weatherDAO.insertWeather(date, weather, temperature, precipitation, microDust, windSpeed);
	}

}
