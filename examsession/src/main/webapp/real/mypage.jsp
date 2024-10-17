<%@page import="examsession.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	MemberVo vo = (MemberVo)session.getAttribute("myInfo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>내 정보 보기 및 수정</h1>
	아이디 : <input type="text" value="<%= vo.id %>" /><br />
	비밀번호 : <input type="text" value="<%= vo.pwd %>" /><br />
	주소 : <input type="text" value="<%= vo.address %>" /><br />
	이름 : <input type="text" value="<%= vo.name %>" /><br />
</body>
</html>