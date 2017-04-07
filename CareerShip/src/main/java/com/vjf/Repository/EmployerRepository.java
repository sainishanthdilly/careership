package com.vjf.Repository;

import com.vjf.car.model.EmployerLoginPojo;

public interface EmployerRepository {
	
    public boolean addUser(EmployerLoginPojo employerLoginPojo);
	
	public boolean getUser(String uname, String password);
	
	public void verifyEmail(String email);
	
	

}
