package com.vjf.service;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.JobSeekerRepository;
import com.vjf.car.model.JobSeekerLoginPojo;


@Service
public class ImplJobSeekerService implements JobSeekerService {

	@Autowired
	private	JobSeekerRepository jobSeekerLoginRepository;
	

	protected final String host ="smtp.gmail.com";
	protected final String port ="587";
	protected final String userName="jobseeker.careership@gmail.com";
	protected final String password="careership";


    private final String subject=" No reply- Automatically generated email  ";


	private final String message="Thank you for joining the Career Ship "
			+ "\n Please click on the link below to confirming your email address ";
	
	private final String mesg1 = "May your dreams been sailed to destination";

	private final String mesg2   = "The Career Ship Team";
	
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



	@Override
	public void sendEmail(String toAddress, String link) throws AddressException, MessagingException {
		// TODO Auto-generated method stub
		

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
		//msg.setSubject(subject,"text/html");
		
		String html;
		
		
	    link ="<a href= "+"http://localhost:8080"+"/vjf/mailverify/jobseeker"+"?email="+link
	    		+ " > Click to register </a>";
	    
	    html = message +"<br>"+ mesg1 +"<br>"+ link+ "<br>"+ mesg2;
		
		msg.setContent(html, "text/html; charset=utf-8"); 
		msg.setSentDate(new Date());
		//msg.setText(message,"UTF-8","html");
		

		// sends the e-mail
		Transport.send(msg);


		
	}



	@Override
	public void verifyEmail(String email) {
		// TODO Auto-generated method stub
		jobSeekerLoginRepository.verifyEmail(email);
	}
	
	

}
