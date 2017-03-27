package com.vjf.service;

public interface JobSeekerService {

	public boolean processLogin(String umane, String password);
	public boolean processReg(String uname, String password, String first_name
			, String middle_name, String last_name);
	
	
}
