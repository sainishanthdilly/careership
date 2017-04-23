package com.vjf.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.JobSeekerBioDataPojo;
import com.vjf.car.model.JobSeekerLoginPojo;
import com.vjf.conn.ConnectionFact;



@Repository
public class ImpJobSeekerRepository implements JobSeekerRepository{

		
	ArrayList<JobSeekerLoginPojo> arrayList;

	public Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet rs=null;

	public ImpJobSeekerRepository() {
		
		 ConnectionFact.GetConn.setConnection1();
		 conn = ConnectionFact.GetConn.getConnection();
		
	}
	
	 public void setConnection(String Mockurl){
		 
		 ConnectionFact.GetConn.setConnectionMock(Mockurl);
			conn = ConnectionFact.GetConn.getConnection();
		 
		 
	 }

	
	
	@Override
	public boolean addUser(JobSeekerLoginPojo jobSeekerLoginPojo) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" insert into JobSeeker_login(email,password,first_name,middle_name,last_name) values (?,?,?,?,?) ");

			stmt.setString(1,  jobSeekerLoginPojo.getEmail());
			stmt.setString(2, jobSeekerLoginPojo.getPassword());
			stmt.setString(3,  jobSeekerLoginPojo.getFirst_name());
			stmt.setString(4, jobSeekerLoginPojo.getMiddle_name());
			stmt.setString(5, jobSeekerLoginPojo.getLast_name());
			
			int r= stmt.executeUpdate();
			
			
	        if(r > 0){
				
				return true;			
			}
	        
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		
		return false;
		
	}

	@Override
	public boolean getUser(String uname, String password) {
		// TODO Auto-generated method stub
		
		try{
		
		stmt = conn.prepareStatement(" select email, password, first_name, middle_name, "
				+ " last_name  from JobSeeker_login where email = ? and password = ? ");
		
		
		stmt.setString(1, uname);
		stmt.setString(2, password);
		
		rs= stmt.executeQuery();
		
		
        if(rs.next()){
			
			return true;			
		}
        
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public void verifyEmail(String email) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" update JobSeeker_login set email_verified =? where email = ? ");
			
			stmt.setString(1, "True");
			stmt.setString(2, email);
		
			stmt.executeUpdate();
			
		}
		catch (Exception e) {
			
		}
		
	}

	@Override
	public boolean checkjEmail(String email) {
		// TODO Auto-generated method stub

		try{
		
		stmt = conn.prepareStatement(" select email_verified from JobSeeker_login where email = ? ");
		
		
		stmt.setString(1, email);
		
		ResultSet rs= stmt.executeQuery();
		
		if(rs.next()){
			
			String s = rs.getString(1);
			
		//	System.out.println(s);
			
		return (s.equals("False"))?false:true;
		}

		
        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	return false;

	}
	
	

	@Override
	public boolean addBioData(JobSeekerBioDataPojo jobSeekerBioDataPojo) {
		// TODO Auto-generated method stub
		
		
		
		if(!checkBioDataExists(jobSeekerBioDataPojo.getjEmail())){
			
		
		try{
			
			
			
			
			stmt = conn.prepareStatement(" insert into JobSeeker_Biodata"
					+ "(first_name,last_name,jobseeker_email,phone , school"
					+ " ,degree,study_field,sfrom_DATEMonth,sfrom_DATEyear"
					+ " ,sto_DATEMonth,sto_DATEyear,job_title,job_company,"
					+ "job_country,job_city , wfrom_DATEMonth,wfrom_DATEyear,"
					+ "wto_DATEMonth,wto_DATEyear,job_Description) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");

			stmt.setString(1,  jobSeekerBioDataPojo.getjFirstName());
			stmt.setString(2,  jobSeekerBioDataPojo.getjLastName());
			stmt.setString(3,  jobSeekerBioDataPojo.getjEmail());
			stmt.setLong(4,  jobSeekerBioDataPojo.getjPhone());
			stmt.setString(5,  jobSeekerBioDataPojo.getjSchool());
			stmt.setString(6,  jobSeekerBioDataPojo.getjDegree());
			stmt.setString(7,  jobSeekerBioDataPojo.getjFStudy());
			stmt.setString(8,  jobSeekerBioDataPojo.getjSStudyMonth());
			stmt.setString(9,  jobSeekerBioDataPojo.getjSStudyYear());
			stmt.setString(10,  jobSeekerBioDataPojo.getjEStudyMonth());
			stmt.setString(11,  jobSeekerBioDataPojo.getjEStudyYear());
			stmt.setString(12,  jobSeekerBioDataPojo.getjWJobTitle());
			stmt.setString(13,  jobSeekerBioDataPojo.getjWCompany());
			stmt.setString(14,  jobSeekerBioDataPojo.getjWCountry());
			stmt.setString(15,  jobSeekerBioDataPojo.getjWCity());
			stmt.setString(16,  jobSeekerBioDataPojo.getjSWorkMonth());
			stmt.setString(17,  jobSeekerBioDataPojo.getjSWorkYear());
			stmt.setString(18,  jobSeekerBioDataPojo.getjEWorkMonth());
			stmt.setString(19,  jobSeekerBioDataPojo.getjEWorkYear());
			stmt.setString(20,  jobSeekerBioDataPojo.getjWDescription());
			
			
			int r= stmt.executeUpdate();
			
			
	        if(r > 0){
				
				return true;			
			}
	        
			}
			catch (Exception e) {
				
				System.out.println(e);
				//e.printStackTrace();
			}
		
		}
		else{
			
			try{
			stmt = conn.prepareStatement(" update JobSeeker_Biodata "
					+ "SET first_name = ?, last_name =? , jobseeker_email =? , phone=? , school=? "
					+ " , degree=? , study_field=? , sfrom_DATEMonth=? , sfrom_DATEyear=? "
					+ " ,sto_DATEMonth = ? , sto_DATEyear = ? , job_title = ? , job_company = ? , "
					+ " job_country = ? , job_city = ? , wfrom_DATEMonth = ? , wfrom_DATEyear = ? , "
					+ " wto_DATEMonth = ? , wto_DATEyear = ? , job_Description = ? where jobseeker_email = ?");

			stmt.setString(1,  jobSeekerBioDataPojo.getjFirstName());
			stmt.setString(2,  jobSeekerBioDataPojo.getjLastName());
			stmt.setString(3,  jobSeekerBioDataPojo.getjEmail());
			stmt.setLong(4,  jobSeekerBioDataPojo.getjPhone());
			stmt.setString(5,  jobSeekerBioDataPojo.getjSchool());
			stmt.setString(6,  jobSeekerBioDataPojo.getjDegree());
			stmt.setString(7,  jobSeekerBioDataPojo.getjFStudy());
			stmt.setString(8,  jobSeekerBioDataPojo.getjSStudyMonth());
			stmt.setString(9,  jobSeekerBioDataPojo.getjSStudyYear());
			stmt.setString(10,  jobSeekerBioDataPojo.getjEStudyMonth());
			stmt.setString(11,  jobSeekerBioDataPojo.getjEStudyYear());
			stmt.setString(12,  jobSeekerBioDataPojo.getjWJobTitle());
			stmt.setString(13,  jobSeekerBioDataPojo.getjWCompany());
			stmt.setString(14,  jobSeekerBioDataPojo.getjWCountry());
			stmt.setString(15,  jobSeekerBioDataPojo.getjWCity());
			stmt.setString(16,  jobSeekerBioDataPojo.getjSWorkMonth());
			stmt.setString(17,  jobSeekerBioDataPojo.getjSWorkYear());
			stmt.setString(18,  jobSeekerBioDataPojo.getjEWorkMonth());
			stmt.setString(19,  jobSeekerBioDataPojo.getjEWorkYear());
			stmt.setString(20,  jobSeekerBioDataPojo.getjWDescription());
			stmt.setString(21,  jobSeekerBioDataPojo.getjEmail());
			
			
			int r= stmt.executeUpdate();
			
	        if(r > 0){
				
				return true;			
			}
	        
			}
			catch(Exception e) {
				
				System.out.println(e);
				//e.printStackTrace();
			}
			
		}
		
		return false;
	}

	@Override
	public boolean checkBioDataExists(String jEmail) {
		// TODO Auto-generated method stub
		try{
			System.out.println(jEmail);
			PreparedStatement pstmt = conn.prepareStatement("select jobseeker_email from JobSeeker_Biodata where jobseeker_email like ? ");
			pstmt.setString(1, jEmail);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return false;
	}
	
	
	public JobSeekerBioDataPojo getBioData(String jEmail){
		JobSeekerBioDataPojo bioData = new JobSeekerBioDataPojo();
		
		try{
			stmt = conn.prepareStatement(" select  "
					+ " first_name ,last_name ,jobseeker_email ,phone , school"
					+ " ,degree,study_field,sfrom_DATEMonth,sfrom_DATEyear"
					+ " ,sto_DATEMonth ,sto_DATEyear ,job_title ,job_company ,"
					+ "job_country ,job_city  , wfrom_DATEMonth ,wfrom_DATEyear ,"
					+ "wto_DATEMonth ,wto_DATEyear ,job_Description from JobSeeker_Biodata   where jobseeker_email = ?");

			stmt.setString(1,  jEmail);
			
			ResultSet r= stmt.executeQuery();
			if(r.next()){
				bioData.setjFirstName(r.getString(1));
				bioData.setjLastName(r.getString(2));
				bioData.setjEmail(r.getString(3));
				bioData.setjPhone(r.getLong(4));
				bioData.setjSchool(r.getString(5));
				bioData.setjDegree(r.getString(6));
				bioData.setjFStudy(r.getString(7));
				bioData.setjSStudyMonth(r.getString(8));
				bioData.setjSStudyYear(r.getString(9));
				bioData.setjEStudyMonth(r.getString(10));
				bioData.setjEStudyYear(r.getString(11));
				bioData.setjWJobTitle(r.getString(12));
				bioData.setjWCompany(r.getString(13));
				bioData.setjWCountry(r.getString(14));
				bioData.setjWCity(r.getString(15));
				bioData.setjSWorkMonth(r.getString(16));
				bioData.setjSWorkYear(r.getString(17));
				bioData.setjEWorkMonth(r.getString(18));
				bioData.setjEWorkYear(r.getString(19));
				bioData.setjWDescription(r.getString(20));
					
			}
			
	        
	        
			}
			catch(Exception e) {
				
				System.out.println(e);
				//e.printStackTrace();
			}

		
		return bioData;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
