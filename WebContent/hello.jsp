<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    autoFlush="true"
    buffer="8kb"
    errorPage="error.jsp"
    isErrorPage="false"
    import="java.util.Date"
    info="Additional information about this page."
    session="true"
    isThreadSafe="true"
    isELIgnored="true"
    %>
<!DOCTYPE html>
<html>
<head>
<title>First JSP</title>
</head>
<body>
<!-- HTML Comments are similar to XML Comments -->
<p> Trying to Access Java in HTML Page </p>

<%! int total = 0; %>

<%-- This is JSP Comment --%>

<%
	// implicit objects	
	
	
	request.setAttribute("ServletRequest", "ServletRequestValue");
	response.setContentType("text/html");
	out.println("This is simpler than we thought");
	session.setAttribute("sessionAttr", "sessionAttrvalue");
	config.getInitParameter("DBName");
	application.setAttribute("contextAttr", "ContextAttrValue");
	// page - instance of JSP Page itself
	pageContext.setAttribute("validforPageAttr", "Page Attribute", PageContext.PAGE_SCOPE);
	
	
	for(int i=0; i < 10; i++){
		total = total + i;
	}
	out.println("Even Did a small Java Loop :" + total);
%>

<p> Using Expressions Today's date: <%= (new Date()).toLocaleString()%> </p>

<%@ include file="footer.jsp" %>
</body>
</html>