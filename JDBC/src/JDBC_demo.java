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
if(connection!=null) {
	System.out.println("Connection Established");

	
/*else {
	System.out.println("Connection not  Established");
}*/
Statement st=connection.createStatement();
int x=st.executeUpdate("insert into students values(105,'arun',97)");
//int x=st.executeUpdate("delete from students where rollno=107");
if(x!=0) {
	System.out.println("record inserted");
}
}
}
}