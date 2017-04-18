package com.vjf.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.EmployerJobPostPojo;
import com.vjf.conn.ConnectionFact;

@Repository
public class ImplEmployerJobPostRepository implements EmployerJobPostRepository {

	
	 public Connection conn = null;
	 PreparedStatement stmt = null;
	 ResultSet rs=null;
	 
	 public Connection getConnection(){
		 return conn;
	 }
	 
	 public void setConnection(String Mockurl){
		 
		 
		ConnectionFact.GetConn.setConnectionMock(Mockurl);
		conn = ConnectionFact.GetConn.getConnection();
		
		 
	 }

	 

	  public ImplEmployerJobPostRepository() {
	
		// TODO Auto-generated constructor stub
		 ConnectionFact.GetConn.setConnection1();
		 conn = ConnectionFact.GetConn.getConnection();
				
	 
	 }

	
	@Override
	public boolean addJob(EmployerJobPostPojo employerJobPostPojo) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" insert into Employer_Job_POST(job_desc,"
					+ "job_title, job_location, job_post_email) values (?,?,?,?) ");
			
			
			stmt.setString(1,  employerJobPostPojo.getDesc());
			stmt.setString(2, employerJobPostPojo.getTitle());
			stmt.setString(3,  employerJobPostPojo.getLocation());
			stmt.setString(4, employerJobPostPojo.getPost_email());
			
			
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
	public List<EmployerJobPostPojo> getJobsPosted(String eEmail) {
		// TODO Auto-generated method stub
		ArrayList<EmployerJobPostPojo> employerJobPostPojos = new ArrayList<>();
		
		
		try{
			
			stmt = conn.prepareStatement(" select job_post_id, job_desc"
					+ ", job_title, job_location, job_post_email "
					+ "   from Employer_Job_POST where job_post_email = ? ");
			
			
			stmt.setString(1, eEmail);
			
			rs= stmt.executeQuery();
			
			
	        while(rs.next()){
	        	EmployerJobPostPojo employerJobPostPojo = new EmployerJobPostPojo();
	        	
	        	employerJobPostPojo.setPost_id(rs.getInt(1));
	        	employerJobPostPojo.setDesc(rs.getString(2));
	        	employerJobPostPojo.setTitle(rs.getString(3));
	        	employerJobPostPojo.setLocation(rs.getString(4));
	        	employerJobPostPojo.setPost_email(rs.getString(5));
	        	employerJobPostPojos.add(employerJobPostPojo);
	        	
							
			}
	        
			}
			catch (Exception e) {
				e.printStackTrace();
			}


		
		return employerJobPostPojos;
		
	}

	@Override
	public List<EmployerJobPostPojo> getALLJobsPosted() {
		// TODO Auto-generated method stub
		ArrayList<EmployerJobPostPojo> employerJobPostPojos = new ArrayList<>();
		
		
		try{
			
			stmt = conn.prepareStatement(" select job_post_id, job_desc"
					+ ", job_title, job_location, job_post_email "
					+ "   from Employer_Job_POST ");
			
			
			
			rs= stmt.executeQuery();
			
			
	        while(rs.next()){
	        	EmployerJobPostPojo employerJobPostPojo = new EmployerJobPostPojo();
	        	
	        	employerJobPostPojo.setPost_id(rs.getInt(1));
	        	employerJobPostPojo.setDesc(rs.getString(2));
	        	employerJobPostPojo.setTitle(rs.getString(3));
	        	employerJobPostPojo.setLocation(rs.getString(4));
	        	String em = rs.getString(5);
	        	employerJobPostPojo.setPost_email(em);
	        	PreparedStatement pstm = conn.prepareStatement("select company_name  from Employer_login where email =? ");
	        	pstm.setString(1, em);
	        	ResultSet t = pstm.executeQuery();
	        	if(t.next()){
	        		employerJobPostPojo.setCompany_name(t.getString(1));
	        	}
	        	employerJobPostPojos.add(employerJobPostPojo);
	        	
							
			}
	        
			}
			catch (Exception e) {
				e.printStackTrace();
			}

		return employerJobPostPojos;

		

	}

	@Override
	public boolean deleteJobPost(long id) {
		// TODO Auto-generated method stub
		
		try{
			
			stmt = conn.prepareStatement(" delete from Employer_Job_POST where job_post_id = ? ");
			
			
			stmt.setLong(1,  id);
			
			
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
	public boolean checkEmail_verify(String email) {
		// TODO Auto-generated method stub
		
			try{
			
			stmt = conn.prepareStatement(" select email_verified from Employer_login where email = ? ");
			
			
			stmt.setString(1, email);
			
			ResultSet rs= stmt.executeQuery();
			
			if(rs.next()){
				
				String s = rs.getString(1);
				
				
			return (s.equals("False"))?false:true;
			}

			
	        
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		
		
		
		
		
		
		return false;
	}
	

}
