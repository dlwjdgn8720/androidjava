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
		$.ajax({
			url: "json6.do",
			dataType:"json",
			success:function(result){
				console.log(result)
				$(result).each(function(i,item){
					$('#d1').append("id: "+item.no+" pw: "+item.title+" name: "+item.content+" tel: "+item.writer+"<br>");
				})
			}
		})
	})




</script>

</head>
<body>

<h3>게시물 전체 검색화면입니다.</h3>
<hr color="red">
<div id="d1">

</div>

</body>
</html>