package com.vjf.car.model;

public class EmployerRegistration {
	
	public String eName;
	public String ePassword;
	public String eCompanyName;
	public long ePhone;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eCompanyName == null) ? 0 : eCompanyName.hashCode());
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + ((ePassword == null) ? 0 : ePassword.hashCode());
		result = prime * result + (int) (ePhone ^ (ePhone >>> 32));
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
		EmployerRegistration other = (EmployerRegistration) obj;
		if (eCompanyName == null) {
			if (other.eCompanyName != null)
				return false;
		} else if (!eCompanyName.equals(other.eCompanyName))
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (ePassword == null) {
			if (other.ePassword != null)
				return false;
		} else if (!ePassword.equals(other.ePassword))
			return false;
		if (ePhone != other.ePhone)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EmployerRegistration [eName=" + eName + ", ePassword=" + ePassword + ", eCompanyName=" + eCompanyName
				+ ", ePhone=" + ePhone + "]";
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getePassword() {
		return ePassword;
	}
	public void setePassword(String ePassword) {
		this.ePassword = ePassword;
	}
	public String geteCompanyName() {
		return eCompanyName;
	}
	public void seteCompanyName(String eCompanyName) {
		this.eCompanyName = eCompanyName;
	}
	public long getePhone() {
		return ePhone;
	}
	public void setePhone(long ePhone) {
		this.ePhone = ePhone;
	}
	
	

}
