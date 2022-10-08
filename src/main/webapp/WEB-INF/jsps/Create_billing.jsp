<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create || Bills</title>
</head>
<body>
<h2>Create New Bills</h2>
<form action="saveBilling" method="post">
				<pre>
				First Name<input type="text" name="firstName" value="${billing.firstName}" />
				Last Name<input type="text" name="lastName"  value="${billing.lastName}" />
				Email<input type="text" name="email" value="${billing.email}" />
				Mobile<input type="text" name="mobile"  value="${billing.mobile}"/>
				Product Name<input type="text" name="productName" />
				Amount<input type="text" name="amount" />
				
				<input type="submit" value="save" />
				</pre>
</form>




</body>
</html>