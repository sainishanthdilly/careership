package com.vjf.car.model;

public class EmployerJobPostPojo {
	
	long post_id;
	String desc;
	String title;
	String location;
	String post_email;
	public long getPost_id() {
		return post_id;
	}
	public void setPost_id(long post_id) {
		this.post_id = post_id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPost_email() {
		return post_email;
	}
	public void setPost_email(String post_email) {
		this.post_email = post_email;
	}
	@Override
	public String toString() {
		return "EmployerJobPostPojo [post_id=" + post_id + ", desc=" + desc + ", title=" + title + ", location="
				+ location + ", post_email=" + post_email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((post_email == null) ? 0 : post_email.hashCode());
		result = prime * result + (int) (post_id ^ (post_id >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		EmployerJobPostPojo other = (EmployerJobPostPojo) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (post_email == null) {
			if (other.post_email != null)
				return false;
		} else if (!post_email.equals(other.post_email))
			return false;
		if (post_id != other.post_id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	

}
