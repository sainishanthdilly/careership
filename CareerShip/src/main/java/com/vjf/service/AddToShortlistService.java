package com.vjf.service;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.vjf.car.model.AddToShortListPojo;

public interface AddToShortlistService {

	public List<AddToShortListPojo> processAppliedCandidates(String string);

	public List<AddToShortListPojo> processShortlistCandidates(String string);

	public void shortListACandidate(long parseLong);

	public void sendEmailSelectedCandidates(String string) throws AddressException, MessagingException;

}
