package com.vjf.car;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vjf.service.EmployerJobPostService;

@Controller
public class JobSeekerSearchForJobsController {

	@Autowired
	EmployerJobPostService employerJobPostService;
	
	@RequestMapping(value="/vjf/jobseek/searchjobs")
	String getJobSeekerJobsList(ModelMap mp,HttpSession session){
		
		mp.addAttribute("employerjobs",employerJobPostService.processGetALLJobPosts());
		return "jobseekerjobs";
		
		

	}

	
}
