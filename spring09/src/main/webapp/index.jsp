<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%> <!--5번째  -->
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- 3번쨰 -->
 <%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
 <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3 style=color:red>게시판검색입니다.</h3>
<a href="one.do?no=1">1번 게시물 검색</a><br>
<a href="one.do?no=2">2번 게시물 검색</a><br>
<a href="one.do?no=3">3번 게시물 검색</a><br>

<!-- 태그 사이에 내용(contents)에 비어있음. 빈태그 -->
<sql:setDataSource
	url="jdbc:mysql://localhost:3366/shop"
	driver="com.mysql.jdbc.Driver"
	user="root"
	password= "1234"
	scope="application"
	var = "db"
/>

<sql:query var="list" dataSource="${db}">
   select * from reply
</sql:query>
<c:forEach items="${list.rows}" var="vo">
${vo}<br>
</c:forEach>




<p>${id}</p>
<form method="post">
번호:<input type="text" name="no"><br>
제목:<input type="text" name="title"><br>
내용:<input type="text" name="content"><br>
글쓴이:<input type="text" name="writer"><br>
<button type="submit">작성완료</button>
</form>

<sql:update dataSource="${db}" var="insertTable">
   insert into bbs(title,content,writer) VALUES(?,?,?);
  
   <sql:param value="${param.title}"/>
   <sql:param value="${param.content}"/>
   <sql:param value="${param.writer}"/>
</sql:update>

<!-- if  -->
   <c:set var="id"></c:set>
   <c:choose>
   <c:when test="${id eq 'test'}">
      <br><button>안녕 난 세션값이 있으면 생기는 버튼이야!!</button>
   </c:when>
   
   <c:otherwise>
      <br><button>안녕 나는 세션이 없을때 나오는 버튼이야</button>
   </c:otherwise>
   </c:choose>



</body>
</html>