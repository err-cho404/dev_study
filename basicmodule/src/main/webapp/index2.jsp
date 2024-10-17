<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@include file="toforward.jsp" %>
<%
	String gender = request.getParameter("gender");
//잘못된 데이터가 들어오더락도 선행작업으로 미리 자바 프로그램에서 처리해준다. =>복잡도가 줄어든다(조기리턴)
	if(gender == null || gender == ""){
		gender = "general";
	}
	gender = gender.toLowerCase() + "Info.jsp";
	pageContext.setAttribute("gender",gender);
	System.out.print(gender);
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
	<jsp:forward page = "${gender}"></jsp:forward>
	<jsp:forward page = "<%=gender %>"></jsp:forward>
</body>
</html>