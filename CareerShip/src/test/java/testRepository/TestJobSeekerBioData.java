package testRepository;
import static org.junit.Assert.*;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.Repository.ImplJobSeekerApplyJobRepository;
import com.vjf.car.model.JobSeekerBioDataPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class TestJobSeekerBioData {

	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";

	ImpJobSeekerRepository repo1=new  ImpJobSeekerRepository();
	
	public TestJobSeekerBioData() {
		super();
		repo1.setConnection(DB_URL);
		
		// TODO Auto-generated constructor stub
	}
	
	  @Test
	   public void testDataBaseConnection() {
			
		   
		   assertNotNull(repo1.conn);  
		   
	   }
	  @Test
		public void testTrue() {
			//jobseeker email
			JobSeekerLoginPojo jobSeekerLoginPojo=new JobSeekerLoginPojo();
			jobSeekerLoginPojo.setEmail("nathalapooja@biodata");
			jobSeekerLoginPojo.setPassword("Pnathala123");
			jobSeekerLoginPojo.setFirst_name("Pooja Reddy");
			jobSeekerLoginPojo.setMiddle_name(null);
			jobSeekerLoginPojo.setLast_name("Nathala");
			
			assertTrue("Inserted Employer in Database", repo1.addUser(jobSeekerLoginPojo));
			
			JobSeekerBioDataPojo jobSeekerBioDataPojo= new JobSeekerBioDataPojo();
			jobSeekerBioDataPojo.setjFirstName("Pooja Reddy");
			jobSeekerBioDataPojo.setjLastName("Nathala");
			jobSeekerBioDataPojo.setjEmail("nathalapooja@biodata");
			jobSeekerBioDataPojo.setjPhone(1234567890);
			jobSeekerBioDataPojo.setjSchool("MVSR");
			jobSeekerBioDataPojo.setjDegree("B.E");
			jobSeekerBioDataPojo.setjFStudy("Electronics");
			jobSeekerBioDataPojo.setjSStudyMonth("August");
			jobSeekerBioDataPojo.setjSStudyYear("2010");
			jobSeekerBioDataPojo.setjEStudyMonth("May");
			jobSeekerBioDataPojo.setjEStudyYear("2014");
			jobSeekerBioDataPojo.setjWJobTitle("SQL Developer");
			jobSeekerBioDataPojo.setjWCompany("ADP");
			jobSeekerBioDataPojo.setjWCountry("India");
			jobSeekerBioDataPojo.setjWCity("Hyderabad");
			jobSeekerBioDataPojo.setjSWorkMonth("September");
			jobSeekerBioDataPojo.setjSWorkYear("2014");
			jobSeekerBioDataPojo.setjEWorkMonth("December");
			jobSeekerBioDataPojo.setjEWorkYear("2016");
			assertTrue("biodata",repo1.addBioData(jobSeekerBioDataPojo));
			
			JobSeekerBioDataPojo jobSeekerBioDataPojo1;	
			jobSeekerBioDataPojo1=repo1.getBioData("nathalapooja123@biodata");
			assertEquals("Pooja Reddy",jobSeekerBioDataPojo1.getjFirstName());
			assertEquals("Nathala",jobSeekerBioDataPojo1.getjLastName());
			assertEquals("nathalapooja123@biodata",jobSeekerBioDataPojo1.getjEmail());
			assertEquals("123456890",jobSeekerBioDataPojo1.getjPhone());
			assertEquals("MVSR",jobSeekerBioDataPojo1.getjSchool());
			assertEquals("B.E",jobSeekerBioDataPojo1.getjDegree());
			assertEquals("Electronics",jobSeekerBioDataPojo1.getjFStudy());
			assertEquals("August",jobSeekerBioDataPojo1.getjSStudyMonth());
			assertEquals("2010",jobSeekerBioDataPojo1.getjSStudyYear());
			assertEquals("May",jobSeekerBioDataPojo1.getjEStudyMonth());
			assertEquals("2014",jobSeekerBioDataPojo1.getjEStudyYear());
			assertEquals("SQL Developer",jobSeekerBioDataPojo1.getjWJobTitle());
			assertEquals("ADP",jobSeekerBioDataPojo1.getjWCompany());
			assertEquals("India",jobSeekerBioDataPojo1.getjWCountry());
			assertEquals("Hyderabad",jobSeekerBioDataPojo1.getjWCity());
			assertEquals("September",jobSeekerBioDataPojo1.getjSWorkMonth());
			assertEquals("2014",jobSeekerBioDataPojo1.getjSWorkYear());
			assertEquals("December",jobSeekerBioDataPojo1.getjEWorkMonth());
			assertEquals("2016",jobSeekerBioDataPojo1.getjEWorkYear());

			
			
	  }
	  
	  

}
