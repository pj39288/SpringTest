<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HOT 5</h1>
	
	<table class="table text-center">
		<thead>
			<tr>
				<th>순위</th>
				<th>제목</th>
			</tr>
		
		</thead>
	
		<tbody>
		<c:forEach var="music" items="${musicRanking }" varStatus="status">
			<tr>
				<td>${status.count }</td>
				<td>${music }</td>
			</tr>
		
		</c:forEach>
		</tbody>
	</table>
	

</body>
</html>