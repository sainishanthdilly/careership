package com.vjf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vjf.Repository.EmployerJobPostRepository;
import com.vjf.car.model.EmployerJobPostPojo;


@Service
public class ImplEmployerJobPostService implements EmployerJobPostService {

	
	@Autowired
	private	EmployerJobPostRepository employerJobPostRepository;
	
	
	
	
	@Override
	public List<EmployerJobPostPojo> processGetJobPosts(String email) {
		// TODO Auto-generated method stub
		return employerJobPostRepository.getJobsPosted(email);
	}

	@Override
	public boolean processAddJobPosts(String desc, String title, String location, String post_email) {
		// TODO Auto-generated method stub
		EmployerJobPostPojo employerJobPostPojo = new EmployerJobPostPojo();
		employerJobPostPojo.setDesc(desc);
		employerJobPostPojo.setLocation(location);
		employerJobPostPojo.setPost_email(post_email);
		employerJobPostPojo.setTitle(title);
		
		return employerJobPostRepository.addJob(employerJobPostPojo);
	}

	@Override
	public List<EmployerJobPostPojo> processGetALLJobPosts() {
		// TODO Auto-generated method stub
		return employerJobPostRepository.getALLJobsPosted();
	}

	@Override
	public boolean processdeleteJobPost(long job_post_id) {
		// TODO Auto-generated method stub
		return employerJobPostRepository.deleteJobPost(job_post_id);
	}

}
