<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="/jstl/test06/add">
	
		<div>
			<h3>기상청</h3>
			<h3>날씨</h3>
			<h3>날씨입력</h3>
			<h3>테마날씨</h3>
			<h3>관측기후</h3>
		</div>
		<div>
			<h1>날씨 입력</h1>
			<label>날짜</label>
			<input type="text" class="form-control" name="date">
			<label>날씨</label>
			<input type="text" class="form-control" name="weather">	
			<label>미세먼지</label>
			<input type="text" class="form-control" name="microDust">		
			<label>기온</label>
			<input type="text" class="form-control" name="temperature" >
			<label>강수량</label>
			<input type="text" class="form-control" name="precipitation">
			<label>풍속</label>
			<input type="text" class="form-control" name="windSpeed">
			<button type="submit" class="btn btn-primary">저장</button>
			
		</div>
	
	</form>
	

</body>
</html>