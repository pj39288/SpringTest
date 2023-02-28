<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매자 추가</title>
</head>
<body>

<div class="container">

	<h1>판매자 등록</h1>
	
	<form method="post" action="/jsp/seller/add">
	
		<label>닉네임</label>
		<input type="text" class="form-control" name="nickname">
		<label>프로필 사진 url</label>
		<input type="text" class="form-control" name="profileImage">
		<label>온도</label>
		<input type="text" class="form-control" name="temperature">
		<button type="submit" class="btn btn-primary">추가</button>
	
	</form>
	
	
</div>

</body>
</html>