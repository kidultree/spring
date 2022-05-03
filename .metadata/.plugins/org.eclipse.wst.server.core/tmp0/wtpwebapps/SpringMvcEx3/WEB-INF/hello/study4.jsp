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

</head>
<body>
	<h1>study4 입니다</h1>
		<h3>resources 폴더의 c4.png 이미지 출력</h3>
	<img src="${path}/res/c4.png" width="130">
	
	<h3>avata 폴더의 s3.JPG 이미지 출력</h3>
	<img src="${path}/avata/s3.JPG" width="130">
	
	<h3>image 폴더의 13.jpg 이미지 출력</h3>
	<img src="${path}/image/13.jpg" width="130">
</body>
</html>