package com.vjf.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

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
			
			stmt = conn.prepareStatement(" insert into JobSeeker_login values (?,?,?,?,?) ");
			
			
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

}
