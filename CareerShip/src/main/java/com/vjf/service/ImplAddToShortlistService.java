package com.vjf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.EmplyerShortlistedRepository;
import com.vjf.car.model.AddToShortListPojo;

@Service
public class ImplAddToShortlistService implements AddToShortlistService{

	@Autowired
	EmplyerShortlistedRepository emplyerShortlistedRepository;
	
	@Override
	public List<AddToShortListPojo> processAppliedCandidates(String string) {
		// TODO Auto-generated method stub
		return emplyerShortlistedRepository.processAppliedCandidates(string);
	}

	@Override
	public List<AddToShortListPojo> processShortlistCandidates(String string) {
		// TODO Auto-generated method stub
		return emplyerShortlistedRepository.processShortlistCandidates(string);
	}

	@Override
	public void shortListACandidate(long parseLong) {
		// TODO Auto-generated method stub
		emplyerShortlistedRepository.shortListACandidate(parseLong);
		
		
	}

}
