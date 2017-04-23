package com.vjf.service;

import java.util.List;

import com.vjf.car.model.EmployerJobPostPojo;

public interface EmployerJobPostService {
	
	public List<EmployerJobPostPojo> processGetALLJobPosts(String jEmail);
	
	public List<EmployerJobPostPojo> processGetJobPosts(String email);
	public boolean processAddJobPosts

	(
	String desc,
	String title,
	String location,
	String post_email);
	
	public boolean processdeleteJobPost(long job_post_id);
	
	public boolean check_email_Verify(String email);

	public boolean processEditJobPosts(String desc, String title, String location, long post_id);
	
	
}
