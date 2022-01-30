<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<jsp:useBean id="emp" class="com.emp.Employee" scope="session"/>
	<jsp:setProperty property="*" name="emp"/>  
	  
	Record:<br>  
	<jsp:getProperty property="id" name="emp"/><br>
	<jsp:getProperty property="name" name="emp"/><br>  
	<jsp:getProperty property="age" name="emp"/><br>  
	<jsp:getProperty property="dept" name="emp" /><br>
	

</body>
</html>