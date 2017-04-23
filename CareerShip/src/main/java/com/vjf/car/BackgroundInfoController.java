package com.vjf.car;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.car.model.JobSeekerBioDataPojo;

import com.vjf.service.JobSeekerService;

@Controller
public class BackgroundInfoController {


	@Autowired
	JobSeekerService jobSeekerService ;
	@RequestMapping(value="/vjf/job/backgroudinfo", method = RequestMethod.GET)
	public ModelAndView backGroundInfo(HttpSession session){
	    JobSeekerBioDataPojo bioDataPojo = null;
	
		if(!jobSeekerService.checkBioDataExists(session.getAttribute("JobSeekerEmail").toString())){
			bioDataPojo = new JobSeekerBioDataPojo();
		}
		else{
			bioDataPojo = jobSeekerService.getBioData(session.getAttribute("JobSeekerEmail").toString()); 
		}
		
		
		
		return new ModelAndView("backgroundinfo", "jBioData", bioDataPojo );
		
	}
	 @RequestMapping(value = "/BioDataDone", method = RequestMethod.POST)
	    public String BioDatasubmit(@Valid @ModelAttribute("jBioData")	
	    JobSeekerBioDataPojo jbiodata,BindingResult result, ModelMap model,HttpSession session) {
		   	  
		      if(jobSeekerService.processBioData(jbiodata.jFirstName,jbiodata.jLastName,session.getAttribute("JobSeekerEmail").toString(),jbiodata.jPhone,
		    		  jbiodata.jSchool,jbiodata.jDegree,jbiodata.jFStudy,jbiodata.jSStudyMonth,jbiodata.jSStudyYear,jbiodata.jEStudyMonth,
		    		  jbiodata.jEStudyYear,jbiodata.jWJobTitle,jbiodata.jWCompany,jbiodata.jWCountry,jbiodata.jWCity,jbiodata.jSWorkMonth,
		    		  jbiodata.jSWorkYear,jbiodata.jEWorkMonth,jbiodata.jEWorkYear,jbiodata.jWDescription)){
		    	  return "jobseekerjobs";
		      }
		      
		      return "error";
		      
	    }
		    	 
	    }
	    
