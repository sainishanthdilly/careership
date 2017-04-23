package com.vjf.car.model;

public class JobSeekerRegistration {
	
	public String jEmail;
	public String jPassword;
	public String jFirstName;
	public String jMiddleName;
	public String jLastName;
	public String getjEmail() {
		return jEmail;
	}
	public void setjEmail(String jName) {
		this.jEmail = jName;
	}
	public String getjPassword() {
		return jPassword;
	}
	public void setjPassword(String jPassword) {
		this.jPassword = jPassword;
	}
	public String getjFirstName() {
		return jFirstName;
	}
	public void setjFirstName(String jFirstName) {
		this.jFirstName = jFirstName;
	}
	public String getjMiddleName() {
		return jMiddleName;
	}
	public void setjMiddleName(String jmiddleName) {
		this.jMiddleName = jmiddleName;
	}
	public String getjLastName() {
		return jLastName;
	}
	public void setjLastName(String jLastName) {
		this.jLastName = jLastName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jFirstName == null) ? 0 : jFirstName.hashCode());
		result = prime * result + ((jLastName == null) ? 0 : jLastName.hashCode());
		result = prime * result + ((jEmail == null) ? 0 : jEmail.hashCode());
		result = prime * result + ((jPassword == null) ? 0 : jPassword.hashCode());
		result = prime * result + ((jMiddleName == null) ? 0 : jMiddleName.hashCode());
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
		JobSeekerRegistration other = (JobSeekerRegistration) obj;
		if (jFirstName == null) {
			if (other.jFirstName != null)
				return false;
		} else if (!jFirstName.equals(other.jFirstName))
			return false;
		if (jLastName == null) {
			if (other.jLastName != null)
				return false;
		} else if (!jLastName.equals(other.jLastName))
			return false;
		if (jEmail == null) {
			if (other.jEmail != null)
				return false;
		} else if (!jEmail.equals(other.jEmail))
			return false;
		if (jPassword == null) {
			if (other.jPassword != null)
				return false;
		} else if (!jPassword.equals(other.jPassword))
			return false;
		if (jMiddleName == null) {
			if (other.jMiddleName != null)
				return false;
		} else if (!jMiddleName.equals(other.jMiddleName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JobSeekerRegistration [jName=" + jEmail + ", jPassword=" + jPassword + ", jFirstName=" + jFirstName
				+ ", jmiddleName=" + jMiddleName + ", jLastName=" + jLastName + "]";
	}
	
	
	


}
