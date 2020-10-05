<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //파라메터값 받아주고
   
    String money = request.getParameter("money");
    String pay = request.getParameter("pay");
    if(pay.equals("1")){
    	pay ="계좌이체";
    }
    else if(pay.equals("2")){
    	pay ="신용카드";
    }
    else if(pay.equals("3")){
    	pay ="휴대폰결제";
    }
    //ReplyDAO로 댓글을 저장처리
    //성공하면, 저장된 댓글 데이터를 전송
    String result =money +" "+pay+"<br>";
    %><%=result %>