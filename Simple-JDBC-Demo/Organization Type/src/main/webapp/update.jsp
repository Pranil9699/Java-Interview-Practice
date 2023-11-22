<%@page import="OrganizationType.model.OrganizationType"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
String typecode = request.getParameter("typecode");
String typename = request.getParameter("typename");
%>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<%
Connection con=null;
OrganizationType Org_class=new OrganizationType();
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganizationType?useSSL=false","root","Pranil@2003");
	PreparedStatement pst = con.prepareStatement("select * from O_Type_Table Where typecode= ? and typename=?");
	pst.setString(1, typecode);
	pst.setString(2, typename);
	ResultSet resultSet = pst.executeQuery();
	
    while(resultSet.next()){
    	
    	Org_class.setTypecode(resultSet.getString("typecode"));
    	Org_class.setTypeame(resultSet.getString("typename"));
    }
    con.close();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
}
%>




<div class="login-page">
		<div class="form">
			<div class="login">
				<div class="login-header">
					<h3>Update</h3>
					<p>Please Update your Organization Details.</p>
				</div>
			</div>
			<form class="login-form" action="GetUpdate" method="post">
			<input type="hidden" name="oldcode" value="<%=Org_class.getTypecode() %>">
<input type="hidden" name="oldname" value="<%=Org_class.getTypeame() %>">
<input type="text" placeholder="Enter Code" name="typecode" value="<%=Org_class.getTypecode() %>" >
				<input type="text" placeholder="Enter Name" name="typename" value="<%=Org_class.getTypeame() %>">
				<div style="display:flex;"><button>Save</button>
				<br><br><br>
				<button style="margin-left:10px;"><a href="display.jsp" style="text-decoration:none;color:white;"class="btn btn-info">Back</a></button>
				</div>
			</form>
		</div>
	</div>



</body>
</html>