package com.vjf.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.vjf.car.model.JobSeekerBioDataPojo;

public interface JobSeekerService {

	public boolean processLogin(String umane, String password);
	public boolean processReg(String uname, String password, String first_name
			, String middle_name, String last_name);
	
	public void sendEmail(String toAddress, String link) throws AddressException,
	MessagingException;
	
	public void verifyEmail(String email);
	
	public boolean checkjEmail(String email);
	
	public  boolean processBioData(String firstName, String lastName, String email, long phone, String school,
			String degree, String fStudy, String sStudyMonth, String sStudyYear, String eStudyMonth,
			String eStudyYear, String wJobTitle, String wCompany, String wCountry, String wCity,
			String sWorkMonth, String sWorkYear, String eWorkMonth, String eWorkYear,String jDescription) ;
	
	public boolean checkBioDataExists(String jEmail);
	
	
	public JobSeekerBioDataPojo getBioData(String jEmail);


	



}
