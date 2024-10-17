<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	session.setMaxInactiveInterval(60*30);

	session.setAttribute("nameList", "yang/kim/park/song"); //여기서 만듦
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션실습</h1>
	<%= session.getId() %>
	<br />
	<a href="namesPrint.jsp">이름 목록 출력하기</a>
	<a href="sessionOut.jsp">세션 종료</a>
</body>
</html>