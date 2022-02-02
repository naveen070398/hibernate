


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class doctorregistration extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Connection con=null;
	PreparedStatement pst=null;
	public void init(ServletConfig config)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/appointment";
		String username="root";
		String password="4009";
		
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException
	{
		System.out.println("\n\n \tDATA ADDED SUCCESSFULLY... \n");
		
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String email=req.getParameter("email");
		String phone=req.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialist=req.getParameter("specialist");
		
		PrintWriter pw=resp.getWriter();
		
		String query="insert into doctor (name,password,email,phone,specialist) values(?,?,?,?,?)";
		
		try {
			
			pst=con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			pst.setString(3, email);
			pst.setLong(4, mobile);
			pst.setString(5, specialist);
			
			int count=pst.executeUpdate();
			
			if(count!=0)
				pw.println("<html><body bgcolor='cyan'><h1 align='center'>");
				pw.println("Registered Successfully</h1></body></html>");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}