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
		url: "json.jsp",
		dataType:"json",
		success:function(result){
			console.log(result)
			total = result.list
			$(total).each(function(i,item){
				$('#d1').append("id: "+item.id+" pw: "+item.pw+" name: "+item.name+" tel: "+item.tel+"<br>");
			})
			/* id = result.id
			pw = result.pw
			name = result.name
			tel = result.tel
			$('#d1').append(id +" "+pw+" "+name+" "+tel) */
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