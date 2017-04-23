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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.car.model.EmployerLogin;
import com.vjf.car.model.EmployerRegistration;
import com.vjf.car.model.JobSeekerLoginPojo;
import com.vjf.service.EmployerService;
import com.vjf.service.JobSeekerService;


@Controller
@SessionAttributes("EmployerEmail")

public class CareerShipController {
	
	@Autowired
	EmployerService employerServie;

	@RequestMapping("/vjf/home")
	public String homePagee(ModelMap model){
		return "hp";
	}

	@RequestMapping(value="/loginfailedE",	method	=	RequestMethod.GET)
	public	ModelAndView loginerror(Model	model)	{

			//model.addAttribute("error",	"true");
			ModelAndView modelAndView =new  ModelAndView("employerlogin", "eLogin", new EmployerLogin());
			modelAndView.addObject("error", "true");
			return modelAndView;
		}

	    @RequestMapping(value = "/vjf/employerlogin", method = RequestMethod.GET)
		    public ModelAndView showEmployerForm(HttpSession session) {
	    	

	    	if(session!=null && session.getAttribute("EmployerEmail")!=null ){   
	    	if(session.getAttribute("EmployerEmail").toString()!=null){
	    		   return new ModelAndView("forward:/vjf/employer/postjobs");
	    		   
	    	   }
	    	}

	        
	  	
		        return new ModelAndView("employerlogin", "eLogin", new EmployerLogin());
		 }
		   
		  @RequestMapping(value = "/logindoneE", method = RequestMethod.POST)
		    public String submit(@Valid @ModelAttribute("eLogin")	
		    EmployerLogin elogin,BindingResult result, ModelMap model) {
		    
			      if(employerServie.processLogin(elogin.eName, elogin.ePassword))
			    	  {
			    	  
			    	  model.addAttribute("EmployerEmail",elogin.eName);
			    	  return "forward:/vjf/employer/postjobs";
			  
			    	  }
		        return "redirect:/loginfailedE";
		    }
		    

		    @RequestMapping(value = "/vjf/employerregistration", method = RequestMethod.GET)
			    public ModelAndView showRegFormE() {
			        return new ModelAndView("employerreg", "eRegis", new EmployerRegistration());
			 }
			 
		    @RequestMapping(value = "/regdoneE", method = RequestMethod.POST)
		    public String regDone(@Valid @ModelAttribute("eRegis")	
		    EmployerRegistration eRegis,BindingResult result, ModelMap model) {
		       // model.addAttribute("MyAccount", eRegis.eCompanyName);
			    if(employerServie.processReg(eRegis.eName, eRegis.ePassword, eRegis.eCompanyName, eRegis.ePhone ))
			    {   
			    	  
			    	model.addAttribute("EmployerEmail",eRegis.eName);
			    	try{
			    	employerServie.sendEmail(eRegis.eName, eRegis.eName);
			    	}
			    	catch(Exception e){
			    		System.out.println("Cannot Send Email ");
			    		e.printStackTrace();
			    	}
			    	return "email_sent_emp";
			    
			    }
			    return "redirect:/regfailedE";
		    }
			@RequestMapping(value="/regfailedE",	method	=	RequestMethod.GET)
			public	ModelAndView employerRegerror(Model	model)	{

				    ModelAndView modelAndView = new ModelAndView("employerreg", "eRegis", new EmployerRegistration());

					modelAndView.addObject("errorE", "true");
					return modelAndView;
				}
	
	
}
