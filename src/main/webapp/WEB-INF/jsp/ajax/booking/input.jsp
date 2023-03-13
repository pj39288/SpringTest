<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 하기</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	  <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
	  <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
	
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


	<div class="container">
	<!--  	
	<form method="get" action="/ajax/booking/add">
	-->
	
		<h2 class="text-center">예약 하기</h2>
		
		<label>이름</label>
		<input type="text" class="form-control"  id="nameInput">
		<label>예약날짜</label>
		<input type="text" class="form-control" id="dateInput">
		<label>숙박일수</label>
		<input type="text" class="form-control" id="dayInput">
		<label>숙박인원</label>
		<input type="text" class="form-control" id="headCountInput">
		<label>전화번호</label>
		<input type="text" class="form-control" id="phoneNumberInput">
		
		<button type="button" id="bookingBtn" class="btn btn-warning btn-block mt-3">예약하기</button>
	<!-- 
	</form>	
	 -->
	</div>
	
	<script>
		$(document).ready(function(){
			
			$("#dateInput").datepicker({
				dateFormat:"yy년 mm월 dd일"
			});
			
			
		
			$("#bookingBtn").on("click", function(){
				
				let name = $("#nameInput").val();
				let date = $("#dateInput").val();
				let day = $("#dayInput").val();
				let headCount = $("#headCountInput").val();
				let phoneNumber = $("#phoneNumberInput").val();
				
				if(name == ""){
					alert("이름을 입력하세요");
					return;
				}
				if(date == ""){
					alert("날짜를 입력하세요");
					return;
				}
				if(day == ""){
					alert("일수를 입력하세요");
					return;
				}
				
				//day가 숫자가 입력된 경우
				//숫자가 아닌 문자가 포함된 경우
				if(isNaN(day)) {
					alert("숙박일수는 숫자만 입력가능합니다.");
					return;
				}
				
				if(headCount == ""){
					alert("인원을 입력하세요");
					return;
				}
				
				if(isNaN(headCount)) {
					alert("인원은 숫자만 입력가능합니다.");
					return;
				}
				if(phoneNumber == ""){
					alert("전화번호를 입력하세요");
					return;
				}
				
				
				
				$.ajax({
					type:"get"
					, url:"/ajax/booking/add"
					, data:{"name":name, "date":date, "day":day, "headCount":headCount, "phoneNumber":phoneNumber }
					, success:function(data){
						
						if(data.result == "success"){
							location.href = "/ajax/booking/list";
						} else {
							alert("추가 실패");
						}		
						
					}
					, error:function(){
						alert("추가 에러");
					}
					
		
				});
				
	
			});
			

		
		});
	
	
	
	</script>
	
	<footer>
		<div>
			<br>
			제주도 제주시 애월읍 <br>
			사업자등록번호 <br>
			Copyright 2023
		</div>
	
	
	</footer>


</body>
</html>