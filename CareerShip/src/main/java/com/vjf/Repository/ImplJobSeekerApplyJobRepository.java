package com.vjf.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.JobSeekerJobApplyPojo;
import com.vjf.conn.ConnectionFact;



@Repository
public class ImplJobSeekerApplyJobRepository implements JobSeekerApplyJobRepository{

	
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

	 

	  public ImplJobSeekerApplyJobRepository() {
		// TODO Auto-generated constructor stub
		 ConnectionFact.GetConn.setConnection1();
		 conn = ConnectionFact.GetConn.getConnection();
				
	 
	 }
	
	@Override
	public boolean applyPostData(JobSeekerJobApplyPojo jobSeekerjobApplyPojo) {
		// TODO Auto-generated method stub
      try{
			
			stmt = conn.prepareStatement(" insert into JobSeeker_Apply_Job(jobseeker_email,job_post_id) values (?,?)");
			stmt.setString(1,jobSeekerjobApplyPojo.getJobseeker_email());
			stmt.setLong(2,jobSeekerjobApplyPojo.getJob_post_id());

			
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
	public void addToShortlist(String add_To_shortlist) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" update JobSeeker_Apply_Job set  add_To_Shortlist =? where  add_To_shortlist = ? ");
			
			stmt.setString(1, "True");
			stmt.setString(2, add_To_shortlist);
		
			stmt.executeUpdate();
			
		}
		catch (Exception e) {
			
		}
		
	}
	
	
}
