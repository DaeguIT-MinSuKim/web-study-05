<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 값 얻어오기 </title>
</head>
<body>
<h3> 세션 값 얻어오기 </h3>
<%
	String id = (String) session.getAttribute("id");
	String pwd = (String) session.getAttribute("pwd");
	Integer age = (Integer) session.getAttribute("age");
%>
id : <%= id %><br>
pwd : <%= pwd %><br>
age : <%= age %><br>

	<a href="06_getSessions.jsp">
	모든 세션값 을 확인하려면 클릭하세요.
	</a>
</body>
</html>