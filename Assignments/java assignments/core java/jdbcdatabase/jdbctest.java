package jdbcdatabase;
import java.sql.*;
public class jdbctest {
	public static void main(String args[]) throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sachin626");
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT");
		while(rs.next()) 
		{
			System.out.println(rs.getInt("DEPTNO") + " - " + rs.getString("DNAME")+" - " + rs.getString("LOC"));
			} 
		
		int updaterecords=stmt.executeUpdate("DELETE FROM DEPT WHERE DEPTNO=40");
		
		
		ResultSet rs2 = stmt.executeQuery("SELECT * FROM DEPT");
		while(rs2.next()) 
		{
			System.out.println(rs2.getInt("DEPTNO") + " - " + rs2.getString("DNAME")+" - " + rs2.getString("LOC"));
			} 
		rs.close(); 
		stmt.close();
		con.close();

	}

}
