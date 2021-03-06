<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="mysql.data.GuestDao"%>
<%@page import="mysql.data.GuestDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   //JSON배열 타입으로 나오도록 코딩
   //날짜는 년월일 시분까지만 나오게 SimpleDateFormat
   
   //목록 가져오기
   GuestDao dao=new GuestDao();
   List<GuestDto> list = dao.getAllGuest();
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
   
   JSONArray arr=new JSONArray();
   for(GuestDto dto:list)
   {
      JSONObject ob = new JSONObject();
      ob.put("num",dto.getNum());
      ob.put("writer",dto.getWriter());
      ob.put("avata",dto.getAvata());
      ob.put("content",dto.getContent());
      ob.put("writeday",sdf.format(dto.getWriteday()));
      
      //숫자는 sdf.format 으로 엮어줘야 json 형식으로 인식할 수 있음!
      
      //arr에 추가
      arr.add(ob);
   }
%>
<%=arr.toString()%>