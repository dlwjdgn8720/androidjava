<%@page import="bean.BbsVO"%>
<%@page import="java.util.List"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    BbsDAO dao = new BbsDAO();
    List<BbsVO> list = dao.all();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
   td {
      width: 100px;
      text-align: center;
   }
   .td{
      background: yellow;
   }
</style>
</head>
		<h3 style=color:blue>검색결과의 개수는 <%= list.size() %>개</h3>
		<table border="1">
		<tr>
		   <td class="td">게시물번호</td>
		   <td class="td">제목</td>
		   <td class="td">내용</td>
		   <td class="td">작성자</td>
		</tr>
		<% for(int i = 0; i < list.size(); i++) { 
		   BbsVO vo = list.get(i);
		%>
		<tr>
		   <td><%= vo.getNo()%></td>
		   <td><%= vo.getTitle() %></td>
		   <td><%= vo.getContent() %></td>
		   <td><%= vo.getWritter() %></td>
		</tr>

<% } %>
</table>
</body>
</html>