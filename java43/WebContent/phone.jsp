<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //파라메터값 받아주고
    int b = 9999;
    int a = 1000;
   
    String phone = request.getParameter("phone");
    String phone2 = phone.substring(0,3);
    
    int r = (int)(Math.random()*((b-a)+1))+a;
    
    
    
    if(phone2.equals("010")){
    	phone2 = "11";
    }
    else if(phone2.equals("011")){
    	phone2 = "22";
    }
    else {
    	phone2 = "33";
    }
    //ReplyDAO로 댓글을 저장처리
    //성공하면, 저장된 댓글 데이터를 전송
    String result =phone2+r+"<br>";
    %><%=result %>