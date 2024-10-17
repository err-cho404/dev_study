<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//	String hobbyOne = request.getParameter("hobby");
//	String hobbyTwo = request.getParameter("hobby");
	String[] hobby = request.getParameterValues("hobby");
	String[] age = request.getParameterValues("age");
	String address = request.getParameter("address");
	String[] iname= request.getParameterValues("iname");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전달받은 자료 => 이름 : <%= iname[0] %> <br />
	전달받은 자료 => 주소 : <%= address%> <br />
	전달받은 자료 => 나이 : <%= age[0]%> <br />
	전달받은 자료 => 취미 : <%= hobby[0]%> 와 <%= hobby[1]%> <br />
</body>
</html>