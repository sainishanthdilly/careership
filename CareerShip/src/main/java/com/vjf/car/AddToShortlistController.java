package com.vjf.car;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.car.model.AddToShortListPojo;
import com.vjf.service.AddToShortlistService;

@Controller
public class AddToShortlistController {

	@Autowired
	AddToShortlistService addToShortListService=new AddToShortlistService();
	@RequestMapping(value="/vjf/employer/appliedcandidates")
	String ShowAppliedCandidates(ModelMap mp,HttpSession session){
		
		mp.clear();

		mp.addAttribute("employerjobs",addToShortListService.processAppliedCandidates(session.getAttribute("EmployerEmail").toString()));
	
		return "employerjobpost";
		
		

	}
	
	
}
