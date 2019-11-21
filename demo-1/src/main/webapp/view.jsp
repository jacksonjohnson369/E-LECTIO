<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student List</h1>  
<table border="1">  

<tr><th>
ID</th>
<th>Name</th><th>Password</th></tr>  
  <c:forEach var="list" items="${list}">  
  <tr>
  <td>${list.id}</td>    
  <td>${list.username}</td>  
  <td>${list.password}</td>    
 
  </tr>  
  </c:forEach>  
  </table>  
  <br/>  
   
</body>
</html>