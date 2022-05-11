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
	
	div.layout div.title{
		position: absolute;
		top: 10px;
		left: 100px;
		font-family: 'Gamja Flower';
	}
	
	div.layout div.menu{
		position: absolute;
		top: 250px;
		left: 230px;	
		font-family: 'Gamja Flower';
	}
	
	div.layout div.info{
	position: absolute;
	left: 30px;
	top: 250px;
	width: 200px;
	height: 200px;
	line-height: 30px;
	border-radius: 20px;
	border: 2px solid gray;
	}
	
	div.layout div.main
	{
	position: absolute;
	left: 300px;
	top: 320px;
	width: 1000px;
	height: 600px;
	
	}
	
</style>

</head>
<body>
	<div class="layout">
		<div class="title">
			<tiles:insertAttribute name="title"/>
		</div>
		<div class="menu">
			<tiles:insertAttribute name="menu"/>
		</div>
		<div class="info">
			<tiles:insertAttribute name="info"/>
		</div>
		<div class="main">
			<tiles:insertAttribute name="main"/>
		</div>
	</div>
</body>
</html>