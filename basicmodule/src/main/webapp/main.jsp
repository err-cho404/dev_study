<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인의 가장 큰 주제어 001</h1>
	<h1>메인의 가장 큰 주제어 002</h1>
	<h1>메인의 가장 큰 주제어 003</h1>
	<h1>메인의 가장 큰 주제어 004</h1>
	<h1>메인의 가장 큰 주제어 005</h1>
	<jsp:include page="sub.jsp"></jsp:include>
  	<%-- <p>sub.jsp에서 선언한 변수 사용해보기 <%= data %></p>  --%>
	<p>sub.jsp에서 setAttribute로 선언한 변수 사용해보기 <%= request.getAttribute("data") %></p>
	<h3>메인의 세번째 주제어 01</h3>
	<h3>메인의 세번째 주제어 02</h3>
	<h3>메인의 세번째 주제어 03</h3>
</body>
</html>