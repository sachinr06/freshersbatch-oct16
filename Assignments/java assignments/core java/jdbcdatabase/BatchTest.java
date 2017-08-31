package jdbcdatabase;
import java.io.*;
import java.sql.*;

import org.apache.commons.dbcp2.BasicDataSource;


	
public class BatchTest {
	public static BasicDataSource getDataSource() {
		// TODO Auto-generated method stub
		 BasicDataSource dataSource = new BasicDataSource();
		 dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		 dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		  dataSource.setUsername("system");
		  dataSource.setPassword("sachin626");
		  dataSource.setInitialSize(5);
		
		return dataSource;
		  

		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
			// TODO Auto-generated method stub
			  try (	BasicDataSource dataSource=getDataSource();
						Connection conn = dataSource.getConnection();
					  Statement sm=conn.createStatement();
					  PreparedStatement stmt = conn.prepareStatement("INSERT INTO EMPTEST VALUES(?,?,?)");
							  Statement stmt2 = conn.createStatement()){
				  try{
					  int updaterecord =sm.executeUpdate("DELETE FROM EMPTEST");
				    conn.setAutoCommit(false);
				    
				    stmt.setInt(1, 1);
				    stmt.setString(2, "Ivan");
				    stmt.setDouble(3, 10000);
				    stmt.addBatch();
				    stmt.setInt(1, 2);
				    stmt.setString(2, "Harry");
				    stmt.setDouble(3, 11000);
				    stmt.addBatch();
				    stmt.setInt(1, 3);
				    stmt.setString(2, "Gabreil");
				    stmt.setDouble(3, 12000);
				    stmt.addBatch();
				    stmt.setInt(1,4);
				    stmt.setString(2, "Ajay");
				    stmt.setDouble(3, 13000);
				    stmt.addBatch();
				    int numberofrecords[]=stmt.executeBatch();
				    for(int i=0;i<numberofrecords.length;i++)
				    	  System.out.println("numberofrecords : "+numberofrecords[i]);
				  }
				  catch(Exception e){
					  e.printStackTrace();
				  }
				  finally{
					  conn.setAutoCommit(true);
				  }
				  
				  try{
					  
					  stmt2.executeUpdate("INSERT INTO EMPTEST2 (ID,NAME,SALARY) SELECT * FROM EMPTEST");
				  }
				  catch(Exception e){
					  e.printStackTrace();
				  }
				    ResultSet rs2=sm.executeQuery("SELECT * FROM EMPTEST" );
				    while(rs2.next()) 
					{
				    	System.out.println(rs2.getInt("ID") + " - " + rs2.getString("NAME")+" - " + rs2.getString("SALARY"));
						} 
					rs2.close(); 
					stmt.close();
					conn.close();
			  }
			  }
	

}
