import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBC_demo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException  {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/school";
String username="root";
String password="4009";
Connection connection=DriverManager.getConnection(url, username, password);
if(connection!=null)
	System.out.println("Connection Established");

	}

}
