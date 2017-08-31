package jdbcdatabase;
import java.sql.*;
public class TablecopyTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver"); 
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "sachin626");
		Statement stmt = con.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT * FROM DEPT");
		stmt.executeUpdate("INSERT INTO DEPT2 (DEPTNO,DNAME,LOC) SELECT * FROM DEPT");
		ResultSet rs2= stmt.executeQuery("SELECT * FROM DEPT2");
		while(rs2.next()) 
		{
			System.out.println(rs2.getInt("DEPTNO") + " - " + rs2.getString("DNAME")+" - " + rs2.getString("LOC"));
			} 
		
	}

}
