package testRepository;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class TestEmployerPostJobRepository {

	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	   ImplEmployerJobPostRepository repo = new ImplEmployerJobPostRepository();
	   ImpEmployerRepository repo1 = new ImpEmployerRepository();
	
	public TestEmployerPostJobRepository() {
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		
		// TODO Auto-generated constructor stub
	}
	
	  @Test
	   public void testDataBaseConnection() {
 			
		   
		   assertNotNull(repo.conn);
		   assertNotNull(repo1.conn);
		   
		    
		   
	   }
	
	  
	  
	  
	   @Test
	   public void testEmployerPOSTJOBRowInsertion() {
	      
		   
		   EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo1.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
				   ;
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("DBA ADMIN");
		   
		   
		   assertTrue("Inserted Employer JOB POST in Database", repo.addJob(employerPostJobTest));
			   
		   
		   
	   }
	   
	   

	   @Test
	   public void testEmployerPOSTJOBRowSelection() {
	      
		   
		   EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojoSel@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo1.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
				   ;
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojoSel@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("DBA ADMIN");
		   
		   
		   assertTrue("Inserted Employer JOB POST in Database", repo.addJob(employerPostJobTest));
			
		   assertTrue("Select Employer JOB POST in Database", repo.getJobsPosted("testpojoSel@adp").size()>0);
		   
		   assertTrue("check the datae", repo.getJobsPosted("testpojoSel@adp").get(0).getLocation().equals("NEw york"));
		   
		   
	   }
	   
	   
	   
	   
	  
	   
	  
	  
	  
	  
	
	

}
