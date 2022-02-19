
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqlconnector 
{
	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhuvanadb","root","user");
			Statement s= c.createStatement();
			ResultSet r= s.executeQuery("select * from EMPtable");

			
			while(r.next())
			{
				System.out.println(r.getInt(1)+r.getString(2));
			}
			
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
