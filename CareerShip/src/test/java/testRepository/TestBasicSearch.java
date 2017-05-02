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

public class TestBasicSearch {
	
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";
	ImplEmployerJobPostRepository repo = new ImplEmployerJobPostRepository();
ImplJobSeekerSearchRepository repo1=new  ImplJobSeekerSearchRepository();
ImpEmployerRepository repo2 = new ImpEmployerRepository();

	
	public TestBasicSearch() {
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
		   employerLoginPojo.setEmail("testpojo123@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  
		   
		   assertTrue("Inserted Employer in Database", repo2.addUser(employerLoginPojo));
		   
	
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo()
				   ;
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo123@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("Job 1");
		   
		   repo.addJob(employerPostJobTest);
		   List<EmployerJobPostPojo> employerJobPostPojos = new ArrayList<>();
		   
		   
		   employerJobPostPojos=repo1.basicSearch("Job");
		   assertTrue("Size is 1",employerJobPostPojos.size()>0);
		   
		   
		   
		   
		   
		   
	}

}
