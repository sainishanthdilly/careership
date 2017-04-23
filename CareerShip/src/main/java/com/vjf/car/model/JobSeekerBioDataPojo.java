package com.vjf.car.model;

//import java.math.BigInteger;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class JobSeekerBioDataPojo {

	public String jFirstName;
	public String jLastName;
	public String jEmail;
	public long   jPhone;
	public String jSchool;
	public String jDegree;
	public String jFStudy;
	public String jSStudyMonth;
	public String jSStudyYear;
	public String jEStudyMonth;
	public String jEStudyYear;
	public String jWJobTitle;
	public String jWCompany;
	public String jWCountry;
	public String jWCity;
	public String jSWorkMonth;
	public String jSWorkYear;
	public String jEWorkMonth;
	public String jEWorkYear;
	public String jWDescription;
	
	public String getjFirstName() {
		return jFirstName;
	}
	public void setjFirstName(String jFirstName) {
		this.jFirstName = jFirstName;
	}
	public String getjLastName() {
		return jLastName;
	}
	public void setjLastName(String jLastName) {
		this.jLastName = jLastName;
	}
	public String getjEmail() {
		return jEmail;
	}
	public void setjEmail(String jEmail) {
		this.jEmail = jEmail;
	}
	public long getjPhone() {
		return jPhone;
	}
	public void setjPhone(long jPhone) {
		this.jPhone = jPhone;
	}
	public String getjSchool() {
		return jSchool;
	}
	public void setjSchool(String jSchool) {
		this.jSchool = jSchool;
	}
	public String getjDegree() {
		return jDegree;
	}
	public void setjDegree(String jDegree) {
		this.jDegree = jDegree;
	}
	public String getjFStudy() {
		return jFStudy;
	}
	public void setjFStudy(String jFStudy) {
		this.jFStudy = jFStudy;
	}
	public String getjSStudyMonth() {
		return jSStudyMonth;
	}
	public void setjSStudyMonth(String jSStudyMonth) {
		this.jSStudyMonth = jSStudyMonth;
	}
	public String getjSStudyYear() {
		return jSStudyYear;
	}
	public void setjSStudyYear(String jSStudyYear) {
		this.jSStudyYear = jSStudyYear;
	}
	public String getjEStudyMonth() {
		return jEStudyMonth;
	}
	public void setjEStudyMonth(String jEStudyMonth) {
		this.jEStudyMonth = jEStudyMonth;
	}
	public String getjEStudyYear() {
		return jEStudyYear;
	}
	public void setjEStudyYear(String jEStudyYear) {
		this.jEStudyYear = jEStudyYear;
	}
	public String getjWJobTitle() {
		return jWJobTitle;
	}
	public void setjWJobTitle(String jWJobTitle) {
		this.jWJobTitle = jWJobTitle;
	}
	public String getjWCompany() {
		return jWCompany;
	}
	public void setjWCompany(String jWCompany) {
		this.jWCompany = jWCompany;
	}
	public String getjWCountry() {
		return jWCountry;
	}
	public void setjWCountry(String jWCountry) {
		this.jWCountry = jWCountry;
	}
	public String getjWCity() {
		return jWCity;
	}
	public void setjWCity(String jWCity) {
		this.jWCity = jWCity;
	}
	public String getjSWorkMonth() {
		return jSWorkMonth;
	}
	public void setjSWorkMonth(String jSWorkMonth) {
		this.jSWorkMonth = jSWorkMonth;
	}
	public String getjSWorkYear() {
		return jSWorkYear;
	}
	public void setjSWorkYear(String jSWorkYear) {
		this.jSWorkYear = jSWorkYear;
	}
	public String getjEWorkMonth() {
		return jEWorkMonth;
	}
	public void setjEWorkMonth(String jEWorkMonth) {
		this.jEWorkMonth = jEWorkMonth;
	}
	public String getjEWorkYear() {
		return jEWorkYear;
	}
	public void setjEWorkYear(String jEWorkYear) {
		this.jEWorkYear = jEWorkYear;
	}
	public String getjWDescription() {
		return jWDescription;
	}
	public void setjWDescription(String jWDescription) {
		this.jWDescription = jWDescription;
	}
	@Override
	public int hashCode() {
		final int prime = 2^20-1;
		int result = 1;
		result = prime * result + ((jFirstName == null) ? 0 : jFirstName.hashCode());
		result = prime * result + ((jLastName == null) ? 0 : jLastName.hashCode());
		result = prime * result + ((jEmail == null) ? 0 : jEmail.hashCode());
		result = prime * result +(int) (jPhone ^ (jPhone >>> 32));
		result = prime * result + ((jSchool == null) ? 0 : jSchool.hashCode());
		result = prime * result + ((jDegree == null) ? 0 : jDegree.hashCode());
		result = prime * result + ((jFStudy == null) ? 0 : jFStudy.hashCode());
		result = prime * result + ((jSStudyMonth == null) ? 0 : jSStudyMonth.hashCode());
		result = prime * result + ((jSStudyYear == null) ? 0 : jSStudyYear.hashCode());
		result = prime * result + ((jEStudyMonth == null) ? 0 : jEStudyMonth.hashCode());
		result = prime * result + ((jEStudyYear == null) ? 0 : jEStudyYear.hashCode());
		result = prime * result + ((jWJobTitle == null) ? 0 : jWJobTitle.hashCode());
		result = prime * result + ((jWCompany == null) ? 0 : jWCompany.hashCode());
		result = prime * result + ((jWCountry == null) ? 0 : jWCountry.hashCode());
		result = prime * result + ((jWCity == null) ? 0 : jWCity.hashCode());
		result = prime * result + ((jSWorkMonth == null) ? 0 : jSWorkMonth.hashCode());
		result = prime * result + ((jSWorkYear == null) ? 0 : jSWorkYear.hashCode());
		result = prime * result + ((jEWorkMonth == null) ? 0 : jEWorkMonth.hashCode());
		result = prime * result + ((jEWorkYear == null) ? 0 : jEWorkYear.hashCode());
		result = prime * result + ((jWDescription == null) ? 0 : jWDescription.hashCode());
		return result;
	} 
	

	
	
	
}
