<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=request.getParameter("uname");
out.print("welcome"+name);%> <br><br>
Expression Tag::::Current Time:
<%= java.util.Calendar.getInstance().getTime() %> <br><br>
<%="welcome"+request.getParameter("uanme") %>
<%="Password entered:"+request.getParameter("upass") %> <br> <br>
<%--session object --%>
<strong>Session example creation time:</strong>
<%=session.getCreationTime() %><br><br>
<%--config object --%>
<strong>config example servlet name:</strong>
<%=config.getServletName() %>

</body>
</html>