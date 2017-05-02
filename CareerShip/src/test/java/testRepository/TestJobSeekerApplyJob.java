package testRepository;
import static org.junit.Assert.*;

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

	public TestJobSeekerApplyJob(){
		super();
		repo.setConnection(DB_URL);
		repo1.setConnection(DB_URL);
		repo2.setConnection(DB_URL);
		repo3.setConnection(DB_URL);
		
	}
	@Test
	   public void testDataBaseConnection() {
			
		   assertNotNull(repo.conn);
		   assertNotNull(repo1.conn);
		   assertNotNull(repo2.conn);
		   assertNotNull(repo3.conn);
		   
	}
	

	@Test
	public void testFalse() {
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
		   
		   //Jobseeker applying for jobs with references to jobSeeker_login and Employer_job_post
	JobSeekerJobApplyPojo jobSeekerApplyPojo=new JobSeekerJobApplyPojo();
	    jobSeekerApplyPojo.setJob_apply_id(1);
		jobSeekerApplyPojo.setJob_post_id(1);
		jobSeekerApplyPojo.setJobseeker_email("nathalapooja@applytest");
		jobSeekerApplyPojo.setAdd_To_Shortlist("False");
		
		
		
		assertFalse("Inserted Employer JOB POST in Database", repo.applyPostData(jobSeekerApplyPojo));
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
		   
		   //Jobseeker applying for jobs with references to jobSeeker_login and Employer_job_post
	JobSeekerJobApplyPojo jobSeekerApplyPojo=new JobSeekerJobApplyPojo();
	    jobSeekerApplyPojo.setJob_apply_id(1);
		jobSeekerApplyPojo.setJob_post_id(1);
		jobSeekerApplyPojo.setJobseeker_email("nathalapooja@applytest");
		jobSeekerApplyPojo.setAdd_To_Shortlist("False");
		
		
		
		assertTrue("Inserted Employer JOB POST in Database", repo.applyPostData(jobSeekerApplyPojo));
	}
	

}
