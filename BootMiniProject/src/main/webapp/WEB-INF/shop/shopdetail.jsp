<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Gowun+Dodum&family=Jua&family=Lobster&family=Nanum+Pen+Script&display=swap"
	rel="stylesheet">
<style type="text/css">
	body {
	font-size: 1.5rem;
	font-family: 'Gowun Dodum';
	}
	
	div.box {
	width: 30px;
	height: 30px;
	border-radius: 100px;
	border: 1px solid black;
	float: right;
	}
</style>

</head>
<body>
	<div style="width: 600px;">
		<b style="font-size: 30px;">${dto.sangpum}</b>
		<span class="day" style="float: right;">입고일 : ${dto.ipgoday}</span>
		<br><br>
		<b style="font-size: 20px">단가 :
			<fmt:formatNumber value="${dto.price}" type="currency"/>
		</b>
		<b style="float: right; font-size: 14px;">${dto.color}</b>
		<div class="box" style="background-color: ${dto.color}"></div>
		<hr style="clear: both; height: 3px; background-color: gray;">
		${dto.content}
		<br><br>
		<button type="button" class="btn btn-default"
		onclick="location.href='list?currentPage=${currentPage}'">상품목록</button>
		<button type="button" class="btn btn-default" id="delbtn" 
		onclick="location.href='delete?num=${dto.num}&currentPage=${currentPage}'">상품삭제</button>
		</div>

<!-- <script type="text/javascript">
           		 $("#delbtn").click(function(){
            var choice = confirm("삭제를 원하시면 [확인]을 눌러주세요");
            var del = "delete?num=${dto.num}&currentPage=${currentPage}"
            if(choice){
            location.assign(del);
            alert("삭제되었습니다.");
            };
            });
	</script> -->
	
	<script type="text/javascript">
	$(document).on("click","#delbtn",function(){
		//idx 얻기
		var num=$(this).attr("num");
		//confim - true 일 경우 ajax 함수를 통해서
		//댓글 삭제 후 목록 다시 출력
		var det = confirm("삭제하려면 [확인]을 눌러주세요");
		if(det){
			$.ajax({
				type:"get",
				dataType: "text",
				data:{"num":num},
				url:"../shop/delete",
				success:function(){
					list();	
				}
			});
		}
	});
	</script>
</body>
</html>