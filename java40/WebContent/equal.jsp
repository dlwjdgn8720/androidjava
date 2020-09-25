<%@page import="beans.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% 
    String id = request.getParameter("id");
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    String check ="가입 가능한 아이디 입니다.";
    if(result == 1){
    	check ="이미 아이디가 있습니다.";
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h3>입력하신아이디는 <%=check %></h3>
	<a href="js07.html">회원가입페이지로.....</a>
	

</body>
</html>