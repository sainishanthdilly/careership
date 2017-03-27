package com.vjf.service;

public interface EmployerService {
	
	public boolean processLogin(String email, String password);
	public boolean processReg(String email, String password, String company_name
			, long phone);

}
