package com.vjf.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vjf.car.model.AddToShortListPojo;
import com.vjf.conn.ConnectionFact;

@Repository
public class ImplEmplyerShortlistedRepository implements EmplyerShortlistedRepository{

	
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

	 

	  public ImplEmplyerShortlistedRepository() {
	
		// TODO Auto-generated constructor stub
		 ConnectionFact.GetConn.setConnection1();
		 conn = ConnectionFact.GetConn.getConnection();
				
	 
	 }


	
	
	@Override
	public List<AddToShortListPojo> processAppliedCandidates(String string) {
		// TODO Auto-generated method stub
	   List<AddToShortListPojo> addToShortListPojos = new ArrayList<>();
		
		try {
			PreparedStatement pstm = conn.prepareStatement("Select job_post_id, job_title, job_location, job_post_email "
					+ "from Employer_Job_POST where job_post_email =? ");
			
			
			pstm.setString(1, string);
			
			ResultSet rs  =pstm.executeQuery();
			
			while(rs.next()){
				
				long job_post_id = rs.getLong(1);
				String title = rs.getString(2);
				String location = rs.getString(3);
				
				
				PreparedStatement pstm2 = conn.prepareStatement("Select job_apply_id, jobseeker_email, add_To_Shortlist "
						+ "from JobSeeker_Apply_Job where job_post_id = ? ");
				
				pstm2.setLong(1, job_post_id);
				ResultSet r = pstm2.executeQuery();
				while(r.next()){
					AddToShortListPojo addToShortListPojo = new AddToShortListPojo();
					addToShortListPojo.setJob_apply_id(r.getInt(1));
					addToShortListPojo.setJobSeeker_email(r.getString(2));
					addToShortListPojo.setWLocation(location);
					addToShortListPojo.setWPosition(title);
					addToShortListPojo.setShortListed(r.getString(3).equals("True") ? true : false);
					addToShortListPojos.add(addToShortListPojo);
					
					
					
					
				}
			
			}

			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
			//e.printStackTrace();
		}
		
		
		return addToShortListPojos;
	}

	@Override
	public List<AddToShortListPojo> processShortlistCandidates(String string) {
		// TODO Auto-generated method stub
		   List<AddToShortListPojo> addToShortListPojos = new ArrayList<>();
			
			try {
				PreparedStatement pstm = conn.prepareStatement("Select job_post_id, job_title, job_location, job_post_email "
						+ "from Employer_Job_POST where job_post_email =? ");
				
				
				pstm.setString(1, string);
				
				ResultSet rs  =pstm.executeQuery();
				
				while(rs.next()){
					
					long job_post_id = rs.getLong(1);
					String title = rs.getString(2);
					String location = rs.getString(3);
					
					
					PreparedStatement pstm2 = conn.prepareStatement("Select job_apply_id, jobseeker_email, add_To_Shortlist "
							+ "from JobSeeker_Apply_Job where job_post_id = ? and add_To_ShortList = ? ");
					
					pstm2.setLong(1, job_post_id);
					pstm2.setString(2, "True");
					
					ResultSet r = pstm2.executeQuery();
					while(r.next()){
						AddToShortListPojo addToShortListPojo = new AddToShortListPojo();
						addToShortListPojo.setJob_apply_id(r.getInt(1));
						addToShortListPojo.setJobSeeker_email(r.getString(2));
						addToShortListPojo.setWLocation(location);
						addToShortListPojo.setWPosition(title);
						addToShortListPojo.setShortListed(r.getString(3).equals("True") ? true : false);
						addToShortListPojos.add(addToShortListPojo);
						
						
						
						
					}
				
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				
				//e.printStackTrace();
			}
			
			
			return addToShortListPojos;
		
	}

	@Override
	public void shortListACandidate(long parseLong) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement s = conn.prepareStatement("update JobSeeker_Apply_Job set add_To_Shortlist= ? where job_apply_id = ? ");
			s.setString(1, "True");
			s.setLong(2, parseLong);
		   s.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
