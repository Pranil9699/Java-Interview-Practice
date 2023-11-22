package OrganizationType.controller;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import OrganizationType.model.OrganizationType;
import OrganizationType.services.service;

@WebServlet("/GetAll")
public class GetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String	typecode = request.getParameter("typecode");
	String typename = request.getParameter("typename");
	OrganizationType Org_class=new OrganizationType();
	Org_class.setTypecode(typecode);
	Org_class.setTypeame(typename);
	service.saving(Org_class);
	response.sendRedirect("display.jsp");
	}
}
