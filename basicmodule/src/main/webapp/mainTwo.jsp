<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인의 첫 내용</h1>
	<%
		request.setAttribute("irum","김 마리");
		request.setAttribute("age", 19);
	%>
	<jsp:include page="subTwo.jsp">
	<jsp:param value="mari" name="iname"/>
	<jsp:param value="19" name="age"/>
	</jsp:include> <!--subTwo.jsp?iname=yangdoll&age=19 -->
	
	<h3>메인의 마지막 내용</h3>
</body>
</html>