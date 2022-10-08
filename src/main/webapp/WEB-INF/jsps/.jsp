<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search || Result</title>
</head>
<body>
<h2>Search Result</h2>
<table>
				<tr>
				<th>ID</th>
				    <th>First Name</th>
				     <th>Last Name</th>
				      <th>Email</th>
				       <th>Mobile</th>
				        <th>Delete</th>
				         <th>Update</th>
				</tr>
				<c:forEach items="${leads}" var="lock">
				<tr>
				<td>${lock.id}</td>
				 <td>${lock.firstName}</td>
				   <td>${lock.lastName}</td>
				    <td>${lock.email}</td>
				      <td>${lock.mobile}</td>
				       <td><a href="delete?id=${lock.id}">delete</a></td>
				        <td><a href="update?id=${lock.id}">update</a></td>
				    
				</tr>
				</c:forEach>
				

</table>


</body>
</html>