<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String iname = request.getParameter("iname");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	String address = request.getParameter("address");
	String ageString = request.getParameter("age");
	int age = Integer.parseInt(ageString);
	String[] hobby = request.getParameterValues("hobby");
	String gender = request.getParameter("gender");
	String testData = request.getParameter("testData");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	전달받은 자료 : <%= iname %> <br />
	전달받은 자료 : <%= id %> <br />
	전달받은 자료 : <%= password %> <br />
	전달받은 자료 : <%= address %> <br />
	전달받은 자료 : <%= age %> <br />
	전달받은 취미 : 
	<% 
		for(int i=0; i< hobby.length; i=i+1) {
	%> 
		<%=hobby[i] %> <br />
	<%
		}
	%>
	<%
		for(int i=0; i< hobby.length; i=i+1) {
			out.print(hobby[i]+"<br />");
		}
	%>
	전달받은 성별 : <%= gender %> <br />
	숨겨져서 전달되는 자료 : <%= testData %> <br />
</html>