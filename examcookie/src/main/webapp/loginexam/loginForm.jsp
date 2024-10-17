<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
<%
	CookieBoxUtil cbu = new CookieBoxUtil(request);
	if(!cbu.exists("login")){
%>
	<div>
		<h3>로그인이 되어있지 않을때 나타나는 화면</h3>
		<form action="./login.jsp" method="post" >
			<input type="text" name="id" placeholder="아이디 입력" /><br />
			<input type="password" name="password" placeholder="비밀번호 입력" /><br />
			<input type="submit" value="로그인" />
		</form>
	</div>
<%	
	}else{
%>		
	<div>
		<h3>로그인이 되었을 때 나타날 화면</h3>
		<p>로그인 아이디 정보 : <%= cbu.getValue("id")%></p>
		<a href="./logout.jsp">로그아웃</a>
	</div>
<%	
	}
%>
</body>
</html>