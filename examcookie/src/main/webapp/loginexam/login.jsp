<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
//넘겨받은 id와 비밀번호를 DAO클래스에 넘겨주면서 정보를 요청한다.
//요청한 결과가 null이 아니면 로그인에 성공한 것이다.

//가정해서 아이디와 비밀번호가 같으면 로그인 성공으로 정의하자
	 if (id.equals(password)){
//Cookie ck = CookieBoxUtill.createCookie("login","Success",-1)
		 response.addCookie( CookieBoxUtil.createCookie("login","Success",-1));
		 Cookie ck = CookieBoxUtil.createCookie("id",id,-1);
		 response.addCookie(ck);
//		 out.print("<hi>로그인에 성공</h1>");
		//로그인에 성공한 상태가 된다. 
	 }else{
	//로그인 실패->로그인 폼으로 넘어기도록 한다.
		 response.sendRedirect("./loginForm.jsp");
	 }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 성공</h1>
</body>
</html>