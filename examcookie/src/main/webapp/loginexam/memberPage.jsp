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
	CookieBoxUtil chu = new CookieBoxUtil(request);
	if( chu.exists("login")){
%>
	<h1>이 페이지는 회원 전용입니다.</h1>
	<h1>이 페이지는 회원 전용입니다.</h1>
	<a href="<%= request.getContextPath()%>/index.jsp">홈으로</a>
<% 
	}else{
%>	
	<p>로그인을 하지 않아 이 페이지의 내용을 볼 수 없습니다.</p>
	<a href="./loginForm.jsp">로그인하기</a>
<%
	}
%>
</body>
</html>