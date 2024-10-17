<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>직원 입력 작업</h1>
	<form action="empInputProc.jsp" method="get" >
		<input type="number" name="EMPLOYEE_ID" placeholder="사원번호" /><br />
		<input type="text" name="FIRST_NAME" placeholder="이름" /><br />
		<input type="text" name="LAST_NAME" placeholder="성" /><br />
		<input type="text" name="EMAIL" placeholder="email" /><br />
		<input type="text" name="PHONE_NUMBER" placeholder="전화번호" /><br />
		<input type="text" name="JOB_ID" placeholder="직책코드" /><br />
		<input type="text" name="SALARY" placeholder="급여" /><br />
		<input type="number" name="COMMISSION_PCT" placeholder="판매직 커미션비율" /><br />
		<input type="number" name="MANAGER_ID" placeholder="부서장ID" /><br />
		<input type="text" name="DEPARTMENT_ID" placeholder="부서코드" /><br />
		<hr />
		<input type="submit" value="직원등록" /><input type="reset" value="입력취소" />
	</form>
</body>
</html>