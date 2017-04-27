package com.vjf.car;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.car.model.AddToShortListPojo;
import com.vjf.service.AddToShortlistService;
import com.vjf.service.JobSeekerService;

@Controller
public class AddToShortlistController {

	@Autowired
	AddToShortlistService addToShortListService;
	@Autowired
	JobSeekerService jobSeekerService;
	@RequestMapping(value="/vjf/employer/appliedcandidates")
	String ShowAppliedCandidates(ModelMap mp,HttpSession session){
		
		mp.clear();

		mp.addAttribute("appliedCandidates",addToShortListService.processAppliedCandidates(session.getAttribute("EmployerEmail").toString()));
	
		return "shortlist_candidates";
		
	}
	@RequestMapping(value="/vjf/employer/shortlistcandidates")
	String ShowShortListedCandidates(ModelMap mp,HttpSession session){
		
		mp.clear();

		mp.addAttribute("shortlistCandidates",addToShortListService.processShortlistCandidates(session.getAttribute("EmployerEmail").toString()));
	
		return "final_shortlist";//change to finalshortlist
		
	}
	
	
	
	@RequestMapping(value="/vjf/employer/viewAppliedCandidate")
	String showAppliedCandidate(ModelMap mp,HttpSession session,@RequestParam("jobseeker_email") String email){
		
	mp.clear();

	mp.addAttribute("viewCandidate",jobSeekerService.getBioData(email));
	
		return "view_candidate";//change to finalshortlist
		
	}
	
	
	@RequestMapping(value="/vjf/employer/shortListCandidate")
	String shortListCandidate(ModelMap mp,HttpSession session, @RequestParam("job_apply_id") String id){
		
		//mp.clear();

		//mp.addAttribute("shortlistCandidates",addToShortListService.processShortlistCandidates(session.getAttribute("EmployerEmail").toString()));
	
		try{
		addToShortListService.shortListACandidate(Long.parseLong(id));
		
		
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
		return "redirect:/vjf/employer/appliedcandidates";//change to finalshortlist
		
	
	}
	
	
	@RequestMapping(value="/vjf/employer/selectedcandidates/sendemail")
	String sendEmailShortListedCandidates(ModelMap mp,HttpSession session){
		
		try {
			addToShortListService.sendEmailSelectedCandidates(session.getAttribute("EmployerEmail").toString());
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/vjf/employer/appliedcandidates";//change to finalshortlist
		
	}


	

	
	
	
	
	
	
	

	
	
	
	
}
