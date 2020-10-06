<%@page import="DAO.MemberDAO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="vo2" class="DAO.MemberVO2"></jsp:useBean> <!-- 가방에 넣기위해 bean객체로 vo클래스 가져오기  -->
    <jsp:setProperty property="*" name="vo2"/><!-- 가방에 있는 프로퍼티 값들 세팅 -->
    
    <%
   MemberDAO2 dao2 = new MemberDAO2(); //DAO클래스 불러오기
   boolean result = dao2.create(vo2); // 프로퍼티값들 db에 넣어주기
%><%= result %> <!-- db에 넣어준 결과를 확인하기 위해 ajax1.jsp로 호출 -->