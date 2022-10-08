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
<form action="updateOneLead" method="post">
				<pre>
				<input type="hidden" name="id" value="${leads.id}"/>
				First Name<input type="text" name="firstName" value="${leads.firstName}" />
				  Last Name<input type="text" name="lastName" value="${leads.lastName}"/>
				       Email<input type="text" name="email" value="${leads.email}"/>
					  Mobile<input type="text" name="mobile"value="${leads.mobile}" />
					 Gender:<input type="text"  name="gender" value="Male" value="${leads.gender}"/>
				 Lead Source<input type="text"  name="leadSource"  value="${leads.leadSource}"/>
						
				<input type="submit" value="save" />
				</pre>
</form>




</body>
</html>