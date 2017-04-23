package com.vjf.service;

public interface JobSeekerJobApplyService {

	boolean processApplyJob( long job_post_id, String jobseeker_email);

	void verifyAddToShortlist(String add_To_shortlist);
	
	
	

}
