<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#reply').click(function(){
		contentValue = $('#content').val()
		$.ajax({
			url:"create.do",
			data:{
				content: contentValue,
				original:'${one.no}', //one.get~~~~
				writer:  '${id}'
			},
			success:function(result){
				//alert(result)
				
				$('#t2').append(result);
				location.reload()
			}
		})
	})
})

</script>
</head>
<body>
<h3>게시물 하나 검색화면입니다.</h3><a href="insert.jsp">dd</a>
<hr color="red">
<table>
	<tr>
	 	<td style=color:blue;width:150px;background:yellow;>게시물번호</td>
	 	<td style=color:blue;width:150px;background:pink;>${one.no}</td>
	</tr>
	
	<tr>
	 	<td style=color:blue;width:150px;background:yellow;>게시물제목</td>
	 	<td style=color:blue;width:150px;background:pink;>${one.title}</td>
	</tr>
	
	<tr>
	 	<td style=color:blue;width:150px;background:yellow;>게시물내용</td>
	 	<td style=color:blue;width:150px;height:200px;background:pink;>${one.content}</td>
	</tr>
	
	<tr>
	 	<td style=color:blue;width:150px;background:yellow;>게시물번호</td>
	 	<td style=color:blue;width:150px;background:pink;>${one.writer}</td>
	</tr>
	
</table>
<hr color="green">
댓글: <input id="content"><button id="reply">댓글달기</button>
		<div id="d1" style=padding-top:10px;></div>
		<div id="d2" style="width:450px; height:50px;">
		   <%--  ${status.index+1}:순번찍기
		         ${total - status.index}:역순찍기 --%>
			<table id=t2>
			<c:forEach items="${list}" var="vo" varStatus = "status">
				<tr style="height:50px;" id=table2>
					<td style="width:50px; background-color: lime; text-align:center">${status.index+1}</td>
					<td style="width:300px;background-color: orange; text-align:center">${vo.content}</td>
					<td style="width:100px;background-color: yellow; text-align:center">${vo.writer}</td>
					<td style="width:100px;">
					<!-- one.do?no=1 -->
						<a href="delete3.do?no=${vo.no}&original=${vo.original}">
							<button style="background:yellow;">삭제</button>
						</a>
					</td>
				</tr> 
				</c:forEach>
			</table>
		</div>
			




</body>
</html>