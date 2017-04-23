package com.vjf.Repository;

import com.vjf.car.model.JobSeekerBioDataPojo;
import com.vjf.car.model.JobSeekerLoginPojo;

public interface JobSeekerRepository {
	
	public boolean addUser(JobSeekerLoginPojo jobSeekerLoginPojo);
	
	public boolean getUser(String uname, String password);
	
	public void verifyEmail(String email);
	
	public boolean checkjEmail(String email);
	
	public boolean addBioData(JobSeekerBioDataPojo jobSeekerBioDataPojo);
	
	public boolean checkBioDataExists(String jEmail);
	
	public JobSeekerBioDataPojo getBioData(String jEmail);
	

}
