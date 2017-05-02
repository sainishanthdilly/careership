package testRepository;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class JobSeekerTest {
	
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	   ImpJobSeekerRepository repo = new ImpJobSeekerRepository();
	   PreparedStatement stmt = null;
		ResultSet rs=null;
		public Connection conn = null;
	   
	   public JobSeekerTest() {
		// TODO Auto-generated constructor stub
		   repo.setConnection(DB_URL);
		   conn=repo.conn;
	}

	 	   @Test
		   public void testDataBaseConnection() {
	 			
			   
			   assertNotNull(repo.conn);
			   
			    
			   
		   }
		   

		   @Test
		   public void testEmployerRowInsertion() throws SQLException {
		      
				  
			  JobSeekerLoginPojo employerLoginPojo = new JobSeekerLoginPojo();
			   
			   employerLoginPojo.setEmail("test4553@test");;
			   employerLoginPojo.setFirst_name("test name");;
			   employerLoginPojo.setMiddle_name("test1 middle");
			   employerLoginPojo.setLast_name("test1 last");
			   
			   employerLoginPojo.setPassword("test");
			  
			   
			   assertTrue("Inserted JobSeeker in Database", repo.addUser(employerLoginPojo));
			   stmt = conn.prepareStatement(" select email, password, first_name, middle_name, "
						+ " last_name  from JobSeeker_login where email = ? and password = ? ");
				
				
				stmt.setString(1, "test4553@test");
				stmt.setString(2, "test");
				
				
				rs= stmt.executeQuery();rs.next();
				assertEquals("test4553@test",rs.getString(1));
				assertEquals("test",rs.getString(2));
				assertEquals("test name",rs.getString(3));
				assertEquals("test1 middle",rs.getString(4));
				assertEquals("test1 last",rs.getString(5));
			   
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
