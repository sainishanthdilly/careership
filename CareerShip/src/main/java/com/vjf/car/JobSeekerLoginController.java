package com.vjf.car;

import javax.mail.MessagingException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.vjf.pojo.JobSeekerLogin;
import com.vjf.pojo.JobSeekerRegistration;
import com.vjf.service.JobSeekerService;

@Controller
@SessionAttributes("JobSeekerEmail")
public class JobSeekerLoginController {
	
	@Autowired
	JobSeekerService jobSeekerService ;

	@RequestMapping(value="/logout")
	public String logout(HttpSession session,WebRequest request,ModelMap model){
		
		model.clear();
		//session.removeAttribute("JobSeekerEmail");
		//session.setAttribute("JobSeekerEmail", null);
		 request.removeAttribute("JobSeekerEmail", WebRequest.SCOPE_SESSION);
		 request.removeAttribute("EmployerEmail", WebRequest.SCOPE_SESSION);
			
		
		return "hp";
		
	}
	
	@RequestMapping(value="/loginfailed",	method	=	RequestMethod.GET)
	public	ModelAndView loginerror(Model	model)	{

			//model.addAttribute("error",	"true");
			ModelAndView modelAndView =new  ModelAndView("jobseekerlogin", "jLogin", new JobSeekerLogin());
			modelAndView.addObject("error", "true");
			return modelAndView;
	}
	
    @RequestMapping(value = "/vjf/jobseekerlogin", method = RequestMethod.GET)
	    public ModelAndView showForm(HttpSession session) {
    	
    	if(session!=null && session.getAttribute("JobSeekerEmail")!=null ){   
    	if(session.getAttribute("JobSeekerEmail").toString()!=null){
    		   return new ModelAndView("forward:/vjf/jobseek/applyjobs");
    		   
    	   }
    	}
    	  
        
	        return new ModelAndView("jobseekerlogin", "jLogin", new JobSeekerLogin());
	 }
	   
	  @RequestMapping(value = "/logindone", method = RequestMethod.POST)
	    public String submit(@Valid @ModelAttribute("jLogin")	
	    JobSeekerLogin	jlogin,BindingResult result, ModelMap model, HttpSession session) {
		    
            
		 // model.addAttribute("JobSeekerEmail", jlogin.jName);		  
		      if(jobSeekerService.processLogin(jlogin.jName, jlogin.jPassword))
		    	  {
		    	    
		    	  session.setAttribute("JobSeekerEmail", jlogin.jName);
		      	
		    	  	return "forward:/vjf/jobseek/applyjobs";
		    	  
		    	  }
		  
	        return "redirect:/loginfailed";
	    }
	    

	    @RequestMapping(value = "/vjf/jobseekerregistration", method = RequestMethod.GET)
		    public ModelAndView showRegForm() {
		        return new ModelAndView("jobseekerreg", "jRegis", new JobSeekerRegistration());
		 }
		 
	    @RequestMapping(value = "/regdone", method = RequestMethod.POST)
	    public String regDone(@Valid @ModelAttribute("jRegis")	
	    JobSeekerRegistration	jRegis,BindingResult result, ModelMap model) {
	     
	    	   
			  model.addAttribute("JobSeekerEmail", jRegis.jEmail);		  
			 
	    	model.addAttribute("MyAccount", jRegis.jFirstName);
		    if(jobSeekerService.processReg(jRegis.jEmail, jRegis.jPassword ,jRegis.jFirstName, jRegis.jMiddleName, jRegis.jLastName )){
		    	
		    	try {
					jobSeekerService.sendEmail(jRegis.jEmail, jRegis.jEmail);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    	return "email_sent_jobseeker";
		    }
		    return "redirect:/regfailedJ";
	    }

		@RequestMapping(value="/regfailedJ",	method	=	RequestMethod.GET)
		public	ModelAndView regerrorJ(Model	model)	{

				ModelAndView modelAndView =new ModelAndView("jobseekerreg", "jRegis", new JobSeekerRegistration());
				modelAndView.addObject("errorJ", "true");
				return modelAndView;
		}



}
