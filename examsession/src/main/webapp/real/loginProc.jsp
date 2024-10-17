<%@page import="examsession.MemberVo"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
    
<%
/* 데이터를 자바 코드로 구성했다	 (DB에서 조회를 통해 가져와야함) */
	Map<String, MemberVo> members = new HashMap<String, MemberVo>();
	members.put("yang",new MemberVo("yang","1234","suwon","dori"));
	members.put("park",new MemberVo("park","1472","seoul","chulsoo"));
	members.put("hong",new MemberVo("hong","gildong","busan","HongGilDong"));
	String message = "로그인 성공";
	
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	
//	System.out.println("회원 존재 유무"+ members.containsKey(id)); ->회원유무 console창에서 확인
	
	if(members.containsKey(id)){//회원이 존재한다.
		MemberVo vo = members.get(id);
		if(pwd.equals(vo.pwd)){ //회원 존재, 비밀번호 일치->로그인
			session.setAttribute("login", "ok");
			session.setAttribute("myInfo", vo);
//			session.setMaxInactiveInterval(60*10); //가능하면 web.xml에 설정해준다.
		}else{ //회원이 존재(id맞음)하지만 비밀번호가 일치하지 않는다
			message = "존재하는 회원이나 비밀번호가 일치하지 않습니다. 비밀번호를 다시 확인해 주세요";
		}
	}else{ //회원이 존재 하지 않는다.
		message = id + "라는 회원은 존재하지 않습니다.";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>로그인 요청에 관한 정보 : <%= message %></h1>
	<a href="mypage.jsp">내 정보 보기(원칙적으로는 if를 사용해 로그인 성공때만 나와야함)</a>
</body>
</html>