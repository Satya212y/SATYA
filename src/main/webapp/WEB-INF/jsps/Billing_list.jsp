<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billings || List</title>
</head>
<body>
<h2>Billings Result</h2>
<table>
				<tr>
				<th>ID</th>
				    <th>First Name</th>
				     <th>Last Name</th>
				      <th>Email</th>
				       <th>Mobile</th>
				         <th>Product Name</th>
				          <th>Amount</th>
				         <th>Delete</th>
				</tr>
				<c:forEach items="${bill}" var="bills">
				<tr>
				<td>${bills.id}</td>
				 <td><a href= "getOneBillInfo?id=${bills.id}">${bills.firstName}</a></td>
				   <td>${bills.lastName}</td>
				    <td>${bills.email}</td>
				      <td>${bills.mobile}</td>
				      <td>${bills.productName}</td>
				      <td>${bills.amount}</td>
				       <td><a href="deletebills?id=${bills.id}">delete</a></td>
				        
				      
				       
				    
				</tr>
				</c:forEach>
				

</table>

	


</body>
</html>