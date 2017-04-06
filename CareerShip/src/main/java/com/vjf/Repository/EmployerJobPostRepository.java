package com.vjf.Repository;

import java.util.List;

import com.vjf.car.model.EmployerJobPostPojo;

public interface EmployerJobPostRepository {
	
	 public boolean addJob(EmployerJobPostPojo employerJobPostPojo);
		
	 public List<EmployerJobPostPojo> getJobsPosted(String eEmail);
	 
	 public List<EmployerJobPostPojo> getALLJobsPosted();
	 
	 public boolean deleteJobPost(long id);
	 	

}
