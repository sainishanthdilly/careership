package com.vjf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.JobSeekerSearchRepository;
import com.vjf.car.model.EmployerJobPostPojo;

@Service
public class ImplJobSeekerSearchService implements JobSeekerSearchService{

	@Autowired
	JobSeekerSearchRepository jobSeekerSearchRepository;
	
	@Override
	public List<EmployerJobPostPojo> search(String searchCriterai) {
		// TODO Auto-generated method stub
		return jobSeekerSearchRepository.basicSearch(searchCriterai);
	}

	@Override
	public List<EmployerJobPostPojo> advancedSearch(String search_string, String search_value) {
		// TODO Auto-generated method stub
		return jobSeekerSearchRepository.advancedSearch(search_string,search_value);
	}

}
