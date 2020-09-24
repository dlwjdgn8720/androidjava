<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    MemberDAO dao = new MemberDAO();
    dao.create(id, pw, name, tel);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입 정보</h3>
	<hr color="red">
	아이디: <%= id %><br> 
	패스워드: <%= pw %><br> 
	이름: <%= name %><br> 
	전화번호: <%= tel %><br> 
	
	<hr color="blue">
	<a href="login.html">회원가입 완료</a>

</body>
</html>