<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="index.jsp">HOME</a><br><br>
	<table align="center" border="1px">
	    <tr>
	       <th>ID</th>
	       <th>FIRST NAME</th>	       
	       <th>AGE</th>
	    </tr>
	    <c:forEach var="person" items="${list}">
	    	<tr>
	    	   <td>${person.sid}</td>	          
	           <td>${person.name}</td>
	           <td>${person.age}</td>
           </tr>
	    </c:forEach>    
	</table>	
</body>
</html>