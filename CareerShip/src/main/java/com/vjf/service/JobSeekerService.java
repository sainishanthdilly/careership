package com.vjf.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface JobSeekerService {

	public boolean processLogin(String umane, String password);
	public boolean processReg(String uname, String password, String first_name
			, String middle_name, String last_name);
	
	public void sendEmail(String toAddress, String link) throws AddressException,
	MessagingException;
	
	public void verifyEmail(String email);

	



}
