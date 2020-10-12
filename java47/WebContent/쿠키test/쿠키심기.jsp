<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//쿠키 객체 만들기 key , value 
	//String만 저장!
	Cookie c1 = new Cookie("subject","스프링");
	Cookie c2 = new Cookie("location","709호");
	Cookie c3 = new Cookie("numOfpeople","100");
	response.addCookie(c1);
	response.addCookie(c2);
	response.addCookie(c3);
%>
<a href="쿠키가저오기.jsp">쿠키가저오기.jsp</a>
</body>
</html>