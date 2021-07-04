//package examp_datab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","rvce");
			System.out.println(con.getNetworkTimeout());
			System.out.println(con.getAutoCommit());
			System.out.println(con.getSchema());
			System.out.println(con.getClientInfo());
			System.out.println(con.getTransactionIsolation());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(" slno "+rs.getInt(1)+"name "+rs.getString(2));
		
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
