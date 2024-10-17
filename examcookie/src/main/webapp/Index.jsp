<%@page import="examcookie.CookieBoxUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div{
		border : 1px solid green;
	}
</style>
</head>
<body>
	<a href="./loginexam/loginForm.jsp">로그인하기 이 내용은 로그인 안되어 있을때만 나옴 </a>
	<div>
		<p><a href="el01.jsp">가전제품1</a></p>
		<p><a href="el02.jsp">가전제품2</a></p>
		<p><a href="el03.jsp">가전제품3</a></p>
	</div>
	<hr />
	<div>
		<p><a href="fo01.jsp">식료품1</a></p>
		<p><a href="fo02.jsp">식료품2</a></p>
		<p><a href="fo03.jsp">식료품3</a></p>
	</div>
	<hr />
	<div>
		<p><a href="sh01.jsp">신발제품1</a></p>
		<p><a href="sh02.jsp">신발제품2</a></p>
		<p><a href="sh03.jsp">신발제품3</a></p>
	</div>
	<hr />
	<hr />
	<hr />
	<div>
	<h3>최근 본 상품 목록</h3>
		<%
			CookieBoxUtil cbu = new CookieBoxUtil(request);
			if(cbu.exists("viewList")){
					Cookie viewListCookie = cbu.getCookie("viewList");
					String[] sangpums = viewListCookie.getValue().split("/");
					for(int i=0 ; i < sangpums.length ; i=i+1){
					out.print("<p>" + sangpums[i] + "</p>");
					}
			}
			
		%>
	</div>
</body>
</html>