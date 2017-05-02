package testRepository;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class JobSeekerTest {
	
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	   ImpJobSeekerRepository repo = new ImpJobSeekerRepository();
	   
	   public JobSeekerTest() {
		// TODO Auto-generated constructor stub
		   repo.setConnection(DB_URL);
	}

	 	   @Test
		   public void testDataBaseConnection() {
	 			
			   
			   assertNotNull(repo.conn);
			   
			    
			   
		   }
		   

		   @Test
		   public void testEmployerRowInsertion() {
		      
				  
			  JobSeekerLoginPojo employerLoginPojo = new JobSeekerLoginPojo();
			   
			   employerLoginPojo.setEmail("test@test");;
			   employerLoginPojo.setFirst_name("test name");;
			   employerLoginPojo.setMiddle_name("test1 middle");
			   employerLoginPojo.setLast_name("test1 last");
			   
			   employerLoginPojo.setPassword("test");
			  
			   
			   assertTrue("Inserted JobSeeker in Database", repo.addUser(employerLoginPojo));
			   
			   
		   }
		   
		   
		   //Make Sure to insert row
		   
		   @Test
		   public void testEmployerRowSelection() {
		      
			   
			   assertTrue("Fetched Row from Db", repo.getUser("adp1","adp1"));
			   
			   
			   
		   }
		   @Test
		   public void testEmployerWrongRowSelection() {
		   
		   assertFalse("Fetched Row from Db", repo.getUser("adpadp","adp1"));
		   
		   }
		   


		


}
