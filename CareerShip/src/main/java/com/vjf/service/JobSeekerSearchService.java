package com.vjf.service;

import java.util.List;

import com.vjf.car.model.EmployerJobPostPojo;

public interface JobSeekerSearchService {

	public List<EmployerJobPostPojo> search(String searchCriterai);
	
	public List<EmployerJobPostPojo>  advancedSearch(String search_string,String search_value);

	
	
	
}
