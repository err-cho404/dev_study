<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	
	Enumeration <String> headerNames = request.getHeaderNames();
		while(headerNames.hasMoreElements()){
		String headerName = headerNames.nextElement();
		out.print("<P>헤더명 : " + headerName + ", 값 =>");
		out.print(request.getHeader(headerName) + "</p>");
	}
%>
</body>
</html>