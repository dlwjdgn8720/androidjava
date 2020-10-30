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
<a href="list2.do">전체 회원검색 완료</a>
<hr color="red">
<h1>아이디 검색내용입니다.</h1>
<form action="one2.do">
	아이디:<input type="text" name="id"><br>
	<button type="submit">회원검색완료</button>
</form>
<hr color="red">

	<h1>회원가입 내용입니다.</h1>
	<form action="create2.do">
	아이디:<input type="text" name="id"><br>
	패스워드:<input type="text" name="pw"><br>
	이름:<input type="text" name="name"><br>
	전화번호:<input type="text" name="tel"><br>
	<button type="submit">회원가입완료</button>
	</form>
	<hr color="red">
	<h1>회원수정 내용입니다.</h1>
	<form action="update2.do">
	아이디:<input type="text" name="id"><br>
	전화번호:<input type="text" name="tel"><br>
	<button type="submit">회원정보수정완료</button>
	</form>
	<hr color="red">
	<h1>회원탈퇴 입니다.</h1>
	<form action="delete2.do">
	아이디:<input type="text" name="id"><br>
	<button type="submit">회원탈퇴</button>
	</form>

</body>
</html>