<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 영역에 저장된 정보 사용</title>
</head>
<body>
<%
	//세션에 저장된 자료를 가져오면 반환되는 타입이 object이기때문에 반드시 원래 저장했던 때의 타입으로 형변환을 해야한다.
	String namesList = (String)session.getAttribute("nameList");
	String[] names = namesList.split("/");
	
	//이름개수만큼 반복해 name을 넣어준다
	for(String name : names){
%>
	<h3>세션에 저장된 이름 : <%= name %></h3>
<%
	}
%>
</body>
</html>