package com.vjf.service;

import java.util.Date;
import java.util.List;
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

import com.vjf.Repository.EmplyerShortlistedRepository;
import com.vjf.car.model.AddToShortListPojo;

@Service
public class ImplAddToShortlistService implements AddToShortlistService{

	@Autowired
	EmplyerShortlistedRepository emplyerShortlistedRepository;
	
	protected final String host ="smtp.gmail.com";
	protected final String port ="587";
	protected final String userName="employer.careership@gmail.com";
	protected final String password="careership";


    private final String subject=" Congratulations ! ";


	private String message=" ";
	
		
	@Override
	public List<AddToShortListPojo> processAppliedCandidates(String string) {
		// TODO Auto-generated method stub
		return emplyerShortlistedRepository.processAppliedCandidates(string);//string employer email
	}

	@Override
	public List<AddToShortListPojo> processShortlistCandidates(String string) {
		// TODO Auto-generated method stub
		return emplyerShortlistedRepository.processShortlistCandidates(string);//string employer email
	}

	@Override
	public void shortListACandidate(long parseLong) {
		// TODO Auto-generated method stub
		emplyerShortlistedRepository.shortListACandidate(parseLong);
		
		
	}

	@Override
	public void sendEmailSelectedCandidates(String string) throws MessagingException {
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
		
		List<AddToShortListPojo>  list= emplyerShortlistedRepository.processShortlistCandidates(string);
		InternetAddress[] toAddresses = new InternetAddress[list.size()];
		int i=0;
		for(AddToShortListPojo shortlist : list ){
		
			toAddresses[i++] = new InternetAddress(shortlist.getJobSeeker_email());
		}
		
	//	InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
		msg.setRecipients(Message.RecipientType.TO, toAddresses);
		msg.setSubject(subject);
		msg.setSentDate(new Date());

		String html;
		
		string  = emplyerShortlistedRepository.getCompanyName(string);
		
		message = "Hi, " +
     "Thank you for your interest in  " + string +  
    " Company ! I’m pleased to invite you to participate in the recruiting "
    + "process "
    + ". The first step consists of a phone interview "
    +" conducted by a member of the Recruiting team and an analytical assessment."+" <br /> <br />"
    + "Best regards,"+"<br />"+ "Senior Recruiter";
	    
	    html = message;
		
		msg.setContent(html, "text/html; charset=utf-8"); 
		
		//msg.setText(message);

		// sends the e-mail
		Transport.send(msg);

		
		
	}

}
