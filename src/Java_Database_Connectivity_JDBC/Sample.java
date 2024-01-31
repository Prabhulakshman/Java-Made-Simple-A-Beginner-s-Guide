package Java_Database_Connectivity_JDBC;
import java.sql.*;
public class Sample {

	public static void main(String[] args) {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(null, null, null);
		Statement st=Java_Database_Connectivity.Java_Database_Connectivity_JDBC.createStatement("SELECT * FROM EMP;");
		ResultSet rs=st.executeQuery();
		while(rs.result())
		{
			System.out.println(rs.get());
		}
		con.close();
	}

}
