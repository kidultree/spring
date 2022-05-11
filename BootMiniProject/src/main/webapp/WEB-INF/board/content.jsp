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
	div.content {
	font-family: 'Jua';
	}
</style>

</head>
<body>
	<div class = "content" style="width: 800px;">
		<h2><b>${dto.subject}</b></h2>
		<hr>
		<span class="glyphicon glyphicon-user"></span>&nbsp;<b>${dto.name}</b>
		<span style="color: gray;">
			<fmt:formatDate value="${dto.writeday}" pattern="yyyy-MM-dd HH:mm"/>
		</span>
		<br><br>
		<pre style="background-color: white; border: none; font-family:'Jua'; font-size: 1.5em;"><b>${dto.content}</b></pre>
		<br><br>
		<c:if test="${dto.photos!='no'}">
			<c:forTokens var="photo" items="${dto.photos}" delims="," varStatus="n">
				<a href="../save/${photo}" target="_new" style="cursor: pointer;">
				<img src="../save/${photo}"
				style="max-width: 300px; border: 1px solid black;">
				<c:if test="${n.count%2==0}"><br><br></c:if>
			</c:forTokens>
		</c:if>
		<br><br>
		<div class="buttons">
			<button type="button" class="btn btn-default"
			onclick="location.href='list?currentPage=${currentPage}'">목록</button>
			
			<button type="button" class="btn btn-default" 
			onclick="location.href='form?num=${dto.num}&reg=${dto.reg}&restep=${dto.restep}&relevel=${dto.relevel}&currentPage=${currentPage}'">답글</button>
			
			<c:if test="${sessionScope.loginok!=null == dto.name == loginname}">
			<button type="button" class="btn btn-success">수정
			</button>
			<button type="button" class="btn btn-danger">삭제
			</button>
			</c:if>
      </div>
	</div>
</body>
</html>