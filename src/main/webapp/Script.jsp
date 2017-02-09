<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true"  %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<figure>
<figcaption><h1>스크립트 요소</h1></figcaption>

<ol>
<li>스크립트식</li>
<li>표현식</li>
<li>선언부</li>
</ol>

</figure>

	<% 
		// 스크립트식
		for (int i=0; i<5; i++){
			out.println("<span>"+i+"</span>");
		}
	%>
		<!-- 표현식 -->
<hr>
	<%
		for (int i=0; i<10; i++){
	%>
		<span>i=<%= calc(i) %></span>
	<%
		}
	%>
	
<!-- 	선언부 -->
	<%!
		int value = (int)(Math.random()*100);
		int calc(int n) {
			return n * value;		
		}
	%>
	

</body>
</html>