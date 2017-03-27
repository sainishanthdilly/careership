package com.vjf.car.model;

public class EmployerLoginPojo {
	
  private String email;
  private String password;
  private long phone;
  private String company_name;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((company_name == null) ? 0 : company_name.hashCode());
	result = prime * result + ((email == null) ? 0 : email.hashCode());
	result = prime * result + ((password == null) ? 0 : password.hashCode());
	result = prime * result + (int) (phone ^ (phone >>> 32));
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
	EmployerLoginPojo other = (EmployerLoginPojo) obj;
	if (company_name == null) {
		if (other.company_name != null)
			return false;
	} else if (!company_name.equals(other.company_name))
		return false;
	if (email == null) {
		if (other.email != null)
			return false;
	} else if (!email.equals(other.email))
		return false;
	if (password == null) {
		if (other.password != null)
			return false;
	} else if (!password.equals(other.password))
		return false;
	if (phone != other.phone)
		return false;
	return true;
}
@Override
public String toString() {
	return "EmployerLoginPojo [email=" + email + ", password=" + password + ", phone=" + phone + ", company_name="
			+ company_name + "]";
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
public String getCompany_name() {
	return company_name;
}
public void setCompany_name(String company_name) {
	this.company_name = company_name;
}
  
  
  

}
