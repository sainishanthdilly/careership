package com.vjf.car;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BackgroundInfoController {

	@RequestMapping("/vjf/job/backgroudinfo")
	public String backGroundInfo(){
		
		return "backgroundinfo";
		
	}
	
	
}
