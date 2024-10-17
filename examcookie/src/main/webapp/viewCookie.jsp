<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>저장된 쿠키 가져오기</title>
</head>
<body>
<%
	/* Cookie[] cookies = request.getCookies();
	for(int i=0 ; i<cookies.length; i=i+1){
		out.print("쿠키명 : " + cookies[i].getName() + "<br />");
		out.print("쿠키값 : " + cookies[i].getValue() + "<br />"); */
		CookieBoxUtil cookieUtil = new CookieBoxUtil(request);
		if (cookieUtil.exists("sangpum")){
			out.print("쿠키값 : " + cookieUtil.getValue("sangpum") + "<br />");
		}
%>
</body>
</html>