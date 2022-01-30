<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
------MarksSheet------
<!-- fmt:formatDate Tag -->

---------------fmt:formatDate---------------
<h2>Different Formats of the Date</h2>  
<c:set var="Date" value="<%=new java.util.Date()%>" />  
<p>  
Formatted Date and Time :  
<fmt:formatDate type="both" value="${Date}" />  
</p> 
<br><br>

<h2>Marks:</h2>  
<fmt:parseNumber var="j" integeronly="true" type="number" value="88"/>
<p><i>Marks 1:</i> <c:out value="${j }"/><i>&nbsp;Total :100</i> </p>
<c:set var="marks" vlue="75"/>
<p> Marks 2:
<fmt:formatNumber value="${marks}" /></p>

<c:set var="marks" value="60" />
<p> Marks 3:
<fmt:formatNumber value="${marks}" /></p>

<c:set var="marks" value="90" />
<p> Marks 4:
<fmt:formatNumber value="${marks}" /></p>

<c:set var="marks" value="90" />
<p> Marks 5:
<fmt:formatNumber value="${marks}" /></p>



</body>
</html>