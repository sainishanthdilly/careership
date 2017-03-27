package com.vjf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.EmployerRepository;
import com.vjf.car.model.EmployerLoginPojo;
@Service
public class ImplEmployerService implements EmployerService {
	
	@Autowired
	private	EmployerRepository employerRepository;
	

	@Override
	public boolean processLogin(String email, String password) {
		// TODO Auto-generated method stub
		
		return employerRepository.getUser(email, password);
	}

	@Override
	public boolean processReg(String email, String password, String company_name, long phone) {
		// TODO Auto-generated method stub
		EmployerLoginPojo employerLoginPojo= new EmployerLoginPojo();
		employerLoginPojo.setEmail(email);
		employerLoginPojo.setPassword(password);
		employerLoginPojo.setCompany_name(company_name);
		employerLoginPojo.setPhone(phone);
		
		return employerRepository.addUser(employerLoginPojo);
	}

}
