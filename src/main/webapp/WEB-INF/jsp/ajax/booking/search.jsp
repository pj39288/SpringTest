<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 조회 페이지</title>

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
	
	<img src="https://cdn.pixabay.com/photo/2016/04/25/23/30/house-1353389_960_720.jpg" class="h-10">
	
	<div class="d-flex">
		<div>
			<h2>실시간 예약하기</h2>	
		</div>
		
		<div>
			<label>이름</label>
			<input type="text" class="form-control" id="nameInput">
			<label>전화번호</label>
			<input type="text" class="form-control" id="phoneNumberInput">
		
			<button type="button" id="findBtn" class="btn btn-warning btn-block mt-3">조회하기</button>
		
		</div>
		
		<div>
			<h3>예약문의: 010-000-1111</h3>
		
		</div>
	
	
	</div>
	
	
	<script>
		$(document).ready(function() {
			
			$(#"findBtn").on("click", function(){
			
				let name = $(#"nameInput").val();
				let phoneNumber =  $(#"phoneNumberInput").val();
				
				if(name = ""){
					alert("이름을 입력하세요");
				}
				
				if(phoneNumber = ""){
					alert("전화번호를 입력하세요");
				}
				
				
				$.ajax({
					
					type:"get"
					, url: "/ajax/booking/search"
					, data: {"name":name, "phoneNumber":phoneNumber}
					, success:function(data){
						let message="이름 : " + data.name + "\n날짜 : " + data.date
									+ "\n일수 : " + data.day + "\n인원 : " + data.headCount + "\n상태 : " + data.state;
					}
					, error:function(){
						alert("조회 에러");
					}
					
					
				});
				
				
			});
			
			
		});
		
	
	
	</script>
	
	
</body>
</html>