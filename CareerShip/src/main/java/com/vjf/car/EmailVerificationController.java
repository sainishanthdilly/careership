package com.vjf.car;

import javax.mail.MessagingException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

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
	public String verifyJobSeekerEmail(@RequestParam("email") String email, ModelMap model){
		
		jobSeekerService.verifyEmail(email);
		model.addAttribute("EmailSuccess", email);
		
		return "emailSuccess";
	}
	
	@RequestMapping("/employer")
	public String verifyEmployerEmail(@RequestParam("email") String email,ModelMap model){
		
		employerService.verifyEmail(email);
		model.addAttribute("EmailSuccess", email);
			
		
		return "emailSuccess";
	}
	
	@RequestMapping("/resendEmailEmployer")
	public String resendEmployerEmail(HttpSession session){
		
		
		try {
			employerService.sendEmail(session.getAttribute("EmployerEmail").toString(), session.getAttribute("EmployerEmail").toString());
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "email_sent_emp";
	}
	
	
	
	@RequestMapping("/resendEmailJobSeeker")
	public String resendJobSeekerEmail(HttpSession session){
		
		
		try {
			jobSeekerService.sendEmail(session.getAttribute("JobSeekerEmail").toString(), session.getAttribute("JobSeekerEmail").toString());
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "email_sent_jobseeker";
	}
	
	
	
	
	
}
