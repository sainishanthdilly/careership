package com.vjf.car;

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

import com.vjf.service.JobSeekerService;

@Controller
public class JobSeekerLoginController {
	
	@Autowired
	JobSeekerService jobSeekerService ;
	

	@RequestMapping(value="/loginfailed",	method	=	RequestMethod.GET)
	public	ModelAndView loginerror(Model	model)	{

			//model.addAttribute("error",	"true");
			ModelAndView modelAndView =new  ModelAndView("jobseekerlogin", "jLogin", new JobSeekerLogin());
			modelAndView.addObject("error", "true");
			return modelAndView;
	}
	
    @RequestMapping(value = "/vjf/jobseekerlogin", method = RequestMethod.GET)
	    public ModelAndView showForm() {
        
	        return new ModelAndView("jobseekerlogin", "jLogin", new JobSeekerLogin());
	 }
	   
	  @RequestMapping(value = "/logindone", method = RequestMethod.POST)
	    public String submit(@Valid @ModelAttribute("jLogin")	
	    JobSeekerLogin	jlogin,BindingResult result, ModelMap model) {
		    
		      if(jobSeekerService.processLogin(jlogin.jName, jlogin.jPassword))
		    	  return "welcome";
		  
	        return "redirect:/loginfailed";
	    }
	    

	    @RequestMapping(value = "/vjf/jobseekerregistration", method = RequestMethod.GET)
		    public ModelAndView showRegForm() {
		        return new ModelAndView("jobseekerreg", "jRegis", new JobSeekerRegistration());
		 }
		 
	    @RequestMapping(value = "/regdone", method = RequestMethod.POST)
	    public String regDone(@Valid @ModelAttribute("jRegis")	
	    JobSeekerRegistration	jRegis,BindingResult result, ModelMap model) {
	        model.addAttribute("MyAccount", jRegis.jFirstName);
		    if(jobSeekerService.processReg(jRegis.jEmail, jRegis.jPassword ,jRegis.jFirstName, jRegis.jMiddleName, jRegis.jLastName ))
		    	  return "hp";
		    return "error";
	    }

}
