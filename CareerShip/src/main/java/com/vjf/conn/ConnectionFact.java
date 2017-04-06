package com.vjf.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFact {

	public static class GetConn{

		 final static  String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		 final static String DB_URL = "jdbc:mysql://localhost/VJF";


		 final static String USER = "root";
		 final static String PASS = "root";
		 
		 public static Connection conn = null;
		 
		 public  static void setConnectionMock(String Mockurl){
		 
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
		 public static Connection getConnection(){
			 return conn;
		 }
		 
		 public static  void setConnection1(){
			
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
	}

}
