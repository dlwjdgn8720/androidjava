<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr color="red">
<a href="list2.do">전체 상품검색 완료</a>
<hr color="red">
<h1>상품 검색입니다.</h1>
<form action="one2.do">
	상품 아이디:<input type="text" name="no"><br>
	<button type="submit">상품검색완료</button>
</form>
<hr color="red">

	<h1>상품 등록입니다.</h1>
	<form action="insert2.do">
	상품번호:<input type="text" name="no"><br>
	상품이름:<input type="text" name="name"><br>
	상품설명:<input type="text" name="content"><br>
	상품가격:<input type="text" name="price"><br>
	<button type="submit">상품등록완료</button>
	</form>
	<hr color="red">
	<h1>상품수정 입니다.</h1>
	<form action="update2.do">
	상품아이디:<input type="text" name="no"><br>
	상품가격:<input type="text" name="price"><br>
	<button type="submit">상품정보수정완료</button>
	</form>
	<hr color="red">
	<h1>상품삭제 입니다.</h1>
	<form action="delete2.do">
	아이디:<input type="text" name="no"><br>
	<button type="submit">상품삭제</button>
	</form>

</body>
</html>