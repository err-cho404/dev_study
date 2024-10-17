<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성</title>
</head>
<body>
<%

//쿠키 만들기
//	Cookie ck = new Cookie("samsung","samsung"); //(쿠키명, 쿠키값)
//만들어진 쿠키를 응답페이지에 추가=>클라이언트에 전달된다.
/* 	ck.setMaxAge(60*60*24);->창닫고 30초 동안은 쿠키를 유지한다
	ck.setDomain(".naver.com"); 
	ck.setPath("/examcookie/aaa/dff/");  */
	
	Cookie ck = CookieBoxUtil.createCookie("sangpum","sangpum",60*60*24);
	response.addCookie(ck);
%>

	<h1>쿠키를 생성하는 페이지 입니다.</h1>
</body>
</html>