package testRepository;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.Repository.ImplJobSeekerSearchRepository;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.car.model.EmployerLoginPojo;


public class TestAdvancedSearch {
	
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";
	ImplEmployerJobPostRepository repo = new ImplEmployerJobPostRepository();
ImplJobSeekerSearchRepository repo1=new  ImplJobSeekerSearchRepository();
ImpEmployerRepository repo2 = new ImpEmployerRepository();

	
	public TestAdvancedSearch() {
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		repo2.setConnection(DB_URL);
		
		// TODO Auto-generated constructor stub
	}
	
	  @Test
	   public void testDataBaseConnection() {
			
		  assertNotNull(repo.conn);
		   assertNotNull(repo1.conn); 
		   assertNotNull(repo2.conn); 
		   
	   }

	@Test
	public void test() {
		EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo888@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo2.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo();		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo888@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("Job 1");
		   
		   assertTrue("Inserted position details",repo.addJob(employerPostJobTest));
		   assertTrue("Fetched Job From DB",repo.getALLJobsPosted("testpojo12@adp").size()>0);	
			 
		   EmployerJobPostPojo employerPostJobTestSele  =  repo.getJobsPosted("testpojo888@adp").get(0);
		   assertTrue(employerPostJobTestSele.getCompany_name().equals("ADP ADP"));
		   assertTrue(employerPostJobTestSele.getDesc().equals("SQL DEvelpoer full time"));
		   assertTrue(employerPostJobTestSele.getLocation().equals("New york"));
		   assertTrue(employerPostJobTestSele.getTitle().equals("Job 1"));
		
		   
		   
		   
		   
		   List<EmployerJobPostPojo> employerJobPostPojosA = new ArrayList<>();
		   
		   
		   
		   employerJobPostPojosA=repo1.advancedSearch("Title","Job");
		   assertTrue("Size is 1",employerJobPostPojosA.size()>0);
		   
		   
		   
		   
	}

}
