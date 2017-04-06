package com.vjf.pojo;

public class EmployerLogin {
	public String eName;
	public String ePassword;
	
	@Override
	public String toString() {
		return "EmployerLogin [eName=" + eName + ", ePassword=" + ePassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + ((ePassword == null) ? 0 : ePassword.hashCode());
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
		EmployerLogin other = (EmployerLogin) obj;
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
		return true;
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
	
	

}
