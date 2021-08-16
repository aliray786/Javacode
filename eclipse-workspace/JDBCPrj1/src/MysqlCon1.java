import java.sql.*;
//create
public class MysqlCon1 {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
//here javadb is database name, root is username and password  
			Statement stmt = con.createStatement();
			int s=stmt.executeUpdate("insert into emp values(104,'HarryPotter',18)");
			System.out.println(s+" Records inserted"); 
			con.close();
		}
catch (Exception e) {
			System.out.println(e);
		}
	}	}