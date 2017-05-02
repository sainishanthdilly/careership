package testController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.service.EmployerJobPostService;
import com.vjf.service.EmployerService;
import com.vjf.service.JobSeekerService;

import java.util.Arrays;

import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestContext.class, WebServiceContext.class})
@WebAppConfiguration
public class EditJobsPageControllerTest {
 
    private MockMvc mockMvc;
 
    @Autowired
	EmployerJobPostService employerJobPostService; 
 
    //Add WebApplicationContext field here
 
    //The setUp() method is omitted.
 
    @Test
    public void openEmployerHomePageController()  {
       
        try {
			mockMvc.perform(get("/vjf/employer/postjobs"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("employer_hp"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    @Test
    public void editJobPost()  {
       
        try {
        	
        	   EmployerJobPostPojo emp= new EmployerJobPostPojo();
        		
        	emp.setDesc("desc1");
    	    emp.setLocation("loc1");
    	    emp.setTitle("title1");
    	    emp.setPost_id(Long.parseLong("2"));
    	    
			mockMvc.perform(get("/vjf/employer/editjobs12"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("employerEditjobs"));
			
	        verify(employerJobPostService, times(1)).processEditJobPosts("desc1", "title11", "location1", 12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    @Test
    public void deleteJobPost()  {
       
        try {
        	
        	   EmployerJobPostPojo emp= new EmployerJobPostPojo();
        		
        	emp.setPost_id(Long.parseLong("2"));
    	    
			mockMvc.perform(get("/vjf/employer/deletejobs"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("redirect:/vjf/employer/postjobspage"));
			
	        verify(employerJobPostService, times(1)).processdeleteJobPost(12);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    @Test
    public void selectJobs()  {
       
        try {
        	
        	 
    	    
			mockMvc.perform(get("/vjf/employer/postjobspage"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("employerjobsPost"));
			
	        verify(employerJobPostService).processGetALLJobPosts("pnahala@gmail.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    
  
        
    
    

    
    
    
    
    
    
}