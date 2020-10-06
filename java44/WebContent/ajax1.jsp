<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">


   //콜백함수(call-back함수)
   //특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
   //함수가 정의되어 있는 곳으로 돌아가 자동 호출되는 함수
   //body의 하위 엘리먼트를 먼저 브라우저가 dom-tree를 구성한 후
   //함수를 정의하게 되어있음.
   //브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
   //body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
   
   $(function(){
	   $('#b1').click(function(){ //b1 이벤트 클릭
		   $.ajax({ //에이작스 이용
			   url:"data/member.xml", //xml파일 가져오기
			   success:function(doc){ // 성공함수
				   console.log('XML요청 성공') //콘솔 값 확인
				   console.log('XML결과:' + doc) // 콘솔 값 확인
				   list = $(doc).find('record') //xml record갯수 가져오기
				   console.log('레코드의 개수:' +list.length) // 콘솔 갯수 확인
				   if(list.length > 0){ // 갯수가 양수일때
					   
					   $(list).each(function(index,item){ // list 100개의 값을 뿌려줌
						   id = $(this).find('id').text() // id값
						   first_name = $(this).find('first_name').text() // 퍼스트 네임 값 가져오기
						   last_name = $(this).find('last_name').text() // 라스트 네임 값 가져오기
						   email = $(this).find('email').text() // 이메일 값 가져오기
						   gender = $(this).find('gender').text() // 성별 값 가져오기
						   ip_address = $(this).find('ip_address').text() //ip번호 값 가져오기
						   $('#d1').append('id:'+id+'<br> firstname:'+first_name+'<br>'+last_name+'<br>'+email+'<br>'+gender+'<br>'+ip_address+'<br>')
						   // 브라우저창에 값 띄우기
						   console.log(index+' 아이디: '+id)
						   console.log(index+' 첫번째이름: '+fname)
						   console.log('마지막이름: '+lname)
						   console.log('이메일: '+email)
						   console.log('성별: '+gender)
						   console.log('아이피: '+ip_address)
						    
						   $.ajax({ //db에 넣기 위해 jsp파일 호출
							   url:"db1.jsp", //jsp파일 경로
							   data:{ // xml파일 data 가져오기
								   id : id,
								   first_name : fname,
								   last_name: lname,
								   email : email,
								   gender : gender,
								   ip_address : ip_address
							   },
							   success:function(result){ // db1.jsp에 결과를 result 파라미터로 불러오고 성공하면 성공했다는 알림창 띄워주기
								   if(index == 99){
								   alert('db1.jsp의결과:' +result)
								   }
							   }
						   })
						   
					   })
					  
				   }
			   }
		   })
	   })
	   
	   
	   $('#b2').click(function(){
		   $.ajax({
			   url:"data/member.json",
			   success:function(doc){
				   alert("JSON요청 성공")
				   $(doc).each(function(index,item){
					   id = item.id
					   first_name = item.first_name
					   last_name= item.last_name
					   email = item.email
					   gender = item.gender
					   ip_address = item.ip_address
					   
					   $('#d1').append('id:'+id+'<br>'+ 'firstname:'+first_name+'<br>'+'lastname:'+last_name+'<br>'+'email:'+email+'<br>'+gender+'<br>'+ip_address+'<br>')
				   })//each
			   }//success
		   })
	   })
	   $('#b3').click(function(){
		   
	   })
   })
</script>
</head>
<body>
<button id="b1">XML읽어오기</button>
<button id="b2">JSON읽어오기</button>
<button id="b3">DB에 넣기</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>