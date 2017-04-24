package com.vjf.car.model;

public class AddToShortListPojo {
	
	public int job_apply_id;
	public String jobSeeker_email;
	public String WPosition;
	public String WLocation;
	public boolean shortListed;
	public int getJob_apply_id() {
		return job_apply_id;
	}
	public void setJob_apply_id(int job_apply_id) {
		this.job_apply_id = job_apply_id;
	}
	public String getJobSeeker_email() {
		return jobSeeker_email;
	}
	public void setJobSeeker_email(String jobSeeker_email) {
		this.jobSeeker_email = jobSeeker_email;
	}
	public String getWPosition() {
		return WPosition;
	}
	public void setWPosition(String wPosition) {
		WPosition = wPosition;
	}
	public String getWLocation() {
		return WLocation;
	}
	public void setWLocation(String wLocation) {
		WLocation = wLocation;
	}
	public boolean isShortListed() {
		return shortListed;
	}
	public void setShortListed(boolean shortListed) {
		this.shortListed = shortListed;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((WLocation == null) ? 0 : WLocation.hashCode());
		result = prime * result + ((WPosition == null) ? 0 : WPosition.hashCode());
		result = prime * result + ((jobSeeker_email == null) ? 0 : jobSeeker_email.hashCode());
		result = prime * result + job_apply_id;
		result = prime * result + (shortListed ? 1231 : 1237);
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
		AddToShortListPojo other = (AddToShortListPojo) obj;
		if (WLocation == null) {
			if (other.WLocation != null)
				return false;
		} else if (!WLocation.equals(other.WLocation))
			return false;
		if (WPosition == null) {
			if (other.WPosition != null)
				return false;
		} else if (!WPosition.equals(other.WPosition))
			return false;
		if (jobSeeker_email == null) {
			if (other.jobSeeker_email != null)
				return false;
		} else if (!jobSeeker_email.equals(other.jobSeeker_email))
			return false;
		if (job_apply_id != other.job_apply_id)
			return false;
		if (shortListed != other.shortListed)
			return false;
		return true;
	}
	
	
	
	

	

}
