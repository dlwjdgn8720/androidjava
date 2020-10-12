<%@page import="java47.BasketVO2"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<jsp:useBean id="vo" class="java47.BasketVO2"/>
<jsp:setProperty name="vo" property="*"/>

<%
	String product = request.getParameter("product");
  	String price = request.getParameter("price");
	
  	ArrayList<BasketVO2> list = null;
   	
   	if(product != null && price != null){
    	if (session.getAttribute("basket") != null) {
         	//null이 아니라는 의미는 이미 장바구니가 만들어져있다는 얘기
         	//기존에 있던 세션으로 잡아둔 장바구니 목록을 가지고 와서
         	//거기에다가 새로운 장바구니 물건을 추가한다.
        	list = (ArrayList<BasketVO2>)session.getAttribute("basket");
        	vo.setProduct(product);
           	vo.setPrice(price);
         	list.add(vo);
      } else {
        	//null이라는 의미는 장바구니 목록이 안만들어져있다는 얘기
       		list = new ArrayList<>();
       		vo.setProduct(product);
       	   	vo.setPrice(price);
       		list.add(vo);
      }
      session.setAttribute("basket", list);
   }else{
      list = (ArrayList<BasketVO2>)session.getAttribute("basket");
   }
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("basket") == null){
%>
      <h3>장바구니가 비어있음.</h3>
   <%
   	}else{
   %>
    <h3>장바구니의 개수<%=list.size()%>개 들어있음.</h3>
   	<h3>장바구니 목록</h3>
   	<hr color="blue">
   <%
   	for(BasketVO2 vo2: list){
   %>
      <%= vo2.getProduct() %><br>
      <%= vo2.getPrice() %><br>
   <%      
      }
   }
   %>
   <hr color="green">
   <a href="null.jsp">장바구니 비우기</a>
   <a href="장바구니에넣기.jsp">장바구니 목록보기</a>
</body>
</html>