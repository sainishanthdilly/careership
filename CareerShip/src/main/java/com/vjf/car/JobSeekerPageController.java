package com.vjf.car;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vjf.Repository.EmployerJobPostRepository;
import com.vjf.service.EmployerJobPostService;

@Controller
@SessionAttributes("JobSeekerEmail")

public class JobSeekerPageController {
	
	@Autowired
	EmployerJobPostService employerJobPostService;
	
	
	@RequestMapping(value="/vjf/jobseek/applyjobs")
	String jobSeekerSearchPage(ModelMap mp,HttpSession session){
		
		mp.addAttribute("employerjobs",employerJobPostService.processGetALLJobPosts());
		System.out.println(session.getAttribute("JobSeekerEmail"));
		return "jobseeker_hp";

	
	}
	
	@RequestMapping(value="/vjf/jobseek/viewjobs")
	String getJobSeekerJobsList(ModelMap mp,HttpSession session){
		
		mp.addAttribute("employerjobs",employerJobPostService.processGetALLJobPosts());
		System.out.println(session.getAttribute("JobSeekerEmail"));
		return "jobseekerjobs";
	

	}
	
	

}
