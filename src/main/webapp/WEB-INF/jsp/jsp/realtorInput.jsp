<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>공인중개사 추가</h1>

	<form method="post" action="/jsp/realtor/add">
	
		<label>상호명</label>
		<input type="text" class="form-control" name="office">
		<label>전화번호</label>
		<input type="text" class="form-control" name="phoneNumber">
		<label>주소</label>
		<input type="text" class="form-control" name="address">
		<label>등급</label>
		<input type="text" class="form-control" name="grade">
		<button type="submit">추가</button>
	
	
	</form>



</body>
</html>