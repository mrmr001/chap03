package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/current")
public class CurrentDateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
			String c =req.getParameter("count");
			int count =0;
			if (c != null)
			 count = Integer.parseInt(c);
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println(" <title>current</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 onclick='xxx(event)'>sdkjfhk</h1>");
		for (int i=0; i<count; i++){
		out.println("<h1>"+i+"urrent="+new Date()+"<h1>");
		}
		out.println("<script>");
		out.println("function xxx(event){"
					+ "alert(event.target.innerHTML);"
					+ "}");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
		
		

}
	}

