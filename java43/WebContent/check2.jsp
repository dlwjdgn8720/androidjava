<%@page import="DAO.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    String id = request.getParameter("id");
    String idcheck="아이디 존재";
    MemberDAO dao = new MemberDAO();
    int result = dao.read(id);
    if(result == 0){
    	idcheck ="아이디 존재 x";
    }
    %><%= result %>