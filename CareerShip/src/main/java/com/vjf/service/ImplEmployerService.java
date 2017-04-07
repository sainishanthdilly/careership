package com.vjf.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.EmployerRepository;
import com.vjf.car.model.EmployerLoginPojo;
@Service
public class ImplEmployerService implements EmployerService {
	
	@Autowired
	private	EmployerRepository employerRepository;
	
	
	protected final String host ="smtp.gmail.com";
	protected final String port ="587";
	protected final String userName="employer.careership@gmail.com";
	protected final String password="careership";


    private final String subject=" No reply- Automatically generated email  ";


	private final String message="Thank you for joining the Career Ship "
			+ "\n Please click on the link below to confirming your email address ";
	
	private final String mesg1 = "May your dreams been sailed to destination";

	private final String mesg2   = "The Career Ship Team";

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

	@Override
	public void sendEmail(String toAddress, String link) throws AddressException, MessagingException {
				
		
		        Properties properties = new Properties();
				properties.put("mail.smtp.host", host);
				properties.put("mail.smtp.port", port);
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.starttls.enable", "true");

				// creates a new session with an authenticator
				Authenticator auth = new Authenticator() {
					
					public PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(userName, password);
					}
				};

				Session session = Session.getInstance(properties, auth);

				// creates a new e-mail message
				Message msg = new MimeMessage(session);

				msg.setFrom(new InternetAddress(userName));
				InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
				msg.setRecipients(Message.RecipientType.TO, toAddresses);
				msg.setSubject(subject);
				msg.setSentDate(new Date());

				String html;
				
				
			    link ="<a href= "+"http://localhost:8080"+"/vjf/mailverify/employer"+"?email="+link
			    		+ " > Click to register </a>";
			    
			    html = message +"<br>"+ mesg1 +"<br>"+ link+ "<br>"+ mesg2;
				
				msg.setContent(html, "text/html; charset=utf-8"); 
				
				//msg.setText(message);

				// sends the e-mail
				Transport.send(msg);

		
		
		
	}

	@Override
	public void verifyEmail(String email) {
		// TODO Auto-generated method stub
		
		employerRepository.verifyEmail(email);
		
	}

}
