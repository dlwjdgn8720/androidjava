<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript">
$(function(){
	$('#btn').click(function(){
	$.ajax({
		url: "json5.do",
		data: {
			no : $('#no').val()
		},
		dataType:"json",
		success:function(result){
			console.log(result)
			
			no = result.no
			title = result.title
			content = result.content
			writer = result.writer
			
			$('#d1').append(no +" "+title+" "+content+" "+writer+"<br>")
		}
			})
			
		
		})
			
	})




</script>

</head>
<body>
<h3>게시물 하나 검색화면입니다.</h3>
<hr color="red">
<input type="text" id="no"><input type="button" id="btn" value="검색">
<div id="d1">

</div>

</body>
</html>