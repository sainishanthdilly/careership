package com.vjf.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface EmployerService {
	
	public boolean processLogin(String email, String password);
	public boolean processReg(String email, String password, String company_name
			, long phone);
	
	public void sendEmail(String toAddress, String link) throws AddressException,
			MessagingException;
	
	
	public void verifyEmail(String email);
	

}
