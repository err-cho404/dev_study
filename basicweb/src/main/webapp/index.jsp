<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id = "container">
		<a href="requestOne.jsp?iname=yang&address=suwon&age=19&hobby=music&hobby=book">서버자료전달</a>
		
		<p>입력 형식(폼)에 따라서 자료를 전달해보기</p>
		<form action="requestThree.jsp" method="get">
			<fieldset>
			<legend>필수입력</legend>
			<input type="text" name ="iname" placeholder="이름을 입력하세요"/> <br />
			<input type="email" name ="id" placeholder="id을 입력하세요(e-mail)"/> <br />
			<input type="password" name ="password" placeholder="pw을 입력하세요"/> <br />
			</fieldset>
			
		<fieldset>
		<legend>선택입력</legend>
			<input type="text" name ="address" placeholder="주소를 입력하세요"/> <br />
		
			<fieldset>
			<legend>취미</legend>
			<label for="mt">수집</label><input type="checkbox" name="hobby" id="mt" value="hiking"/><br />
				<label for="pt">헬스</label><input type="checkbox" name="hobby" id="pt" value="personaltraining"/><br />
					<label for="mv">영화감상</label><input type="checkbox" name="hobby" id="mv" value="movie"/><br />
						<label for="bk">독서</label><input type="checkbox" name="hobby" id="bk" value="book"/><br />
			</fieldset>
			<label for="age">나이입력</label><input type="number" name ="age" id="age" title="나이를 숫자로" /> <br />
			성별 : <br />
			남 : <input type="radio" name="gender" id="" value="남" /><br />
			여 : <input type="radio" name="gender" id="" value="여" /><br />
<!-- 			<input type="submit" value ="자료전달" />  -->
	<button>입력자료전송</button>
	테스트입력상자: <input type="text" name = "testData" value="sampleData" hidden="hidden"/>
		</fieldset>
		</form> 
		
		<a href="ClientInfo.jsp?aaa=200&bbb=300">클라이언트 정보(ip주소) 알아보기</a>
	</div>
</body>
</html>