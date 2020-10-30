<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원등록정보입니다.</h3>
	<hr color="red">
	상품아이디: ${productVO.no}<br>
	상품이름:  ${productVO.name}<br>
	상품설명:  ${productVO.content}<br>
	상품가격:  ${productVO.price}<br>

	<a href="member.jsp">첫페이지이동</a>
<!-- <a href="update.do">수정페이지이동</a> -->

</body>
</html>