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
public class ImplJobSeekerSearchRepository implements JobSeekerSearchRepository {

	
	

	 public Connection conn = null;
	 PreparedStatement stmt = null;
	 ResultSet rs=null;
	 
		public ImplJobSeekerSearchRepository() {
			
			 ConnectionFact.GetConn.setConnection1();
			 conn = ConnectionFact.GetConn.getConnection();
			
		}

	 
	 public Connection getConnection(){
		 return conn;
	 }
	 
	 public void setConnection(String Mockurl){
		ConnectionFact.GetConn.setConnectionMock(Mockurl);
		conn = ConnectionFact.GetConn.getConnection();
		 
	 }


	
	@Override
	public List<EmployerJobPostPojo> basicSearch(String search) {
		// TODO Auto-generated method stub
		
        ArrayList<EmployerJobPostPojo> employerJobPostPojos = new ArrayList<>();
		
		
		try{
			
			stmt = conn.prepareStatement(" select job_post_id, job_desc"
					+ ", job_title, job_location, job_post_email "
					+ "   from Employer_Job_POST where job_title like ? or job_location like ?"
					+ " or job_desc like ?  ");
			
	        
			stmt.setString(1, "%"+search+"%");
			stmt.setString(2, "%"+search+"%");
			stmt.setString(3, "%"+search+"%");
			
			
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
				System.out.println(e);
				//e.printStackTrace();
			}

		return employerJobPostPojos;


		
	}

	@Override
	public List<EmployerJobPostPojo> advancedSearch(String search_title, String value) {
		// TODO Auto-generated method stub
		
		
		  ArrayList<EmployerJobPostPojo> employerJobPostPojos = new ArrayList<>();
			
		 if(search_title.equalsIgnoreCase("company")){
			return compSearch(search_title, value); 
		 }
		 
		 else{
		  
		  
		  String column_Name1 = null, column_Name2;
			if(search_title.equalsIgnoreCase("location"))
			{
				column_Name1 = "job_location";
				column_Name2 = "job_title";
				
			}
			else if(search_title.equalsIgnoreCase("title")){
				
				column_Name2 = "job_location";
				column_Name1 = "job_title";
				
			}
			try{
				
				stmt = conn.prepareStatement(" select job_post_id, job_desc"
						+ ", job_title, job_location, job_post_email "
						+ "   from Employer_Job_POST where "
						+ " " +  column_Name1 +" like ?  ");
				
		        
				stmt.setString(1, "%"+value+"%");
				
				
				
				rs= stmt.executeQuery();
				
				
		        while(rs.next()){
		        	EmployerJobPostPojo employerJobPostPojo = new EmployerJobPostPojo();
		        	//employerJobPostPojo.setCompany_name(company_name);
		        	employerJobPostPojo.setPost_id(rs.getInt(1));
		        	employerJobPostPojo.setDesc(rs.getString(2));
		        	employerJobPostPojo.setTitle(rs.getString(3));
		        	employerJobPostPojo.setLocation(rs.getString(4));
		        	String em = rs.getString(5);
		        	employerJobPostPojo.setPost_email(em);
		        	employerJobPostPojos.add(employerJobPostPojo);
		        	
								
				}
		        
				}
				catch (Exception e) {
					System.out.println(e);
					//e.printStackTrace();
				}

		 }
			return employerJobPostPojos;
	}

	private List<EmployerJobPostPojo> compSearch(String search_title, String value) {
		// TODO Auto-generated method stub
		
		ArrayList<EmployerJobPostPojo> employerJobPostPojos= new ArrayList<>();
		
		try{
			PreparedStatement pstm = conn.prepareStatement("select email,company_name  from Employer_login where company_name like ? ");
        	pstm.setString(1, "%"+value+"%");
        
        	ResultSet t = pstm.executeQuery();
        	while(t.next()){
        		String value2  = t.getString(1);
        		String cmp_name = t.getString(2);
        	
        	
			
			stmt = conn.prepareStatement(" select job_post_id, job_desc"
					+ ", job_title, job_location, job_post_email "
					+ "   from Employer_Job_POST where "
					+ "  job_post_email  like ?  ");
			
	        
			stmt.setString(1, value2);
			
			
			
			rs= stmt.executeQuery();
			
			
	        while(rs.next()){
	        	EmployerJobPostPojo employerJobPostPojo = new EmployerJobPostPojo();
	        	
	        	employerJobPostPojo.setCompany_name(cmp_name);
	        	employerJobPostPojo.setPost_id(rs.getInt(1));
	        	employerJobPostPojo.setDesc(rs.getString(2));
	        	employerJobPostPojo.setTitle(rs.getString(3));
	        	employerJobPostPojo.setLocation(rs.getString(4));
	        	String em = rs.getString(5);
	        	employerJobPostPojo.setPost_email(em);
	        	employerJobPostPojos.add(employerJobPostPojo);
	        	
							
			}
        	}
			}
        	
			catch (Exception e) {
				System.out.println(e);
				//e.printStackTrace();
			}

	 
		return employerJobPostPojos;

		
		
	}

}
