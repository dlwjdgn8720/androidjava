<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo" class="bean.BbsVO"></jsp:useBean>
    <jsp:setProperty property="*" name="vo"/>
    
    <%
    BbsDAO dao = new BbsDAO();
    boolean result = dao.create(vo);
   
    String check = "게시판 작성 실패";
    if(result){
    	check =  "게시판 작성 완료";
    }
    %>
	
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
	<h3>게시판 작성 결과는 <%=check %>입니다.</h3>
	
	<a href="bbs.html">게시판 페이지로...</a>

</body>
</html>