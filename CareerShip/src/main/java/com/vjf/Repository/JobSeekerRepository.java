package com.vjf.Repository;

import com.vjf.car.model.JobSeekerLoginPojo;

public interface JobSeekerRepository {
	
	public boolean addUser(JobSeekerLoginPojo jobSeekerLoginPojo);
	
	public boolean getUser(String uname, String password);
	
	public void verifyEmail(String email);
	
	public boolean checkjEmail(String email);
	

}
