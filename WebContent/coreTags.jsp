<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Core Tag Library</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2*2}"/>
<p>
<c:out value="Value of Salary :: " />
	<fmt:formatNumber value="${salary}" type="currency" groupingUsed="true" currencySymbol="$" />
</p>
<p>
<c:out value="Value of Salary Without grouping:: " />
	<fmt:formatNumber value="${salary}" type="currency" groupingUsed="false" currencySymbol="$" />
</p>
<p>
<c:out value="Value of Salary with Currency Code:: " />
	<fmt:formatNumber value="${salary}" type="currency" groupingUsed="true"  currencySymbol="$"/>
</p>

<c:if test="${salary > 2000}">
	<c:out value="Salary is greater than 2000" />
</c:if>

<c:choose>
	<c:when test="${salary > 2000}">
		<c:out value="Salary is greater than 2000"></c:out>
		<fmt:formatNumber value="${salary}" type="currency"/>
	</c:when>
	<c:when test="${salary < 2000}">
		<c:out value="Salary is Less than 2000"></c:out>
		<fmt:formatNumber value="${salary}" type="currency"/>
	</c:when>
	<c:otherwise>
		<c:out value="Go ahead and change your Job"></c:out>
		<fmt:formatNumber value="${salary}" type="currency"/>
	</c:otherwise>
</c:choose>


<c:forEach var="i" begin="1" end="5">
	Item <c:out value="Value of i :: ${i}"/><p>
</c:forEach>


<c:forTokens items="Zara,nuha,roshy,raju" delims="," var="name">
	For with Tokens: <c:out value="${name}"/><p>
</c:forTokens>


<c:set var="now" value="<%=new java.util.Date()%>" /> 
 
<p>Formatted Date : time (1): <fmt:formatDate type="time" value="${now}" /></p>
<p>Formatted Date : date (2): <fmt:formatDate type="date" value="${now}" /></p>
<p>Formatted Date : both (3) in EST: <fmt:formatDate type="both" value="${now}" timeZone="EST" /></p>
<p>Formatted Date : short (4): <fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${now}" /></p>
<p>Formatted Date : medium (5): <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${now}" /></p>
<p>Formatted Date :long (6): <fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${now}" /></p>
<p>Formatted Date : yyyy-MM-dd (7): <fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${now}" /></p>


<fmt:setBundle basename="com.h2kinfosys.web.myVars_en" var="english_lang"/>
	<fmt:message key="AccType1" bundle="${english_lang}"/><br/>
	<fmt:message key="AccType2" bundle="${english_lang}"/><br/>
	<fmt:message key="AccType3" bundle="${english_lang}"/><br/> 
</body>
</html>