<%@page import="kr.co.yangdoll.firstweb.vo.SimpleBoardVo"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardServiceImpl"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	SimpleBoardService boardService = new SimpleBoardServiceImpl();
	SimpleBoardVo vo = new SimpleBoardVo();
	vo.setTitle( request.getParameter("title") );
	vo.setContents( request.getParameter("contents")  );
	vo.setIrum(  request.getParameter("irum")   );
	vo.setPassword( request.getParameter("password")   );
	int result = boardService.save(vo);
	if( result != 1){
		System.out.println("입력 실패!!!");
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if( result != 1){
	%>
	<h1>입력 실패!!!</h1>
	<a href="./newBoardForm.jsp">입력화면으로 돌아가기</a>
	<%
	}else{
	%>
	<h1>입력 성공!!!</h1>
	<a href="./boardList.jsp">게시판 보기</a>
	<%
	}
	%>
</body>
</html>