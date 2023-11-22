<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">

</head>

<body>
	<div class="login-page">
		<div class="form">
			<div class="login">
				<div class="login-header">
					<h3>New</h3>
					<p>Please enter your Organization Details.</p>
				</div>
			</div>
			<form class="login-form" action="GetAll" method="post">
				<input type="text" placeholder="Enter Code" name="typecode">

				<input type="text" placeholder="Enter Name" name="typename">
				<div style="display:flex;"><button>Save</button>
				<br><br><br>
				<button style="margin-left:10px;"><a href="display.jsp" style="text-decoration:none;color:white;"class="btn btn-info">Back</a></button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>