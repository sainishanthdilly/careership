package com.vjf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.JobSeekerRepository;
import com.vjf.car.model.JobSeekerLoginPojo;


@Service
public class ImplJobSeekerService implements JobSeekerService {

	@Autowired
	private	JobSeekerRepository jobSeekerLoginRepository;
	
	
	
	@Override
	public boolean processLogin(String umane, String password) {
		return jobSeekerLoginRepository.getUser(umane, password);
		
	}



	@Override
	public boolean processReg(String email, String password, String first_name, String middle_name, String last_name) {
		// TODO Auto-generated method stub
		JobSeekerLoginPojo jobSeekerLoginPojo= new JobSeekerLoginPojo();
		jobSeekerLoginPojo.setEmail(email);
		jobSeekerLoginPojo.setPassword(password);
		jobSeekerLoginPojo.setFirst_name(first_name);
		jobSeekerLoginPojo.setMiddle_name(middle_name);
		jobSeekerLoginPojo.setLast_name(last_name);
		return jobSeekerLoginRepository.addUser(jobSeekerLoginPojo);
	}
	
	

}
