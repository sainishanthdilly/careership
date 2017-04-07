package com.vjf.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.EmployerLoginPojo;
import com.vjf.conn.ConnectionFact;

@Repository
public class ImpEmployerRepository implements EmployerRepository {
		 
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

	 

	 public ImpEmployerRepository() {
		// TODO Auto-generated constructor stub
		 ConnectionFact.GetConn.setConnection1();
		 conn = ConnectionFact.GetConn.getConnection();
				
	 
	 }

	 
	@Override
	public boolean addUser(EmployerLoginPojo employerLoginPojo) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" insert into Employer_login(email,password,company_name,phone) values (?,?,?,?) ");
			
			
			stmt.setString(1,  employerLoginPojo.getEmail());
			stmt.setString(2, employerLoginPojo.getPassword());
			stmt.setString(3,  employerLoginPojo.getCompany_name());
			stmt.setLong(4, employerLoginPojo.getPhone());
			
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
			
			stmt = conn.prepareStatement(" select email "
					+ "   from Employer_login where email = ? and password = ? ");
			
			
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
			
			stmt = conn.prepareStatement(" update Employer_login set email_verified =? where email = ? ");
			
			stmt.setString(1, "True");
			stmt.setString(2, email);
		
			stmt.executeUpdate();
			
		}
		catch (Exception e) {
			
		}
	}

}
