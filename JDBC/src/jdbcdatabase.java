import java.sql.*;
import java.util.Scanner;

public class jdbcdatabase {
	static int disp(int n) throws Exception{


		Scanner scan = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/school";
		String username ="root";
		String password = "4009";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		char c=' ';
		while(c != 'n') {
			int rollno = 0, marks = 0;

			if(n==1) {
				System.out.println("insert:");
				PreparedStatement ps = con.prepareStatement("insert into students values(?,?,?)");
				System.out.println("Enter rollno:");
				rollno = scan.nextInt();
				System.out.println("Enter Name:");
				scan.nextLine();
				String Name = scan.nextLine();
				System.out.println("Enter marks");			
				marks= scan.nextInt();
				ps.setInt(1, rollno);
				ps.setString(2, Name);
				ps.setInt(3, marks);
				ps.executeUpdate();
			}
			else if(n == 2) {
				PreparedStatement x = con.prepareStatement("update students set marks = ?  where rollno<= ?");
				System.out.println("marks");
				marks = scan.nextInt();
				System.out.println("rollno");
				rollno = scan.nextInt();		
				x.setInt(1,marks);
				x.setInt(2,rollno);
				x.executeUpdate();

			}
			else if(n==3) {
				PreparedStatement x = con.prepareStatement("delete from students where rollno= ?");
				System.out.println("Enter rollno:");
				rollno = scan.nextInt();
				x.setInt(1,rollno);
				x.executeUpdate();
			}
			else if(n==4) {

				ResultSet rs = st.executeQuery("select *from students");	
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getString("Name")+" "+rs.getInt(3));
			}

			System.out.println("Enter y/n");
			c = scan.next().charAt(0);

		}
		return 0;
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}


