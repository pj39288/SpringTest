package com.doongie.test.lifecycle;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doongie.test.lifecycle.model.Day;


@RestController // 
@RequestMapping("/lifecycle/test03")
public class Test03Controller {
	
	public List<Day> getDaily(){
	
		List<Day> dayInfo = new ArrayList<>();	
		
		Day day1 = new Day();
		day1.setTitle("안녕하세요. 가입인사 드립니다");
		day1.setUser("hagulu");
		day1.setContent("활동 열심히 하겠습니다");
		
		dayInfo.add(day1);
		
		return dayInfo;
		
		
	}

}
