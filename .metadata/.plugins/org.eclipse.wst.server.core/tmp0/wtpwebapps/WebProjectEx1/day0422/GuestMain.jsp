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
div.header {
	width: 80%;
	height: 110px;
	line-height: 100px;
	text-align: center;
	font-size: 35px;
	font-family: 'Lobster';
	font-weight: bold;
	border: 10px solid gold;
	margin-bottom: 30px;
}

div.all {
	width: 1100px;
}

div.inform {
	font-size: 15px;
	font-family: 'Jua';
	float: left;
	width: 480px;
	height: auto;
	border: 5px solid gray;
	padding: 20px 20px;
}

div.list {
	font-size: 15px;
	font-family: 'Jua';
	float: right;
	width: 600px;
	height: auto;
	border: 5px solid gray;
	padding: 20px 20px;
}

img.imgphoto {
	width: 55px;
	height: 55px;
	margin-right: 3px;
	cursor: pointer;
}

.select {
	border: 2px solid black;
	box-shadow: 3px 3px gray;
}

span.mod, span.del{
	margin-left: 10px;
	cursor: pointer;
}

span.day{
	float: right;
	color: #999;
	font-size : 13px;
}

img.avata{
	width: 80px;}
</style>
<script type="text/javascript">
	$(function() {
		list(); //처음 시작 시 목록 출력

		//저장 이벤트
		$(".btnsave").click(function() {
			//폼 전체 데이터를 읽어서 insert.jsp 로 보낸다
			//성공 후 list() 다시 호출 후, 입력값 초기화

			var fdata = $("#frm").serialize();

			$.ajax({
				type : "post",
				dataType : "html",
				url : "insert.jsp",
				data : fdata,
				success : function() {
					//목록 다시 출력
					list();
					//입력값 지우기 //text, number만..
					$("#writer").val(""); //초기값 줌
					$("#pass").val("");
					$("#content").val("");

					$("#avata").val("1");
					$("img.imgphoto").removeClass("select");
					$("img.imgphoto:first").addClass("select");
				}
			});
		});
		
		//삭제 이벤트 
		$(document).on("click","span.del",function(){
			var num = $(this).attr("num");
			//비번은 입력
			var pass = prompt("이 글에 대한 비밀번호를 입력해주세요");
			console.log(num+","+pass);
			//취소 클릭하거나 비번을 입력 안했을 경우 함수 종료
			if(pass==null || pass.length==0){
				return;
			}
			
			$.ajax({
				type:"get",
				dataType: "json",
				data:{"num":num, "pass":pass},
				url:"delete.jsp",
				success : function(data){
					if(data.result == 'true'){
						alert("삭제되었습니다");
						location.reload(); //새로고침
					}else{
						alert("비번이 맞지 않습니다");
					}
				}
			});
		});
		
		//수정 이벤트
		$(document).on("click","span.mod",function(){
			var num = $(this).attr("num");
			//비번은 입력
			var pass = prompt("이 글에 대한 비밀번호를 입력해주세요");
			console.log(num+","+pass);
			//취소 클릭하거나 비번을 입력 안했을 경우 함수 종료
			if(pass==null || pass.length==0){
				return;
			}
			
			$.ajax({
				type:"get",
				dataType: "json",
				data:{"num":num, "pass":pass},
				url:"equalpass.jsp",
				success : function(data){
					if(data.result == 'true'){
						//비번이 맞으면 수정폼으로 이동
						location.href='updateform.jsp?num='+num;
					}else{
						alert("비번이 맞지 않습니다");
					}
				}
			});
		});
		
	});//$function close
	
	function list() {
		$.ajax({
			type : "get",
			dataType : "json",
			url : "list.jsp",
			success : function(data) {
				var s = "";

				$.each(data, function(i, elt) {
					s += "<table class='table'>";
					s += "<tr><td>";
					s += "<b>" + elt.writer + "</b>";
					s +="<span class='mod' num="+elt.num+">수정</span>";
					s +="<span class='del' num="+elt.num+">삭제</span>";
					s +="<span class='day'>"+elt.writeday+"</span>";
					s += "</td></tr>";
					
					s += "<tr><td>";
					s += "<img src='../avata/s"+elt.avata+".JPG' class='avata' align=left hspace=20>";
					s += "<pre>"+elt.content+"</pre>";
				
						
					s += "</td></tr>"
					s += "</table><br><br>";
					
				});

				$("div.list").html(s);
			}
		});
	}
</script>

</head>
<body>
	<div class="header">Guest Ajax Test</div>
	<div class="all">
		<div class="inform">
			<form id="frm" class="form-inline">
				<table class="table">
					<tr>
						<td width="350">작성자 : <input type="text" id="writer"
							name="writer" class="form-control" style="width: 100px;">

							비밀번호 : <input type="password" id="pass" name="pass"
							class="form-control" style="width: 100px;">
						</td>
						<td rowspan="3" style="cursor: pointer; background-color: orange;"
							align="center" valign="middle" class="btnsave">저장</td>
					</tr>
					<tr>
						<td><textarea id="content" name="content"
								style="width: 100%; height: 100px;"></textarea></td>
					</tr>
					<tr>
						<td><input type="hidden" id="avata" name="avata" value="1"><br>
							<%
							for (int i = 1; i <= 10; i++) {
							%> <img src="../avata/s<%=i%>.JPG" class="imgphoto" idx="<%=i%>">
							<%
							if (i == 5) {
							%> <br> <%
 }
 }
 %> <script type="text/javascript">
		//일단 첫번째 이미지에 .select 적용
		$("img.imgphoto").eq(0).addClass("select");

		//아바타 클릭시 idx값을 얻어서 #avata에 출력
		//클릭한 이미지에만 .select 가 적용되도록 하기 
		$("img.imgphoto").click(function() {
			$(this).siblings().removeClass("select");
			$(this).addClass("select");
			$("#avata").val($(this).attr("idx"));
		});
	</script></td>
					</tr>
				</table>
			</form>
		</div>

		<div class="list"></div>
	</div>
</body>
</html>

</head>
<body>

</body>
</html>