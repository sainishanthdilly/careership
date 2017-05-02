package testRepository;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.car.model.EmployerLoginPojo;

public class LoginJTest {
	 final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	   ImpEmployerRepository repo = new ImpEmployerRepository();
	   PreparedStatement stmt = null;
		ResultSet rs=null;
		public Connection conn = null;
	   public LoginJTest() {
		// TODO Auto-generated constructor stub
		   repo.setConnection(DB_URL);
		   conn=repo.conn;
	}

	 	   @Test
		   public void testDataBaseConnection() {
	 			
			   
			   assertNotNull(repo.getConnection());
			   
			    
			   
		   }
		   

		   @Test
		   public void testEmployerRowInsertion() throws SQLException {
		      
				  
			   EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
			   
			   employerLoginPojo.setCompany_name("ADP");
			   employerLoginPojo.setEmail("@adp");
			   employerLoginPojo.setPhone(1234);
			   employerLoginPojo.setPassword("adp");
			  
			   
			   assertTrue("Inserted Employer in Database", repo.addUser(employerLoginPojo));
			   stmt = conn.prepareStatement(" select email, password, company_name, phone"
						+ "   from Employer_login where email = ? and password = ? ");
				
				
				stmt.setString(1, "@adp");
				stmt.setString(2, "adp");
				rs= stmt.executeQuery();
				rs.next();
				assertEquals("@adp",rs.getString(1));
				assertEquals("adp",rs.getString(2));
				assertEquals("ADP",rs.getString(3));
				assertEquals("1234",rs.getString(4));
						   
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
