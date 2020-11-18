<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject jsonmain = new JSONObject();
	JSONArray array = new JSONArray();
	
	JSONObject jobject1 = new JSONObject();
	jobject1.put("id", "root");
	jobject1.put("pw", "1234");
	jobject1.put("name", "lee");
	jobject1.put("tel", "010");
	array.add(0,jobject1);
	
	JSONObject jobject2 = new JSONObject();
	jobject2.put("id", "admin");
	jobject2.put("pw", "5678");
	jobject2.put("name", "park");
	jobject2.put("tel", "011");
	array.add(1,jobject2);
	
	JSONObject jobject3 = new JSONObject();
	jobject3.put("id", "ljh8720");
	jobject3.put("pw", "91011");
	jobject3.put("name", "kim");
	jobject3.put("tel", "012");
	array.add(2,jobject3);
	
	jsonmain.put("list",array);
	
	out.println(jsonmain.toJSONString());
	out.println(array.toJSONString());
	
%>