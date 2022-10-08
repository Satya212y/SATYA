<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact || List</title>
</head>
<body>
<h2>Contact List</h2>
First name:${contact.id} <br/>
First name:${contact.firstName} <br/>
Last name:${contact.lastName} <br/>
Email:${contact.email} <br/>
Mobile:${contact.mobile} <br/>
Gender:${contact.gender} <br/>
Lead Source:${contact.leadSource} <br/>
<form action="convertToLead" method="post">
<input type="hidden" name="id" value="${contact.id}"/>
<input type="submit" value="convert" />
</form>

</body>
</html>