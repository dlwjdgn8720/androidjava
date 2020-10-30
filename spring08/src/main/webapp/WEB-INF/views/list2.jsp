<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품검색정보입니다.</h3>
	<hr color="red">
<c:forEach var="vo" items="${list}">
	상품아이디: ${vo.no}<br> 
	상품이름:  ${vo.name}<br>
	상품내용:  ${vo.content}<br>
	상품가격:  ${vo.price}<br>
	<hr color="red">
</c:forEach>


</body>
</html>