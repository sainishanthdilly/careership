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
public class HomePageControllerTest {
 
    private MockMvc mockMvc;
 
    @Autowired
	EmployerService employerServie;
    @Autowired 
    JobSeekerService jobSeekerService;

 
    //Add WebApplicationContext field here
 
    //The setUp() method is omitted.
 
    @Test
    public void openHomePageController()  {
       
        try {
			mockMvc.perform(get("/vjf/home"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("hp"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    @Test
    public void showEmployerFormTest(HttpSession session)  {
       
        try {
			mockMvc.perform(get("/vjf/employerlogin"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("employerlogin"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    

    @Test
    public void showJobSeekerFormReg(HttpSession session)  {
       
        try {
			mockMvc.perform(get("/vjf/jobSeekerregistration"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("jobseekerlogin"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}
  
        
    }
  
    
    

    @Test
    public void showEmployerForm(HttpSession session)  {
       
        try {
			mockMvc.perform(get("/vjf/employerlogin"))
			        .andExpect(status().isOk())
			        .andExpect(view().name("employerlogin"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
    
    
    
    
    
    
    
}