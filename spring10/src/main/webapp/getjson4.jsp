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
		url: "json2.do",
		dataType:"json",
		success:function(result){
			console.log(result)
			for(i=0; i < result.length; i++){
			id = result[i].no
			pw = result[i].title
			name = result[i].content
			tel = result[i].writer
			$('#d1').append(id +" "+pw+" "+name+" "+tel+"<br>")
			}
		}
			
	})	
})


</script>

</head>
<body>
<h3>json으로 받아온 값</h3>
<hr color = "red">
<div id="d1">

</div>

</body>
</html>