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
	font-family: 'Jua';
	}
	
	#myimg{
		position: absolute;
		left: 700px;
		top: 100px;
		max-width: 200px;
	}
</style>
<script type="text/javascript">
	$(function(){
		$("#upload").change(function(){
			//정규표현식 (확장자 주기)
			var reg = /(.*?)\/(jpg|jpeg|png|bmp)$/
			var f=$(this)[0].files[0];
			if(!f.type.match(reg)){
				alert("확장자가 이미지파일이 아닙니다");
				return;
			}
			
			var reader = new FileReader();
			reader.onload = function(e){
				$("#myimg").attr("src",e.target.result);
			}
			reader.readAsDataURL($(this)[0].files[0]);
		});
	});
</script>

</head>
<body>
<div style="margin: 50px 200px;">
	<form action="./insert" method="post" enctype="multipart/form-data">
		<table class="table table-bordered" style="width: 500px;">
			<caption><b>새글쓰기</b></caption>
			<tr>
				<th width="120" bgcolor="lightyellow">작성자</th>
					<td>
						<input type="text" name="writer" required="required"
						class="form-control">
						</td>
					</tr>
					<tr>
				<th width="120" bgcolor="lightyellow">제목</th>
					<td>
						<input type="text" name="subject" required="required"
						class="form-control">
						</td>
					</tr>
					<tr>
				<th width="120" bgcolor="lightyellow">사진</th>
					<td>
						<input type="file" name="upload" id="upload"
						class="form-control">
						</td>
					</tr>
					<tr>
						<td colspan="2">
							<textarea style = "width: 480px; height: 150px;" name = "content"
							required="required"></textarea>
							</td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<button type="submit" class="btn btn-info"
							style="width: 100px;">저장</button>
						
							<button type="reset" class="btn btn-info"
							style="width: 100px;">지우기</button>
							
							<button type="button" class="btn btn-info"
							style="width: 100px;"
							onclick="location.href='list'">목록</button>
						</td>
					</tr>
		</table>
	</form>
	
	<img src="" id="myimg" style="max-width: 200px;">
	</div>
</body>
</html>