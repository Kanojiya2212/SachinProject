package project1002;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.util.*;
import java.util.stream.Collectors;

import org.apache.catalina.connector.Response;

@WebServlet("/login")
public class secondPage extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
        String user=req.getParameter("user");
		String password=req.getParameter("password");
		
		try {
			String s="com.mysql.cj.jdbc.Driver";
			Class.forName(s);
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root", "root");
			
			PreparedStatement stmt=con.prepareStatement("select email from servlet_info.information where email=? and Pwd=?;");
			
			stmt.setString(1,user);
			stmt.setString(2, password);
			
			ResultSet rs=stmt.executeQuery();
			 Boolean d = false;
			while(rs.next())
			{
			    d=true;
			}
			if(d==true)
			{
					RequestDispatcher rd=req.getRequestDispatcher("home.html");
					rd.forward(req, resp);
			}else {
				
				RequestDispatcher rdDispatcher=req.getRequestDispatcher("secondPage.html");
				rdDispatcher.forward(req, resp);
			}
			
			
			
			
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 
		
	
	  
	





	}}
