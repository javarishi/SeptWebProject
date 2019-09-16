<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	
	//response.sendRedirect("http://www.h2kinfosys.com");
	RequestDispatcher rd = request.getRequestDispatcher("hello.jsp");
	//RequestDispatcher rd = application.getRequestDispatcher("/hello.jsp");
	rd.forward(request, response);
	
	
%>

</body>
</html>