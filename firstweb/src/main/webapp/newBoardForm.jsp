<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시글 입력 화면</h1>
	
	<form action="./newBoardProc.jsp" method="get">
		제목 : <input type="text" name="title" /><br />
		내용 : <textarea rows="5" cols="40" name="contents"></textarea><br />
		작성자 : <input type="text" name="irum" /><br />
		비밀번호 : <input type="password" name="password" /><br />
		<input type="submit" value="게시글 등록" /> &nbsp;&nbsp;&nbsp; 
		<input type="reset" value="입력취소" />
	</form>
</body>
</html>