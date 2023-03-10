package com.doongie.test.ajax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.doongie.test.ajax.bo.FavoriteBO;
import com.doongie.test.ajax.model.Favorite;

@Controller
@RequestMapping("/ajax/favorite")
public class FavoriteController {

	@Autowired
	private FavoriteBO favoriteBO;
	
	
	@GetMapping("/list")
	public String favoriteList(Model model) {
		
		List<Favorite> favoriteList = favoriteBO.getFavoriteList();
		
		model.addAttribute("favoriteList", favoriteList);
		
		return "/ajax/favorite/list";
	}
	
	@GetMapping("/input")
	public String favoriteInput() {
		return "/ajax/favorite/input";
	}
	
	//public String favoriteAdd(String name, String url) {
		
	//}
	
	
	
	// 즐겨찾기 주소를 전달받고, 해당 주소가 중복인지 확인한다
	// 중복여부를 response에 전달함 (api형태)
	
	@PostMapping("/is_duplicate")
	// api는 data형태로 return하고 그 형식은 json이다
	public Map<String, Boolean> isDuplicateUrl(@RequestParam("url") String url) {
		
		Map<String, Boolean> resultMap = new HashMap<>();
		
		if(favoriteBO.isDuplicateUrl(url)) {
			resultMap.put("is_duplicate", true);
		} else {
			resultMap.put("is_duplicate", false);
		}
		
		resultMap.put("is_duplicate", favoriteBO.isDuplicateUrl(url));
		
		return resultMap;
		 
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public  Map<String, String> deleteFavorite(@RequestParam("id") int id) {
		
		int count = favoriteBO.deleteFavorite(id);
		
		Map<String, String> resultMap = new HashMap<>();
		
		if(count == 1) {
			resultMap.put("result", "success");
		} else {
			resultMap.put("result", "fail");
		}
		
		return resultMap;
	}
	

}
