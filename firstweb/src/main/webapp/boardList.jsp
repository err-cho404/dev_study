<%@page import="kr.co.yangdoll.firstweb.vo.SimpleBoardVo"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardServiceImpl"%>
<%@page import="kr.co.yangdoll.firstweb.service.SimpleBoardService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border: solid 1px black;
		border-collapse: collapse; 
	}
</style>
</head>
<body>
	<h1>게시글 보기</h1>
	<%
		SimpleBoardService service = new SimpleBoardServiceImpl();
		int listCount = service.getCount();
		List<SimpleBoardVo> list = service.getBoardPageList(1, 10);
		int listSize = list.size();
		System.out.println( list.get(0) );
		System.out.println( "자료배열의 개수 " + listSize );
		
	%>
	<p>  <%= listCount %>개의 자료가 있습니다.</p>
	
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
		</tr>
	<%
	for( int i = 0; i < list.size(); i=i+1 ){
		SimpleBoardVo vo = list.get(i);
	%>	
		<tr>
			<td><%= vo.getSerNum()  %></td>
			<td><a href="./detailBoard.jsp?serNum=<%=vo.getSerNum()  %>"> <%= vo.getTitle() %>  </a></td>
			<td><%= vo.getIrum() %></td>
			<td><%= vo.getReadCount() %></td>
		</tr>
		
	<% 
	}
	%>
	</table>
	
	<a href="./newBoardForm.jsp">새글쓰기</a>
	
</body>
</html>