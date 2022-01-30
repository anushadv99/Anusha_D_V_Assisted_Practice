<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--set and out---%>
----set and out attributes----
<c:set esal1="sal1" scope="session" value="20000"/>
<c:out esal1="sal1"/><br>
<c:set esal2="sal2" scope="session" value="14000"/>  
<c:out esal2="sal2"/><br>
<c:set esal3="sal3" scope="session" value="25000"/>
<c:out esal3="sal3"/><br>
<c:set esal4="sal4" scope="session" value="10000"/>
<c:out esal4="sal4"/><br>

<%----if attribute --%>
-----if attribute------
<c:set esal1="sal1" scope="session" value="20000"/>  
<c:if test="${(13000<sal1>9000)}">  
   <p>My income is: <c:out esal1="$(sal1+5000)"/><p>  
</c:if>
<c:set esal12="sal2" scope="session" value="20000"/>  
<c:if test="${(21000<sal1>13500)}">  
   <p>My income is: <c:out esal1="$(sal1+7000)"/><p>  
</c:if>







</body>
</html>