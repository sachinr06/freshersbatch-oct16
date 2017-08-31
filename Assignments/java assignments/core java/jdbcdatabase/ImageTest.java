package jdbcdatabase;

import java.io.*;
import java.sql.*;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class ImageTest {
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
		  try (	BasicDataSource dataSource=getDataSource();
					Connection conn = dataSource.getConnection();
				  Statement sm=conn.createStatement();
				  PreparedStatement stmt = conn.prepareStatement("INSERT INTO IMGTABLE VALUES(?,?,?)")){
			  
			  try{
			    stmt.setInt(1, 2);
			    stmt.setString(2,"Harry");
			    File file=new File("pic.png");
			    FileInputStream fis=new FileInputStream(file);
			    stmt.setBinaryStream(3, fis, file.length());
				stmt.executeUpdate();
			  }
			  
			  catch(Exception e){
				  e.printStackTrace();
			  }
			  
			  
			  try{
				  
			  ResultSet rs=sm.executeQuery("SELECT * FROM IMGTABLE");
			  if(rs.next()){
		
		              
					  Blob b=rs.getBlob(3);  
					  byte barr[]=b.getBytes(1,(int)b.length());
					                
					  FileOutputStream fos=new FileOutputStream("d:\\pic.png");  
					  fos.write(barr);  
					                
					  fos.close();  
					  }
			
			  }
			  
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  }
			  
		  }
		

			
	}

	


