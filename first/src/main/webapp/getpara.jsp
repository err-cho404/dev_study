<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>
<%
	String addr = request.getParameter("address");
//넘겨받은 자료들은 일반적으로 데이터베이스에 저장하는 작업을 하거나 아니면 데이터베이스에 저장된 자료를 조회하는 작업을 한다.
%>
<p>받은 주소 자료는<%= addr %></p>
</body>
</html>