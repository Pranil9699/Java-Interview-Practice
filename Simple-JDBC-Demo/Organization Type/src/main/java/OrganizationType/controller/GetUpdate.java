package OrganizationType.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import OrganizationType.model.OrganizationType;
import OrganizationType.services.service;

@WebServlet("/GetUpdate")
public class GetUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String oldcode=request.getParameter("oldcode");
		String oldname=request.getParameter("oldname");
		String	typecode = request.getParameter("typecode");
		String typename = request.getParameter("typename");
		OrganizationType Org_class=new OrganizationType();
		Org_class.setTypecode(typecode);
		Org_class.setTypeame(typename);
		service.updating(Org_class,oldcode,oldname);
		response.sendRedirect("display.jsp");
	}

}
