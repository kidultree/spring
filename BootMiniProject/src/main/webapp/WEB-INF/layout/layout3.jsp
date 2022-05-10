<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Gowun+Dodum&family=Jua&family=Libre+Bodoni:ital@1&family=Lobster&family=Nanum+Pen+Script&display=swap" rel="stylesheet">
<style type="text/css">
body {
	font-size: 2rem;
	font-family: 'Jua';
}

div.layout div {
	border: 1px solid black;
}

	body{
	font-size: 2rem;
	font-family: 'Jua';
	}
	
	div.layout div{
		border : 0px solid black;
	}
	
	a:link{
		text-decoration : none;
		color: black;
	}
	
	a:hover{
		text-decoration: none;
	}
	
	h3.title{
		position: absolute;
		top: 180px;
		left: 300px;
		font-family: 'Nanum Pen Script';
	}
	
	div.layout div.main
	{
	position: absolute;
	left: 400px;
	top: 270px;
	width: 1000px;
	height: 600px;
	
	}

</style>

</head>
<body>
	<div class="layout">
		<div class="title">
			<tiles:insertAttribute name="title2"/>
		</div>
	
		<div class="main">
			<tiles:insertAttribute name="main"/>
		</div>
	</div>
</body>
</html>