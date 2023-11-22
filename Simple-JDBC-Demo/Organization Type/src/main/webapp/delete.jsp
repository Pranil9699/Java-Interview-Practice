<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<%
String typecode = request.getParameter("typecode");
String typename = request.getParameter("typename");


try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganizationType?useSSL=false","root","Pranil@2003");
	PreparedStatement pst = con.prepareStatement("delete from O_Type_Table Where typecode= ? and typename=?");
	pst.setString(1, typecode);
	pst.setString(2, typename);
	int num1 = pst.executeUpdate();
	System.out.println(num1+" record's Delete");
	response.sendRedirect("display.jsp");
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
}
%>
