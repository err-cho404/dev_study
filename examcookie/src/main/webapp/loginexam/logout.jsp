<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie ck = CookieBoxUtil.createCookie("login", "",0);
		response.addCookie(ck);
		response.addCookie(CookieBoxUtil.createCookie("id","",0));
	%>
	<h3>로그아웃 하였습니다.</h3>
	<a href="<%= request.getContextPath()%>/Index.jsp">홈으로</a>
</body>
</html>