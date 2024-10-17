<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//접속자의 정보를 얻어오기=>jsp에서 사용되는 경우는 거의 없고 서블릿 자바(컨트롤러) 작성시 많이 사용됨
	// 1.ip주소 얻어오기(가장중요)
		String clientIpAddress = request.getRemoteAddr();
	// 2.URI 얻어오기(포트번호 뒤에오는 것) --> 경로및 요청 파일명을 알기 위해서 자주 사용 된다.
		String reqURI = request.getRequestURI();
		//경로 알아보기 ==>reqURI.substring(0,reqURI.lastIndexOf("/"))
		//요청 파일명 알아보기 ==>reqURI.substring(reqURI.lastIndexOf("/")+1)
	// 3.요청컨텍스트패스 얻어오기
		String ctxPath = request.getContextPath();
	// 4.요청정보길이 얻어오기
		int reqLength = request.getContentLength();
	// 5.요청한 문자 인코딩 방식 얻어오기
		String charEncoding = request.getCharacterEncoding();
	// 6.요청한 프로토콜(최근들어 종종 사용,코워딩이나 리다이렉트할 때)
		String reqProtocol = request.getProtocol(); //=> HTTP/1.1
	%>
	
	<p>접속한 클라이언트의 ip = <%= clientIpAddress %></p>
	<p>접속한 클라이언트의 URI = <%= reqURI %></p>
	<p>요청 URI에서 요청 문서(파일명) 얻어오기 = <%= reqURI.lastIndexOf("/") %></p>
	<p>요청 URI에서 요청 문서(파일명) 얻어오기 = <%= reqURI.substring(reqURI.lastIndexOf("/")+1) %></p>
	<p>요청 컨텍스트패스 얻어오기 = <%= ctxPath %></p>
	<p>접속한 클라이언트의 요청정보길이 = <%= reqLength %></p>
	<p>접속한 클라이언트의 요청문자방식 = <%= charEncoding %></p>
	<p>접속한 클라이언트의 요청프로토콜 = <%= reqProtocol.split("/")[0] %></p> 
</body>
</html>