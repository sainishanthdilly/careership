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
import com.vjf.service.JobSeekerJobApplyService;
import com.vjf.service.JobSeekerService;

@Controller
@SessionAttributes("JobSeekerEmail")

public class JobSeekerPageController {
	
	@Autowired
	EmployerJobPostService employerJobPostService;
	@Autowired
	JobSeekerService jobSeekerService;
	@Autowired
	JobSeekerJobApplyService jobSeekerJobApplyService;
	
	
	@RequestMapping(value="/vjf/jobseek/applyjobs")
	String jobSeekerSearchPage(ModelMap mp,HttpSession session){
		
		mp.addAttribute("employerjobs",employerJobPostService.processGetALLJobPosts());
		return "jobseeker_hp";

	
	}
	
	@RequestMapping(value="/vjf/jobseek/viewjobs")
	String getJobSeekerJobsList(ModelMap mp,HttpSession session){
		
		mp.addAttribute("employerjobs",employerJobPostService.processGetALLJobPosts());
		return "jobseekerjobs";

	}
	
	
	
	@RequestMapping(value="/vjf/jobseek/verify/applyjob")
	String jobSeekerCheckApplyJob(ModelMap mp,HttpSession session){
		
		if(!jobSeekerService.checkjEmail(session.getAttribute("JobSeekerEmail").toString())){
			
			
			mp.addAttribute("errorc","eer");
			
		}
		else{
			
	//		jobSeekerJobApplyService.processApplyJob( job_post_id, jobseeker_email);
			
		}
		
		return "forward:/vjf/jobseek/viewjobs";

	
	}

	
	

}
