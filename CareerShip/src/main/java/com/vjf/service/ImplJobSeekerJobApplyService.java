package com.vjf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.JobSeekerApplyJobRepository;
import com.vjf.Repository.JobSeekerRepository;
import com.vjf.car.model.JobSeekerJobApplyPojo;

@Service
public class ImplJobSeekerJobApplyService implements JobSeekerJobApplyService {
	
	
	@Autowired
	private	JobSeekerApplyJobRepository jobSeekerApplyJobRepository;
	
	
	@Override
	public boolean processApplyJob(long job_post_id, String jobseeker_email){
		JobSeekerJobApplyPojo jobSeekerJobApplyPojo= new JobSeekerJobApplyPojo();
		jobSeekerJobApplyPojo.setJob_post_id(job_post_id);
		jobSeekerJobApplyPojo.setJobseeker_email(jobseeker_email);
		return jobSeekerApplyJobRepository.applyPostData(jobSeekerJobApplyPojo);
		
	}
	
	@Override
	public void verifyAddToShortlist(String add_To_shortlist) {
		// TODO Auto-generated method stub
		jobSeekerApplyJobRepository.addToShortlist( add_To_shortlist);
	}


	

}
