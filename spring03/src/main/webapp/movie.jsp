<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<script type="text/javascript" src="resources/js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
    $(function(){//dom tree로딩 후
		//alert("환영합니다.");
    	$('#b1').click(function(){
    		replyValue = $('#reply').val();
    		$.ajax({
    			url:"reply.do",
    			data:{
    				reply:replyValue
    			},
    			success:function(result){
    				//alert(result)
    				$('#d1').append(result);
    			}
    		})
    	})
    	$('#id_check').click(function(){
    		idValue = $('#user_id').val();
    		$.ajax({
    			url:"check.do",
    			data:{
    				id:idValue
    			},
    			success:function(id2){
    				$('#d2').html(id2)
    			}
    		})
    	})
    })
	</script>

</head>
<body>
	<form action="movie.do">
	영화제목<input type="text" name="title">
	영화관람료<input type="text" name="price">
	<input type="submit" value="신청">
	</form>
	
	
	<hr color="red">
	댓글:<input type="text" id="reply">
	<button id="b1">댓글달기</button>
	<hr color="blue">
	<div id="d1">
	</div>
	
	가입할 id입력: <input type="text" id="user_id">
	<input type="submit" id="id_check" value="아이디 중복 체크">
	<div id="d2">
	</div>
	

</body>
</html>