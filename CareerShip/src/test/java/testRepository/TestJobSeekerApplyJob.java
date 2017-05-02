package testRepository;
import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.vjf.Repository.ImpEmployerRepository;
import com.vjf.Repository.ImpJobSeekerRepository;
import com.vjf.Repository.ImplEmployerJobPostRepository;
import com.vjf.Repository.ImplJobSeekerApplyJobRepository;
import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.car.model.JobSeekerJobApplyPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public class TestJobSeekerApplyJob {
	final String DB_URL = "jdbc:mysql://localhost/VJF_MOCK";
	ImplJobSeekerApplyJobRepository repo=new ImplJobSeekerApplyJobRepository();
	ImpJobSeekerRepository repo1=new  ImpJobSeekerRepository();
	ImplEmployerJobPostRepository repo2 = new ImplEmployerJobPostRepository();
	   ImpEmployerRepository repo3 = new ImpEmployerRepository();
	   PreparedStatement stmt = null;
		ResultSet rs=null;
		public Connection conn = null;

	public TestJobSeekerApplyJob(){
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		repo2.setConnection(DB_URL);
		repo3.setConnection(DB_URL);
		 conn=repo.conn;
		
	}
	@Test
	   public void testDataBaseConnection() {
			
		   assertNotNull(repo.conn);
		   assertNotNull(repo1.conn);
		   assertNotNull(repo2.conn);
		   assertNotNull(repo3.conn);
		   
	}
	

	@Test
	public void testFalse() throws SQLException {
		//jobseeker email
		JobSeekerLoginPojo jobSeekerLoginPojo=new JobSeekerLoginPojo();
		jobSeekerLoginPojo.setEmail("nathalapooja@applytest");
		jobSeekerLoginPojo.setPassword("Pnathala123");
		jobSeekerLoginPojo.setFirst_name("Pooja Reddy");
		jobSeekerLoginPojo.setMiddle_name(null);
		jobSeekerLoginPojo.setLast_name("Nathala");
		
		
		assertTrue("Inserted JobSeeker in Database", repo1.addUser(jobSeekerLoginPojo));
		 
		   stmt = conn.prepareStatement(" select email, password, first_name, middle_name, "
					+ " last_name  from JobSeeker_login where email = ? and password = ? ");
			
			
			stmt.setString(1, "nathalapooja@applytest");
			stmt.setString(2, "Pnathala123");
			
			
			rs= stmt.executeQuery();rs.next();
			assertEquals("nathalapooja@applytest",rs.getString(1));
			assertEquals("Pnathala123",rs.getString(2));
			assertEquals("Pooja Reddy",rs.getString(3));
			assertEquals(null,rs.getString(4));
			assertEquals("Nathala",rs.getString(5));
		
		
		// Employer login for posting jobs
		EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  assertTrue("Inserted Employer in Database", repo3.addUser(employerLoginPojo));
		  stmt = conn.prepareStatement(" select email, password, company_name, phone"
					+ "   from Employer_login where email = ? and password = ? ");
			
			
			stmt.setString(1, "testpojo@adp");
			stmt.setString(2, "adp");
			rs= stmt.executeQuery();
			rs.next();
			assertEquals("testpojo@adp",rs.getString(1));
			assertEquals("adp",rs.getString(2));
			assertEquals("ADP ADP",rs.getString(3));
			assertEquals("1234",rs.getString(4));
		   
	// Employer post job for job_post_id
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo();
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("DBA ADMIN");
		   employerPostJobTest.setPost_id(1);
		   
		   assertTrue("Inserted Employer JOB POST in Database", repo2.addJob(employerPostJobTest));
		   assertTrue("Fetched Job From DB",repo2.getALLJobsPosted("testpojo@adp").size()>0);	
			 
		   EmployerJobPostPojo employerPostJobTestSele  =  repo2.getJobsPosted("testpojo@adp").get(0);
		   assertTrue(employerPostJobTestSele.getCompany_name().equals("ADP ADP"));
		   assertTrue(employerPostJobTestSele.getDesc().equals("SQL DEvelpoer full time"));
		   assertTrue(employerPostJobTestSele.getLocation().equals("New york"));
		   assertTrue(employerPostJobTestSele.getTitle().equals("DBA ADMIN"));
		   
		   
		   //Jobseeker applying for jobs with references to jobSeeker_login and Employer_job_post
	JobSeekerJobApplyPojo jobSeekerApplyPojo=new JobSeekerJobApplyPojo();
	    jobSeekerApplyPojo.setJob_apply_id(1);
		jobSeekerApplyPojo.setJob_post_id(1);
		jobSeekerApplyPojo.setJobseeker_email("nathalapooja@applytest");
		jobSeekerApplyPojo.setAdd_To_Shortlist("False");
		
		
		
		assertFalse("Inserted Employer JOB POST in Database", repo.applyPostData(jobSeekerApplyPojo));
		
		
		PreparedStatement pstm2 = conn.prepareStatement("Select job_apply_id, jobseeker_email, add_To_Shortlist,job_post_id "
				+ "from JobSeeker_Apply_Job where job_post_id = ? ");
		
		pstm2.setLong(1,1);
		ResultSet r = pstm2.executeQuery();
		r.next();
		assertEquals(1,r.getLong(1));
		assertEquals("nathalapooja@applytest",r.getString(2));
		assertEquals("False",r.getString(3));
        assertEquals(1,r.getLong(4));
		
		
		
	}
	
	@Test
	public void testTrue() {
		//jobseeker email
		JobSeekerLoginPojo jobSeekerLoginPojo=new JobSeekerLoginPojo();
		jobSeekerLoginPojo.setEmail("nathalapooja@applytest");
		jobSeekerLoginPojo.setPassword("Pnathala123");
		jobSeekerLoginPojo.setFirst_name("Pooja Reddy");
		jobSeekerLoginPojo.setMiddle_name(null);
		jobSeekerLoginPojo.setLast_name("Nathala");
		
		
		
		assertTrue("Inserted Employer in Database", repo1.addUser(jobSeekerLoginPojo));
		
		// Employer login for posting jobs
		EmployerLoginPojo employerLoginPojo = new EmployerLoginPojo();
		   
		   employerLoginPojo.setCompany_name("ADP ADP");
		   employerLoginPojo.setEmail("testpojo@adp");
		   employerLoginPojo.setPhone(1234);
		   employerLoginPojo.setPassword("adp");
		  assertTrue("Inserted Employer in Database", repo3.addUser(employerLoginPojo));
		   
	// Employer post job for job_post_id
		   EmployerJobPostPojo employerPostJobTest = new EmployerJobPostPojo();
		   
		   employerPostJobTest.setCompany_name("ADP ADP");
		   employerPostJobTest.setPost_email("testpojo@adp");
		   employerPostJobTest.setDesc("SQL DEvelpoer full time");
		   employerPostJobTest.setLocation("New york");
		   employerPostJobTest.setTitle("DBA ADMIN");
		   employerPostJobTest.setPost_id(1);
		   
		   assertTrue("Inserted Employer JOB POST in Database", repo2.addJob(employerPostJobTest));
		   
		   
		   EmployerJobPostPojo employerPostJobTestSele  =  repo2.getJobsPosted("testpojo@adp").get(0);
		   assertTrue(employerPostJobTestSele.getCompany_name().equals("ADP ADP"));
		   assertTrue(employerPostJobTestSele.getDesc().equals("SQL DEvelpoer full time"));
		   assertTrue(employerPostJobTestSele.getLocation().equals("New york"));
		   assertTrue(employerPostJobTestSele.getTitle().equals("DBA ADMIN"));
		   
		   
		   
		   //Jobseeker applying for jobs with references to jobSeeker_login and Employer_job_post
	JobSeekerJobApplyPojo jobSeekerApplyPojo=new JobSeekerJobApplyPojo();
	    jobSeekerApplyPojo.setJob_apply_id(1);
		jobSeekerApplyPojo.setJob_post_id(1);
		jobSeekerApplyPojo.setJobseeker_email("nathalapooja@applytest");
		jobSeekerApplyPojo.setAdd_To_Shortlist("False");
		
		
		
		assertTrue("Inserted Employer JOB POST in Database", repo.applyPostData(jobSeekerApplyPojo));
	}
	

}
