<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    //파라메터값 받아주고
    String result2 ="불일치";
    
    String pw = request.getParameter("pw");
    String pwcheck = request.getParameter("pwcheck");
    if(pw.equals(pwcheck)){
    	result2 ="일치";
    }
    
   
    //ReplyDAO로 댓글을 저장처리
    //성공하면, 저장된 댓글 데이터를 전송
    
    
   
    %><%=result2 %>