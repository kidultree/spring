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

	div.login{
	position: absolute;
	left: 1050px;
	top: 80px;
	font-size: 1.3em;
	}
	
</style>

</head>
<c:set var="root" value="<%=request.getContextPath()%>"/>
<body>
	<a href="/">
	<img src="${root}/image/title.png" width="1000">
	</a>
	<div class="login">
      <c:if test="${sessionScope.loginok==null}">
         <button type="button" class="btn btn-success" style="width:100px;" 
         onclick="location.href='${root}/login/form'">로그인</button>
      </c:if>
         
      <c:if test="${sessionScope.loginok!=null}">
         <b>${sessionScope.loginname}(${sessionScope.loginid}) 님</b>
         &nbsp;&nbsp;
         <button type="button" class="btn btn-info"
         style="width: 100px;" 
         onclick="logout()">Logout</button>
      </c:if>
      </div>
      <script type="text/javascript">
      	function logout()
      	{
      		$.ajax({
      			type:"get",
      			dataType:"text",
      			url:"${root}/login/logout",
      			success: function(){
      				location.reload();
      			}
      		});
      	}
      </script>
</body>
</html>