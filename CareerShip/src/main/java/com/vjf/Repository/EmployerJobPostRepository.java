package com.vjf.Repository;

import java.util.List;

import com.vjf.car.model.EmployerJobPostPojo;

public interface EmployerJobPostRepository {
	
	 public boolean addJob(EmployerJobPostPojo employerJobPostPojo);
		
	 public List<EmployerJobPostPojo> getJobsPosted(String eEmail);
	 
	 public List<EmployerJobPostPojo> getALLJobsPosted(String jEmail);
	 
	 public boolean deleteJobPost(long id);
	 
	 public boolean checkEmail_verify(String email);

	public boolean editJob(EmployerJobPostPojo employerJobPostPojo);
	 	

}
