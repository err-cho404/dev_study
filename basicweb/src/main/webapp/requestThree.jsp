<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <%
    // 파라미터 이름들을 가져오는 방법
    Enumeration<String> paramNames = request.getParameterNames();
	while(paramNames.hasMoreElements()){
		System.out.println(paramNames.nextElement());
	}
%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    // 파라미터 이름들을 가져오는 방법
    Enumeration<String> paramNames = request.getParameterNames();
	while(paramNames.hasMoreElements()){
		String paramName = paramNames.nextElement();
		out.println("넘겨받은 파라미터 이름=>" + paramNames + ",");
		String[] datas = request.getParameterValues(paramName);
		out.println( paramName + "으로 전달받은 자료=>");
		for(int i=0; i<datas.length; i = i+1){
			out.print(datas[i]+"&nbsp;&nbsp;&nbsp;");
		}
	out.print("<br />");
	}
%>
</body>
</html>