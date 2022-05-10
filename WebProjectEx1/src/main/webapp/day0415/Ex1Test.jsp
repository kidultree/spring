<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
/*css 영역*/
</style>

<script type="text/javascript">
	//js, jquery 영역
	$(function() {

	});
</script>
</head>
<body>
	<%=msg%><br>
	<%!//선언문 : 서블릿으로 변환시 멤버변수로 등록
	String msg = "Happy day!!";%>

	<%
	//scriptlet, 자바영역.. 각종 자바코드 똑같이 줄 수 있음
	String msg2 = "안녕하세요";
	%>

	<!-- 출력은 표현식으로 출력 : 페이지 소스보기에서 보임-->
	<%-- jsp 주석 : 소스보기에서 안보임 --%>
	<%=msg%><br>
	<%=msg2%><br>

	<%
	String[] str = { "red", "orange", "blue", "pink", "cyan", "magenta" };
	%>
	<table class="table table-bordered" style="width: 200px;">
		<%
		for (String s : str) {
		%>
		<tr>
			<th><%=s%></th>
			<td bgcolor="<%=s%>">color</td>
		</tr>
		<%
		}
		%>
	
</body>
</html>


