<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create || Lead</title>
</head>
<body>
<h2>Create New Lead</h2>
<form action="saveLead" method="post">
				<pre>
				First Name<input type="text" name="firstName" />
				Last Name<input type="text" name="lastName" />
				Email<input type="text" name="email" />
				Mobile<input type="text" name="mobile" />
				Gender:
				Male<input type="radio"  name="gender" value="Male"/>
				Female<input type="radio"  name="gender" value="Female"/>
			
				Lead Source:<select name="leadSource">
					  <option value="Tv">Tv</option>
					  <option value="News paper">NewsPaper</option>
					  <option value="FaceBook">facebook</option>
					  <option value="Other">Other</option>
					</select>
				
				<input type="submit" value="save" />
				</pre>
</form>




</body>
</html>