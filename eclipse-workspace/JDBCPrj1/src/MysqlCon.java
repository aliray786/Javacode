import java.sql.*;
public class MysqlCon {
	public static void main(String args[]) {
		try {
			//loading the driver
			Class.forName("com.mysql.jdbc.Driver");
			//returns connection Object : getConnection(URL, username, password)
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
//here javadb is database name, root is username and password  
//create simple SQL statement through the con object : returns a Statement Obj
			Statement stmt = con.createStatement();
			//stmt.execute() returns boolean : create table, Procedures, SQL functions
			//stmt.executeUpdate() returns int: insert, update, delete : returns the no. of rows updated
			//stmt.executeQuery() : returns ResultSet (auto iterable) : Select query
			ResultSet rs = stmt.executeQuery("select * from emp");
			//rs is iterated from beg of table to end of tuples
while (rs.next())
				//rs has three columns : int, varchar(), int: 1, 2, 3 represents column numbers
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
