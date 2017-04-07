package com.vjf.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vjf.service.EmployerService;
import com.vjf.service.JobSeekerService;

@Controller
@RequestMapping("/vjf/mailverify")
public class EmailVerificationController {
	
	@Autowired
	EmployerService employerService;
	
	@Autowired
	JobSeekerService jobSeekerService;

	@RequestMapping("/jobseeker")
	public String verifyJobSeekerEmail(@RequestParam("email") String email){
		
		jobSeekerService.verifyEmail(email);
		
		return "mailverifiedJ";
	}
	
	@RequestMapping("/employer")
	public String verifyEmployerEmail(@RequestParam("email") String email){
		
		employerService.verifyEmail(email);
		
		
		return "mailverifiedE";
	}
	
	
	
	
}
