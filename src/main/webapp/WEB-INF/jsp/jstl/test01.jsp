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
	<h1>JSTL core 변수</h1>
	<c:set var="number1" value="36" />
	<c:set var="number2" value="3" />
	<h2>첫번째 숫자 : ${number1 }</h2>
	<h2>두번째 숫자 : ${number2 }</h2>
	
	<h4>더하기: ${number1 + number2 }</h4>
	<h4>빼기: ${number1 - number2 }</h4>
	<h4>곱하기: ${number1 * number2 }</h4>
	<h4>나누기: ${number1 / number2 }</h4>
	
	<c:out value="<title>core out</title>" />
	

	
	<c:set var="average" value="$(number1 + number2) /2 >= 10"></c:set>
	
	<c:if test="${average >=10" }>
		<h1>${average }</h1>
	</c:if>
	<c:if test="${average < 10" >
		<h3>${average }</h3>
	</c:if>

</body>
</html>