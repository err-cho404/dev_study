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
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
	
	%> 
	<hr />
 	<h2>서브.jsp의 내용입니다. 1 <%= data1 %></h2>
	<h2>서브.jsp의 내용입니다. 2 <%= data2 %></h2> 
	<h2>서브.jsp의 내용입니다. 3</h2>
	<hr />
	<%
	int data = 500;
 	request.setAttribute("data", data); 
	%>
</body>
</html>