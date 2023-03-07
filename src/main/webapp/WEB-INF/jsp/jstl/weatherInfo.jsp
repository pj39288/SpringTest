<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>날씨정보 페이지</title>
</head>
<body>
	<div>
		<h3>기상청</h3>
		<h3>날씨</h3>
		<h3>날씨입력</h3>
		<h3>테마날씨</h3>
		<h3>관측기후</h3>
	</div>
	
	<div>
		<h1>과거 날씨</h1>
		<table border="1" >
			<thead>
				<tr>
					<th>날짜</th>
					<th>날씨</th>
					<th>기온</th>
					<th>강수량</th>
					<th>미세먼지</th>
					<th>풍속</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="weather" items="${weatherList}">
				<tr>
					<td>${weather.date }</td>
					<td>${weather.weather }</td>
					<td>${weather.temperature }</td>
					<td>${weather.precipitation }</td>
					<td>${weather.microDust }</td>
					<td>${weather.windSpeed }</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	<div>
		(07062) 서울시 동작구 여의대방로 16길 61 <br>
		Copyright@2020
	
	</div>


</body>
</html>