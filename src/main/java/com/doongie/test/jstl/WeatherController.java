package com.doongie.test.jstl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.jstl.bo.WeatherBO;
import com.doongie.test.jstl.model.Weather;

@Controller
@RequestMapping("/jstl/weather")
public class WeatherController {
	
	@Autowired
	private WeatherBO weatherBO;
	
	@RequestMapping("/info")
	// @ResponseBody
	// public List<Weather> getWeather(){
		
	// 	return weatherBO.getWeather();
	// }
	public String getWeather(Model model) {
		
		List<Weather> weatherList = weatherBO.getWeather();
		
		model.addAttribute("weatherList", weatherList);
				
		return "jstl/weatherInfo";
	}
	
	
	@RequestMapping("/input")
	public String inputWeather(Model model) {
		
		return "jsp/weatherInput";
	}
	
	@GetMapping("/add")
	@ResponseBody
	public String addWeather(
			
			@DateTimeFormat(pattern="yyyy-MM-dd")
			@RequestParam("date") Date date
			, @RequestParam("weather") String weather
			, @RequestParam("temperature") double temperature
			, @RequestParam("precipitation") double precipitation
			, @RequestParam("microDust") String microDust
			, @RequestParam("windSpeed") double windSpeed) {
		
		int count = weatherBO.addWeather(date, weather, temperature, precipitation, microDust, windSpeed);
		
		return("삽입결과 : " + count);
	}
	
	 

}
