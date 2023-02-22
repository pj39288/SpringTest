package com.doongie.test.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Test03Controller {
	
	@RequestMapping("/lifecycle/Test03")
	public String jspResponse() {
		
		return "lifecycle/Test03";
	}

}
