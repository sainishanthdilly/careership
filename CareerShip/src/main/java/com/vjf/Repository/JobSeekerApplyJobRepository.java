package com.vjf.Repository;

import com.vjf.car.model.JobSeekerJobApplyPojo;

public interface JobSeekerApplyJobRepository {

	boolean applyPostData(JobSeekerJobApplyPojo jobSeekerjobApplyPojo);

	
	void addToShortlist(String add_To_shortlist);

	
	
	
}
