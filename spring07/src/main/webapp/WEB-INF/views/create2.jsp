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
	회원 id:   ${memberVO.id}<br>
	회원 pw:   ${memberVO.pw}<br>
	회원 name: ${memberVO.name}<br>
	회원 tel:  ${memberVO.tel}<br>

	<a href="member.jsp">첫페이지이동</a>
<!-- <a href="update.do">수정페이지이동</a> -->

</body>
</html>