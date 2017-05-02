package testRepository;
import static org.junit.Assert.*;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.car.model.EmployerLoginPojo;

public class LoginJTest {
	 final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	   ImpEmployerRepository repo = new ImpEmployerRepository();
	   
	   public LoginJTest() {
		// TODO Auto-generated constructor stub
		   repo.setConnection(DB_URL);
	}

	 	   @Test
		   public void testDataBaseConnection() {
	 			
			   
			   assertNotNull(repo.getConnection());
			   
			    
			   
		   }
		   

		   @Test
		   public void testEmployerRowInsertion() {
		      
				  
			   EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
			   
			   employerLoginPojo.setCompany_name("ADP");
			   employerLoginPojo.setEmail("@adp");
			   employerLoginPojo.setPhone(1234);
			   employerLoginPojo.setPassword("adp");
			  
			   
			   assertTrue("Inserted Employer in Database", repo.addUser(employerLoginPojo));
			   
			   
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
