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

		mp.addAttribute("appliedCandidates",addToShortListService.processAppliedCandidates(session.getAttribute("JobSeeker_email").toString()));
	
		return "shortlist_candidates";
		
	}
	@RequestMapping(value="/vjf/employer/shortlistcandidates")
	String ShowShortListedCandidates(ModelMap mp,HttpSession session){
		
		mp.clear();

		mp.addAttribute("shortlistCandidates",addToShortListService.processShortlistCandidates(session.getAttribute("JobSeeker_email").toString()));
	
		return "final_shortlist";//change to finalshortlist
		
	}
	
}
