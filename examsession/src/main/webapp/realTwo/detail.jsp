<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	String spCode = request.getParameter("spCode");
	Map<String,Integer> spList = (Map<String,Integer>)session.getAttribute("sangpumList");
	if(spList == null){ // 맨처음 상품을 주문했을 때
		Map<String,Integer> map = new HashMap<>();
		map.put(spCode,1);
		session.setAttribute("sangpumList", map); //세션을 생성시켜준다.
	}else { //기존에 조회한 상품이 있을 때
		if(spList.containsKey(spCode)){
			spList.put(spCode, spList.get(spCode) + 1);
		}else{
			spList.put(spCode,1);
		}
		session.setAttribute("sangpumList", spList);
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p><%= spCode %> 의 상세 정보가 나타납니다.</p>
</body>
</html>