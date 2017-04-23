package com.vjf.service;

public interface JobSeekerJobApplyService {

	boolean processApplyJob( int job_post_id, String jobseeker_email);

	void verifyAddToShortlist(String add_To_shortlist);
	
	
	

}
