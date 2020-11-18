<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<tr style="height: 50px">
	<td style="width: 50px; background-color: lime; text-align: center">${status.index+1}</td>
	<td style="width: 300px; background-color: orange; text-align: center">${replyVO.content}</td>
	<td style="width: 100px; background-color: yellow; text-align: center">${replyVO.writer}</td>
	<td style="width: 100px;">
	<a href="delete3.do?no=${replyVO.no}&original=${replyVO.original}">
    <button style="background: yellow;">삭제</button>
	</a>
	</td>
</tr>