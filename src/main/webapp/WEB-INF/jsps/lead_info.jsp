<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h2>Lead || Info</h2>

First name:${lead.firstName} <br/>
Last name:${lead.lastName} <br/>
Email:${lead.email} <br/>
Mobile:${lead.mobile} <br/>
Gender:${lead.gender} <br/>
Lead Source:${lead.leadSource} <br/>
<form action="convert" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<input type="submit" value="convert" />
</form>



</body>
</html>