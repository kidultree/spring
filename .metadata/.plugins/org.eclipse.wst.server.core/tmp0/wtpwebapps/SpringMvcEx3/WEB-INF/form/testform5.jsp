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
	font-size: 2rem;
	font-family: 'Jua';
}
</style>
</head>
<body>
	<form action="result" method="post" class="form-inline">
		<table class="table table-bordered" style="width: 400px">
			<caption>
				<b>폼 연습 #5</b>
			</caption>
			<tr>
				<th width="100" bgcolor="#ddd">이 름</th>
				<td><input type="text" name="name" class="form-control"
					required="required" autofocus="autofocus"></td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">사 진</th>
				<td>
					<select name="photo" class="form-control">
						<option value = "/avata/s10.JPG">사진 1</option>
						<option value = "/avata/s9.JPG">사진 2</option>
						<option value = "/avata/s4.JPG">사진 3</option>
						<option value = "/avata/s6.JPG">사진 4</option>
				</td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">자 바</th>
				<td><input type="text" name="java" class="form-control"
					required="required">
				</td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">스프링</th>
				<td><input type="text" name="spring" class="form-control" 
				required="required">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">결 과</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>