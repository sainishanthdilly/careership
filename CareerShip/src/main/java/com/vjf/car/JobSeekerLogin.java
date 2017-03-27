package com.vjf.car;

public class JobSeekerLogin {
	
	String jName;
	String jPassword;

	
	
	@Override
	public String toString() {
		return "JobSeekerLogin [jName=" + jName + ", jPassword=" + jPassword + "]";
	}
	public String getjName() {
		return jName;
	}
	public void setjName(String jName) {
		this.jName = jName;
	}
	public String getjPassword() {
		return jPassword;
	}
	public void setjPassword(String jPassword) {
		this.jPassword = jPassword;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jName == null) ? 0 : jName.hashCode());
		result = prime * result + ((jPassword == null) ? 0 : jPassword.hashCode());
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
		JobSeekerLogin other = (JobSeekerLogin) obj;
		if (jName == null) {
			if (other.jName != null)
				return false;
		} else if (!jName.equals(other.jName))
			return false;
		if (jPassword == null) {
			if (other.jPassword != null)
				return false;
		} else if (!jPassword.equals(other.jPassword))
			return false;
		return true;
	}
	
	

}
