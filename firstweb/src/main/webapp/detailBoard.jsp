<%@page import="kr.co.yangdoll.firstweb.vo.SimpleBoardVo"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardServiceImpl"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	long serNum = Long.parseLong(  request.getParameter("serNum")  )   ;
	SimpleBoardService service = new SimpleBoardServiceImpl();
	SimpleBoardVo vo = service.getBoardOne(serNum);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세 게시글 보기</h1>
	<table>
		<tr>
			<th>번호</th>
			<td><%= vo.getSerNum() %></td>
		</tr>
		<tr>
			<th>제목</th>
			<td><%= vo.getTitle() %></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><%= vo.getContents() %></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><%= vo.getIrum() %></td>
		</tr>
		<tr>
			<th>조회수</th>
			<td><%= vo.getReadCount() %></td>
		</tr>
		<tr>
			<th>작성일</th>
			<td><%= vo.getRegiDate() %></td>
		</tr>
	</table>
	
	<a href="./boardList.jsp">게시판 보기</a>
</body>
</html>