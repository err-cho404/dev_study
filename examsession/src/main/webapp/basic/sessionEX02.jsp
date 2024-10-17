<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	request.setAttribute("userInfo", "cho");
	session.setAttribute("userInfo", "세션에 저장되는 값"); //여기서 만듦
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= session.getId() %></h1>
	<h1><%= session.getCreationTime() %></h1>
	<h1><%= new Date(session.getCreationTime()).toString() %></h1>
	<h1><%= new Date(session.getLastAccessedTime()).toString() %></h1>
	<h1><%= session.getAttribute("userInfo") %></h1>
	<h1>${sessionScope.userInfo}</h1>
	<h1>${requestScope.userInfo}</h1>
</body>
</html>