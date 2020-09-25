<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. id값 받아와야함. -->
    <!-- 2. dao와 연동하여 결과 받아와야 함. -->
    <!-- 3. html로 만들어서 전송해야함. -->
    <%
    
    String no = request.getParameter("no");
    int no2 = Integer.parseInt(no);
    
    BbsDAO dao = new BbsDAO();
    BbsVO vo = dao.one(no2);
   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=vo.getWritter() %>님의 회원정보 수정 페이지입니다.</h3>
	<hr color = "red">
	<form action="update4.jsp">
	
	<table>
	<tr align="center">
	<td width="100" bgcolor="yellow">게시물번호</td>
	<td width="200" bgcolor ="pink"><%=vo.getNo() %>
	<input type="hidden" name = "no" value="<%=vo.getNo() %>">
	
	
	<tr align="center">
	<td width="100" bgcolor="yellow">제목</td>
	<td width="200" bgcolor ="pink">
	<input type="text" name = "title" value="<%=vo.getTitle() %>">
	</td>
	</tr>
	
	<tr align="center">
	<td width="100" bgcolor="yellow">내용</td>
	<td width="200" bgcolor ="pink">
	<input type="text" name = "content" value="<%=vo.getContent() %>">
	</td>
	</tr>
	
	<tr align="center">
	<td width="100" bgcolor="yellow">작성자</td>
	<td width="200" bgcolor ="pink"><%=vo.getWritter() %>
	<input type="hidden" name = "writter" value="<%=vo.getWritter() %>">
	</td>
	</tr>
	
	<tr>
	<td colspan="2">
	<button type="submit">수정 처리 요청</button>
	</tr>
	
	</table>
	</form>
	
	<hr color="green">
	<a href="index.html"><button style=background:green>처음페이지로</button></a>
	<a href="bbs2.html?bwriter=<%=vo.getWritter() %>"><button style=background:gold>검색</button></a>
	<a href="delete.jsp?bwriter=<%=vo.getWritter() %>"><button style=background:green>삭제</button></a>
	

</body>
</html>