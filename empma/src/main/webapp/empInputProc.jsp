<%@page import="com.yangdoll.empma.dao.EmployeeDAOJdbc"%>
<%@page import="com.yangdoll.empma.dao.EmployeeDAO"%>
<%@page import="com.yangdoll.empma.vo.EmployeeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%
	//데이터를 받기
	int EMPLOYEE_ID = Integer.parseInt(request.getParameter("EMPLOYEE_ID"));
	String FIRST_NAME = request.getParameter("FIRST_NAME");
	String LAST_NAME = request.getParameter("LAST_NAME");
	String EMAIL = request.getParameter("EMAIL");
	String PHONE_NUMBER = request.getParameter("PHONE_NUMBER");
	String JOB_ID = request.getParameter("JOB_ID");
	double SALARY = Double.parseDouble(request.getParameter("SALARY"));

	Double COMMISSION_PCT = null;   
	   if(request.getParameter("COMMISSION_PCT") != "" && request.getParameter("COMMISSION_PCT") != null) {
	      COMMISSION_PCT = Double.parseDouble(request.getParameter("COMMISSION_PCT"));
	   }
	   
	   Integer MANAGER_ID = null;
	   if(request.getParameter("MANAGER_ID") != "" && request.getParameter("MANAGER_ID") != null) {
	      MANAGER_ID = Integer.parseInt(request.getParameter("MANAGER_ID"));
	   }
	   
	   Integer DEPARTMENT_ID = null;
	   if(request.getParameter("DEPARTMENT_ID") != "" && request.getParameter("DEPARTMENT_ID") != null) {
	      DEPARTMENT_ID = Integer.parseInt(request.getParameter("DEPARTMENT_ID"));
	   }

		
	// 일 시키기 전에 넘어온 데이터를 하나의 데이터로 묶기(vo class타입으로 묶는다)
 	EmployeeVO vo = new EmployeeVO(EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID);
	//dao에게 일 시키기
	EmployeeDAO dao = new EmployeeDAOJdbc();
	int result = dao.add(vo);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기서 데이터를 받은 후에 DAO에게 저장하라고 일을 시킴</h1>
	<h2><%= result %> 개의 자료가 입력되었습니다.</h2>
</body>
</html>