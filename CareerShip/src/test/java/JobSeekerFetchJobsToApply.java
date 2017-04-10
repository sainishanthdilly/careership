import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.car.model.EmployerLoginPojo;

public class JobSeekerFetchJobsToApply {
	
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";
	 ImplEmployerJobPostRepository repo = new ImplEmployerJobPostRepository();
	 ImpEmployerRepository repo1 = new ImpEmployerRepository();
	   
	  
	 
	 
	
	public JobSeekerFetchJobsToApply() {
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		// TODO Auto-generated constructor stub
	}


	@Test
	public void testFetchAllJobsToApplyRows(){
		EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo12@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo1.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
				   ;
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo12@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("Job 1");
			
		   repo.addJob(employerPostJobTest);
		   
		   
		assertTrue("Fetched Job From DB",repo.getALLJobsPosted().size()>0);	
		
		
	}
	
	

	@Test
	public void testDeleteEmployerJobs(){
		EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo1245@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo1.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
				   ;
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo1245@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("Job 1");
		   
		   repo.addJob(employerPostJobTest);
			
		   assertTrue("Fetched Job From DB",repo.deleteJobPost(repo.getALLJobsPosted().get(0).getPost_id()));	
		
		
	}
	

	

}
