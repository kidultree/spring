<%@page import="mysql.data.GuestDao"%>
<%@page import="mysql.data.GuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

//엔코딩
	request.setCharacterEncoding("UTF-8");
//데이터 읽기
	String writer = request.getParameter("writer");
	String avata = request.getParameter("avata");
	String pass = request.getParameter("pass");
	String content = request.getParameter("content");

//dto에 넣기
	GuestDto dto = new GuestDto(writer, pass, avata, content);

//dao 선언
	GuestDao dao = new GuestDao();

//insert 메서드 호출
	dao.guestInsert(dto);

%>