package com.vjf.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.EmployerLoginPojo;

@Repository
public class ImpEmployerRepository implements EmployerRepository {
	
	 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	 final String DB_URL = "jdbc:mysql://localhost/VJF";


	 final String USER = "root";
	 final String PASS = "root";
	 
	 public Connection conn = null;
	 PreparedStatement stmt = null;
	 ResultSet rs=null;
	 
	 public Connection getConnection(){
		 return conn;
	 }
	 
	 public void setConnection(String Mockurl){
		 
		 try{ 
			 Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(Mockurl,USER , PASS);
					
				
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		 
		 
	 }

	 

	 public ImpEmployerRepository() {
		// TODO Auto-generated constructor stub
		try{ 
		 Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER , PASS);
				
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	 
	 }

	 
	@Override
	public boolean addUser(EmployerLoginPojo employerLoginPojo) {
		// TODO Auto-generated method stub
		try{
			
			stmt = conn.prepareStatement(" insert into Employer_login values (?,?,?,?) ");
			
			
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

}
