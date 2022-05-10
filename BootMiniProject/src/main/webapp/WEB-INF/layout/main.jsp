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

.mainimage {
	width: 150px;
	height: 150px;
	cursor: pointer;
}

.titlenext {
	width: 40px;
}
</style>

</head>
<body>

	<h2 style="background-color: #d9d9d9;">
		<img src="image/ani02.gif" class="titlenext">&nbsp;New Arrival ♥
	</h2>
	<h2 style="font-family: 'Nanum Pen Script';">귀여운 신상 확인하기!</h2>
	<c:forEach var="a" begin="33" end="60">
		<img src="image/K-0${a}.png" class="mainimage">
		<c:if test="${a%4==0}">
			<br>
		</c:if>
	</c:forEach>

</body>
</html>