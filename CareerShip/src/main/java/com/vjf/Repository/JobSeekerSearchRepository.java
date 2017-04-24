package com.vjf.Repository;

import java.util.List;

import com.vjf.car.model.EmployerJobPostPojo;


public interface JobSeekerSearchRepository {
	
	public List<EmployerJobPostPojo> basicSearch(String search);
	public List<EmployerJobPostPojo> advancedSearch(String search_title,
			String value);
	
	

}
