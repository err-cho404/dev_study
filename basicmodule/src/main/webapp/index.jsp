<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@include file="toforward.jsp" %>
<%
	String gender = request.getParameter("gender");
//잘못된 데이터가 들어오더락도 선행작업으로 미리 자바 프로그램에서 처리해준다. =>복잡도가 줄어든다(조기리턴)
	if(gender == null || gender == ""){
		gender = "gen";
	}
	gender = gender.toUpperCase();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>인덱스의 주제어임</h1>
	<h1>인덱스의 주제어임</h1>
	<%
	if(gender.equals("MAN")) {
	%>
		<jsp:forward page = "manInfo.jsp"></jsp:forward>
	<%
	}else if(gender.equals("WOMAN")) {
	%>
		<jsp:forward page = "womanInfo.jsp"></jsp:forward>
	<%
	}else {
	%>
		<jsp:forward page = "generalInfo.jsp"></jsp:forward>
	<%
	}
	%>
</body>
</html>