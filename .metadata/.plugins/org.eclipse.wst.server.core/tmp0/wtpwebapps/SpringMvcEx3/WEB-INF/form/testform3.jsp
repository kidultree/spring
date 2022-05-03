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
	<form action="read3" method="post" class="form-inline">
		<table class="table table-bordered" style="width: 400px">
			<caption>
				<b>폼 연습 #3</b>
			</caption>
			<tr>
				<th width="100" bgcolor="#ddd">상품명</th>
				<td><input type="text" name="sang" class="form-control"
					required="required" autofocus="autofocus"></td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">수 량</th>
				<td>
						<input type="text" name="su" class="form-control">
				</td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">가 격</th>
				<td><input type="text" name="price" class="form-control"
					required="required">
				</td>
			</tr>
			<tr>
				<th width="100" bgcolor="#ddd">사 진</th>
				<td>
					<select name="photo" class="form-control">
						<option value ="res/c1.png">인형 1</option>
						<option value ="res/c2.png">인형 2</option>
						<option value ="avata/s1.JPG">인형 3</option>
						<option value ="avata/s2.JPG">인형 4</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">서버에 전송</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>