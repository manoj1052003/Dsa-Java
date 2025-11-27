<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%-- <meta http-equiv="refresh" content="0.5"> --%>  

<title>Insert title here</title>
</head>
<body>

	<%@ include file="header.jsp" %>

	<% Date d = new Date(); %>
	
	<h1><%=d%></h1> 
	
	<%@ include file="footer.jsp" %>
	
</body>
</html>