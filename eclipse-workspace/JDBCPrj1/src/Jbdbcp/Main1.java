package Jbdbcp;
import java.sql.*;
import java.util.*;
/*
 * 1. Adaptor: ORM class
2. Singleton: Connection Object
3. Decorator: getAll() of ORM to decorate Emp
4. Observer: Main class
5. Factory method: getConnection()
6. Abstract Factory: Class.forName()
 */
class Emp
{
	private int id;
	private String name;
	private int age;
	public Emp() {
	}
	public Emp(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
public void setAge(int age) {
		this.age = age;
	}
}
class ORM
{
	Statement ss;
	Connection c;
	ORM(String driver,String connectUrl,String id,String password)
	{
		try {
		Class.forName(driver);
		c=DriverManager.getConnection(connectUrl,id,password);
		ss=c.createStatement();
		}
		catch(Exception e) {}
	}
int save(Emp e)
	{
		try {
		String s="insert into emp values ("+e.getId()+",'"+ e.getName()+"'," +e.getAge()+")";
		int x=ss.executeUpdate(s);
		return x;
		}
		catch(Exception ee) {return 0;}
	}

int Update(Emp e)
{
	try {
	
	String s="update emp set age = "+ e.getAge()+ ", name = '" + e.getName()+ "' where id = " +e.getId();
	int x=ss.executeUpdate(s);
	return x;
	}
	catch(Exception ee) {return 0;}
}
int delete(Emp e) {
	try {
		String s="delete from emp where id = " +e.getId();
		int x=ss.executeUpdate(s);
		return x;
		}
		catch(Exception ee) {
			System.out.println(ee);
			return 0;
			}
}
List<Emp> getAll(){
List<Emp> l=new ArrayList<Emp>();
try {
	Statement stmt = c.createStatement();
	
	ResultSet rs = stmt.executeQuery("select * from emp");
	while (rs.next()){
		Emp E=new Emp();
		E.setId(rs.getInt(1));
		E.setName(rs.getString(2));
		E.setAge(rs.getInt(3));
		l.add(E);
		}
return l;}
catch (Exception e) {
	System.out.println(e);
}
return l;
}
}

public class Main1 
{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
				String driver="com.mysql.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/javadb";
				String u="root";
				String p="";
				ORM o=new ORM(driver, url, u, p);
				Emp e1=new Emp(105, "Tom", 25);
				int r=o.save(e1);
				Emp e2=new Emp(106,"shahzad",22);
				 r+=o.save(e2);
				System.out.println(r+ " Records updated ");
				System.out.println(o.getAll()+ " Records updated ");

	}
}