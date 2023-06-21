package project1002;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.HandshakeRequest;

@WebServlet("/first_page")
public class firstServlet extends HttpServlet {

	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		 PrintWriter out=resp.getWriter();
		 
		
			
		
		    String fname= req.getParameter("fname");
			
			String lname=   req.getParameter("lname");
			
			String email= req.getParameter("email");
			
			String password=  req.getParameter("password");
			
			System.out.println(fname);
			System.out.println(lname);
			System.out.println(email);
			System.out.println(password);
			System.out.println("--------------------------");
			
			try {
			String s="com.mysql.cj.jdbc.Driver";
			Class.forName(s);
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "root");
			
			PreparedStatement stmt=con.prepareStatement("insert into servlet_info.information values(?,?,?,?);");
			
			stmt.setString(1,fname);
			stmt.setString(2, lname);
			stmt.setString(3,email);
			stmt.setString(4, password);
			
			
			if(stmt.executeUpdate()>0) {
				RequestDispatcher rdDispatcher=req.getRequestDispatcher("secondPage.html");
				rdDispatcher.forward(req, resp);
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 
			
	 }
	
}
