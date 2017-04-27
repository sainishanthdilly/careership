package com.vjf.car;

import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.service.JobSeekerSearchService;

@Controller
public class JobSeekerSearchForJobsController {

	@Autowired
	JobSeekerSearchService jobSeekerSearchService;
	
	@RequestMapping(value="/vjf/jobseek/searchjobs")
	ModelAndView getJobSeekerJobsListStart(ModelMap mp,HttpSession session){
		
		return new ModelAndView("searchpage","jobsearch1",new EmployerJobPostPojo());
	
	}
	
	@RequestMapping(value="/vjf/jobseek/searchjobsNormal", method =RequestMethod.GET)
	String getJobSeekerJobsListNormal(ModelMap mp,@RequestParam("searchQ") String search, @RequestParam("sera2") String search_title){
	
		
		if(search_title.equalsIgnoreCase("Any Search")){

		mp.addAttribute("searchjobs",jobSeekerSearchService.search(search));
		}
		else{
			mp.addAttribute("searchjobs",jobSeekerSearchService.advancedSearch(search_title,search));
				
		}
		return "searchpage";
		

	}
	
	



	
}
