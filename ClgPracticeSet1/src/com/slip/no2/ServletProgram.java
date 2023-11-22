package com.slip.no2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletProgram  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		Date date = new Date();
		
		writer.println("<h1> CurrentDate And Time : "+date.toString()+"</h1>");
	}

}
