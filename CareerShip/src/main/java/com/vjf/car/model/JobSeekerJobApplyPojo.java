package com.vjf.car.model;

public class JobSeekerJobApplyPojo {
	
	long job_post_id;
	long job_apply_id;
	String jobseeker_email;
	String add_To_Shortlist;
	public long getJob_post_id() {
		return job_post_id;
	}
	public void setJob_post_id(long job_post_id) {
		this.job_post_id = job_post_id;
	}
	public long getJob_apply_id() {
		return job_apply_id;
	}
	public void setJob_apply_id(long job_apply_id) {
		this.job_apply_id = job_apply_id;
	}
	public String getJobseeker_email() {
		return jobseeker_email;
	}
	public void setJobseeker_email(String jobseeker_email) {
		this.jobseeker_email = jobseeker_email;
	}
	public String getAdd_To_Shortlist() {
		return add_To_Shortlist;
	}
	public void setAdd_To_Shortlist(String add_To_Shortlist) {
		this.add_To_Shortlist = add_To_Shortlist;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add_To_Shortlist == null) ? 0 : add_To_Shortlist.hashCode());
		result = prime * result + (int) (job_apply_id ^ (job_apply_id >>> 32));
		result = prime * result + (int) (job_post_id ^ (job_post_id >>> 32));
		result = prime * result + ((jobseeker_email == null) ? 0 : jobseeker_email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobSeekerJobApplyPojo other = (JobSeekerJobApplyPojo) obj;
		if (add_To_Shortlist == null) {
			if (other.add_To_Shortlist != null)
				return false;
		} else if (!add_To_Shortlist.equals(other.add_To_Shortlist))
			return false;
		if (job_apply_id != other.job_apply_id)
			return false;
		if (job_post_id != other.job_post_id)
			return false;
		if (jobseeker_email == null) {
			if (other.jobseeker_email != null)
				return false;
		} else if (!jobseeker_email.equals(other.jobseeker_email))
			return false;
		return true;
	}

	
	
}
