<%@page import="OrganizationType.model.OrganizationType"%>
<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous">

</head>
<style>
*{
    box-sizing: border-box;
    -webkit-box-sizing: border-box;
    -moz-box-sizing: border-box;
}
body{
    font-family: Helvetica;
    -webkit-font-smoothing: antialiased;
    background: rgba( 71, 147, 227, 1);
}
h2{
    text-align: center;
    font-size: 18px;
    text-transform: uppercase;
    letter-spacing: 1px;
    color: white;
    padding: 30px 0;
}

/* Table Styles */

.table-wrapper{
    margin: 10px 70px 70px;
    box-shadow: 0px 35px 50px rgba( 0, 0, 0, 0.2 );
}

.fl-table {
    border-radius: 5px;
    font-size: 12px;
    font-weight: normal;
    border: none;
    border-collapse: collapse;
    width: 100%;
    max-width: 100%;
    white-space: nowrap;
    background-color: white;
}

.fl-table td, .fl-table th {
    text-align: center;
    padding: 8px;
}

.fl-table td {
    border-right: 1px solid #f8f8f8;
    font-size: 12px;
}

.fl-table thead th {
    color: #ffffff;
    background: #4FC3A1;
}


.fl-table thead th:nth-child(odd) {
    color: #ffffff;
    background: #324960;
}

.fl-table tr:nth-child(even) {
    background: #F8F8F8;
}

/* Responsive */

@media (max-width: 767px) {
    .fl-table {
        display: block;
        width: 100%;
    }
    .table-wrapper:before{
        content: "Scroll horizontally >";
        display: block;
        text-align: right;
        font-size: 11px;
        color: white;
        padding: 0 0 10px;
    }
    .fl-table thead, .fl-table tbody, .fl-table thead th {
        display: block;
    }
    .fl-table thead th:last-child{
        border-bottom: none;
    }
    .fl-table thead {
        float: left;
    }
    .fl-table tbody {
        width: auto;
        position: relative;
        overflow-x: auto;
    }
    .fl-table td, .fl-table th {
        padding: 20px .625em .625em .625em;
        height: 60px;
        vertical-align: middle;
        box-sizing: border-box;
        overflow-x: hidden;
        overflow-y: auto;
        width: 120px;
        font-size: 13px;
        text-overflow: ellipsis;
    }
    .fl-table thead th {
        text-align: left;
        border-bottom: 1px solid #f7f7f9;
    }
    .fl-table tbody tr {
        display: table-cell;
    }
    .fl-table tbody tr:nth-child(odd) {
        background: none;
    }
    .fl-table tr:nth-child(even) {
        background: transparent;
    }
    .fl-table tr td:nth-child(odd) {
        background: #F8F8F8;
        border-right: 1px solid #E6E4E4;
    }
    .fl-table tr td:nth-child(even) {
        border-right: 1px solid #E6E4E4;
    }
    .fl-table tbody td {
        display: block;
        text-align: center;
    }
}



/* For Button */
.wrapper{
    position: absolute;
    top:50%;
    left:50%;
    transform: translate(-50%, -50%);
    width: fit-content;
    height:auto;
}
button{
margin:10px;
    width:200px;
    height:70px;
    background: linear-gradient(to left top, #c32c71 50%, #b33771 50%);
    border-style: none;
    color:#fff;
    font-size: 23px;
    letter-spacing: 3px;
    font-family: 'Lato';
    font-weight: 600;
    outline: none;
    cursor: pointer;
    position: relative;
    padding: 0px;
    overflow: hidden;
    transition: all .5s;
    box-shadow: 0px 1px 2px rgba(0,0,0,.2);
}
button span{
    position: absolute;
    display: block;
}
button span:nth-child(1){
    height: 3px;
    width:200px;
    top:0px;
    left:-200px;
    background: linear-gradient(to right, rgba(0,0,0,0), #f6e58d);
    border-top-right-radius: 1px;
    border-bottom-right-radius: 1px;
    animation: span1 2s linear infinite;
    animation-delay: 1s;
}

@keyframes span1{
    0%{
        left:-200px
    }
    100%{
        left:200px;
    }
}
button span:nth-child(2){
    height: 70px;
    width: 3px;
    top:-70px;
    right:0px;
    background: linear-gradient(to bottom, rgba(0,0,0,0), #f6e58d);
    border-bottom-left-radius: 1px;
    border-bottom-right-radius: 1px;
    animation: span2 2s linear infinite;
    animation-delay: 2s;
}
@keyframes span2{
    0%{
        top:-70px;
    }
    100%{
        top:70px;
    }
}
button span:nth-child(3){
    height:3px;
    width:200px;
    right:-200px;
    bottom: 0px;
    background: linear-gradient(to left, rgba(0,0,0,0), #f6e58d);
    border-top-left-radius: 1px;
    border-bottom-left-radius: 1px;
    animation: span3 2s linear infinite;
    animation-delay: 3s;
}
@keyframes span3{
    0%{
        right:-200px;
    }
    100%{
        right: 200px;
    }
}

button span:nth-child(4){
    height:70px;
    width:3px;
    bottom:-70px;
    left:0px;
    background: linear-gradient(to top, rgba(0,0,0,0), #f6e58d);
    border-top-right-radius: 1px;
    border-top-left-radius: 1px;
    animation: span4 2s linear infinite;
    animation-delay: 4s;
}
@keyframes span4{
    0%{
        bottom: -70px;
    }
    100%{
        bottom:70px;
    }
}

button:hover{
    transition: all .5s;
    transform: rotate(-3deg) scale(1.1);
    box-shadow: 0px 3px 5px rgba(0,0,0,.4);
}
button:hover span{
    animation-play-state: paused;
}
</style>
<body>
<div class="wrapper">
  <button>
    <a href="index.jsp" style="color:white;text-decoration:none;">Add More</a>
    <span></span>
    <span></span>
    <span></span>
    <span></span>
  </button>
</div>
<%
Connection con=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrganizationType?useSSL=false","root","Pranil@2003");
	System.out.println("link2");
	PreparedStatement pst = con.prepareStatement("select * from O_Type_Table");
	ResultSet resultSet = pst.executeQuery();
	%>
<h2>View Panel</h2>
<div class="table-wrapper">
    <table class="fl-table">
        <thead>
        <tr>
            <th style="background-color: #00ff00;">Update</th>
            <th style="background-color: #ff0000;">Delete</th>
            <th>Type-Code</th>
            <th>Type-Name</th>
        </tr>
        </thead>
        <tbody>    
    <%
    while(resultSet.next()){
    	OrganizationType Org_class=new OrganizationType();
    	Org_class.setTypecode(resultSet.getString("typecode"));
    	Org_class.setTypeame(resultSet.getString("typename")); 
%>         
        <tr>
            <td style="background-color: rgba(0, 255, 0, 0.1);"><a href="update.jsp?typecode=<%= Org_class.getTypecode() %>&typename=<%=Org_class.getTypeame()%>" >Update</a>
</td>
            <td style="background-color: rgba(255, 0, 0, 0.1);" >
<a href="delete.jsp?typecode=<%= Org_class.getTypecode() %>&typename=<%=Org_class.getTypeame()%>" >Delete</a>
</td>
            <td>
<%=Org_class.getTypecode() %>
</td>
<td>
<%=Org_class.getTypeame() %>
</td>
        </tr>
        <%}%>
        </tbody>
    </table>
</div>



</body>
</html>
   <%    con.close();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}finally{
}
%>