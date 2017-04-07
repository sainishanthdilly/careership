package com.vjf.car;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.pojo.EmployerLogin;
import com.vjf.service.EmployerJobPostService;

@Controller
@SessionAttributes("EmployerEmail")

public class EmployerJobApplyController {
	
	@Autowired
	EmployerJobPostService employerJobPostService; 

	@RequestMapping(value="/vjf/employer/postjobs")
	String getEmployeeJobPostPage(ModelMap mp,HttpSession session){
		mp.clear();

		
		return "employer_hp";
	}
	
	@RequestMapping(value="/vjf/employer/postjobspage")
	String employeeJobPostPage(ModelMap mp,HttpSession session){
		mp.clear();

		mp.addAttribute("employerjobs",employerJobPostService.processGetJobPosts(session.getAttribute("EmployerEmail").toString()));
	
		return "employerjobpost";
	}

	
	@RequestMapping(value="/vjf/employer/addpostjobs")
	ModelAndView addJobsPostPage(ModelMap mp){
		
		
		return new ModelAndView("employeraddjobs","eJobsPost",new EmployerJobPostPojo());
	}
	
	@RequestMapping(value="/vjf/employer/addedpostjobs", method =RequestMethod.POST)
	String addJobsPost(@Valid @ModelAttribute("eJobsPost")	
    EmployerJobPostPojo eJob,BindingResult result, ModelMap model,HttpSession session){
		
		employerJobPostService.processAddJobPosts(eJob.getDesc(), eJob.getTitle(), eJob.getLocation(),session.getAttribute("EmployerEmail").toString());
		
		return "redirect:/vjf/employer/postjobspage";
	}
	
	
	
	
	@RequestMapping(value="/vjf/employer/deletejobs", method =RequestMethod.GET)
	String deleteJobPost(@RequestParam("post_job_id") String id){
		
		employerJobPostService.processdeleteJobPost(Long.parseLong(id));
		
		return "redirect:/vjf/employer/postjobspage";
	}
	
	
	
	
	
	
	
	

}
