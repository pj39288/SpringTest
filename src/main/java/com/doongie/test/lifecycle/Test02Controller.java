package com.doongie.test.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doongie.test.lifecycle.model.Day;

@RestController // 
@RequestMapping("/lifecycle/test02")
public class Test02Controller {
	
	@RequestMapping("/1")
	public List<Map<String, Object>> getMovieInfo(){
		
		List<Map<String, Object>> movieInfo = new ArrayList<>();
		
		Map<String, Object> movie1 = new HashMap<>();
		movie1.put("rate", 15);
		movie1.put("director", "봉준호");
		movie1.put("time", 131);
		movie1.put("title", "기생충");
		movieInfo.add(movie1);
		
		Map<String, Object> movie2 = new HashMap<>();
		movie2.put("rate", 0);
		movie2.put("director", "로베르토 베니니");
		movie2.put("time", 116);
		movie2.put("title", "인생은 아름다워");
		movieInfo.add(movie2);
		
		return movieInfo;
	}
	
	
	@RequestMapping("/2")
	public List<Day> getDaily(){
		
		List<Day> dayInfo = new ArrayList<>();	
		
		Day day1 = new Day();
		day1.setTitle("안녕하세요. 가입인사 드립니다");
		day1.setUser("hagulu");
		day1.setContent("활동 열심히 하겠습니다");
		dayInfo.add(day1);
		
		Day day2 = new Day();
		day2.setTitle("헐 대박");
		day2.setUser("bada");
		day2.setContent("오늘 목요일이었어");
		dayInfo.add(day2);
		
		return dayInfo;
		
		
	}
	
	
	@RequestMapping("/3")
	public ResponseEntity<Day> entity(){
		Day day1 = new Day();
		day1.setTitle("안녕하세요. 가입인사 드립니다");
		day1.setUser("hagulu");
		day1.setContent("활동 열심히 하겠습니다");
		
		ResponseEntity<Day> entity = new ResponseEntity(day1, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
		
	}
	

	
	

}
