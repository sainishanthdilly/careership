import static org.junit.Assert.assertTrue;

import javax.mail.MessagingException;

import org.junit.Test;

import com.vjf.service.ImplEmployerService;
import com.vjf.service.ImplJobSeekerService;

public class EmailTest {
	   

	
	public EmailTest() {
		super();
			}
	
	  @Test
	   public void testEmailEmployer() {
 			
		   
		   
		    try {
				new ImplEmployerService().sendEmail("sdilly@uncc.edu", "link");
				assertTrue("Email Verified No Exception",true);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue("Employer Email Verification Failed",true);
				
				
			}
		   
	   }
	

	  @Test
	   public void testEmailJobSeeker() {
 			
		   
		   
		    try {
				new ImplJobSeekerService().sendEmail("sdilly@uncc.edu", "link");
				assertTrue("Email Verified No Exception",true);
				
				
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				assertTrue("JobSeeker Email Verification Failed",true);
				
				
			}
		   
	   }
	
 
	  
	  	
	

}
