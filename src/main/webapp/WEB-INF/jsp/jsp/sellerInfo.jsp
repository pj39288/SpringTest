<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매자 정보</title>
</head>
<body>

<div class="container">
	<h1>판매자 정보</h1>

	<img width="300" alt="프로필 사진" src="${seller.profileImage }">
	<div class="display-4">${seller.nickname }</div>
	<h2 class="text-warning">${seller.temperature }</h2>
	
</div>

</body>
</html>