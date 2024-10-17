<%@page import="java.util.Set"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	div#container{  /* #=>id */
		border:red 1px solid;
		width : 80%; /* 가로의 크키는 화면의 80%만큼 갖는다 */
		margine : 0 auto: /* 중앙에 위치시켜라 */
	}
	div#container>div{
		display : inline-block
	}
	div.contents{
		border:blue 1px solid;
		width : 70%; 
	}
	div.viewlist{
		border:green 1px solid;
		width : 29%; 
	}
	
	.contents>ul{
		border:skyblue 1px solid;
		margin-bottom: 20px;
	}
</style>
</head>
<body>
	<div id="container">
		<div class="contents">
			<ul>
				<li><a href="./detail.jsp?spCode=el01">전자제품 01</a></li>
				<li><a href="./detail.jsp?spCode=el02">전자제품 02</a></li>
				<li><a href="./detail.jsp?spCode=el03">전자제품 03</a></li>
				<li><a href="./detail.jsp?spCode=el04">전자제품 04</a></li>
			</ul>
			<ul>
				<li><a href="./detail.jsp?spCode=fd01">식료품 01</a></li>
				<li><a href="./detail.jsp?spCode=fd02">식료품 02</a></li>
				<li><a href="./detail.jsp?spCode=fd03">식료품 03</a></li>
				<li><a href="./detail.jsp?spCode=fd04">식료품 04</a></li>
			</ul>
			<ul>
				<li><a href="./detail.jsp?spCode=sh01">신발제품 01</a></li>
				<li><a href="./detail.jsp?spCode=sh02">신발제품 02</a></li>
				<li><a href="./detail.jsp?spCode=sh03">신발제품 03</a></li>
				<li><a href="./detail.jsp?spCode=sh04">신발제품 04</a></li>
			</ul>
		</div>
<%
	Map<String,Integer> sangpumList = (Map<String,Integer>)session.getAttribute("sangpumList");	
	boolean isSpList = sangpumList != null ? true : false;
	System.out.println("====" + isSpList + "====");
%>
		<div class="viewlist">
			<h3>최근 본 상품 목록</h3>
			<%
				if(isSpList) {
					/* String[] sangpums = sangpumList.split("/");
					for(String sangpum : sangpums){
						out.print("<p>" + sangpum.substring(0,sangpum.indexOf(":")) + " : " + sangpum.substring(sangpum.indexOf(":")+1) + "번</p>" ); */
					Set<String> spCodes = sangpumList.keySet();
					Iterator<String> iter = spCodes.iterator(); //Iterator대신이뮬레이터 사용가능
					while(iter.hasNext()){
						String spKey = iter.next();
						out.print("<p>" + spKey + " : " + sangpumList.get(spKey) + "번 조회</p>");
					}
				}
			%>
			<%
				if( ! isSpList){
					out.print("<p>최근 본 상품이 없습니다.</p>");
				}
			%>
		</div>
`	</div>
</body>
</html>