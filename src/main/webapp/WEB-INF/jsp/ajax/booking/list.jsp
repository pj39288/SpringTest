<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 목록</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</head>
<body>
	<h1 class="text-center">통나무 팬션</h1>
	
	<nav>
		<ul class="nav nav-fill">
			<li class="nav-item"><a href="#" class="nav-link main-link">팬션소개</a></li>
			<li class="nav-item"><a href="#" class="nav-link main-link">객실보기</a></li>
			<li class="nav-item"><a href="#" class="nav-link main-link">예약하기</a></li>
			<li class="nav-item"><a href="#" class="nav-link main-link">예약목록</a></li>
		</ul>
	</nav>
	
	<h3 class="text-center">예약 목록 보기</h3>
	
	<table class="table text-center">
		<thead>
			<tr>
				<th>이름</th>
				<th>예약날짜</th>
				<th>숙박일수</th>
				<th>숙박인원</th>
				<th>전화번호</th>
				<th>예약상태</th>
				<th></th>
			
			</tr>
		
		</thead>
	
		<tbody>
		<c:forEach var="booking" items="${bookingList}">
		
			<tr>
				<td>${booking.name }</td>
				<td><fmt:formatDate value="${booking.date }" pattern="yyyy년 M월 d일"/></td>
				<td>${booking.day }</td>
				<td>${booking.headCount }</td>
				<td>${booking.phoneNumber }</td>
				<c:choose>
					<c:when test="${booking.state eq '확정' }">
						<td class="text-success">${booking.state }</td>					
					</c:when>
					<c:when test="${booking.state eq '대기중' }">
						<td class="text-info">${booking.state }</td>					
					</c:when>
					<c:when test="${booking.state eq '취소' }">
						<td class="text-danger">${booking.state }</td>					
					</c:when>
					<c:otherwise>
						<td>${booking.state }</td>
					</c:otherwise>
				</c:choose>
				<td><button type="button" class="btn btn-danger btn-sm delete-btn" data-booking-id="${booking.id }" >삭제</button></td>
			</tr>
		
		</c:forEach>
		
		</tbody>
	
	
	
	</table>
	
	<footer>
		<div>
			제주도 제주시 애월읍 <br>
			사업자등록번호 <br>
			Copyright 2023
		</div>
	
	
	</footer>
	
	<script>
		$(document).ready(function(){
			$(".delete-btn").on("click", function(){
				
				// 삭제 버튼에 해당하는 행의 id를 얻어온다.
				let bookingId = $(this).data("booking-id");
				
				$.ajax({
					type:"get"
					, url:"/ajax/booking/delete"
					, data:{"id":bookingId}
					, success:function(data){
						if(data.result == "success"){
							location.reload();
						} else {
							alert("삭제 실패")
						}
						
						
					}
					, error:function(){
						alert("삭제 에러");
					}
				
					
					
				});
				
			});
			
			
		});
		
		
	
	
	</script>
	
	

</body>
</html>