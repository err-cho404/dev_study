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
	<div>
		<p><a href="detailSangpum.jsp?sangpumName=el01">가전제품1</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=el02">가전제품2</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=el03">가전제품3</a></p>
	</div>
	<hr />
	<div>
		<p><a href="detailSangpum.jsp?sangpumName=fd01">식료품1</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=fd02">식료품2</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=fd03">식료품3</a></p>
	</div>
	<hr />
	<div>
		<p><a href="detailSangpum.jsp?sangpumName=sh01">신발1</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=sh02">신발2</a></p>
		<p><a href="detailSangpum.jsp?sangpumName=sh03">신발3</a></p>
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