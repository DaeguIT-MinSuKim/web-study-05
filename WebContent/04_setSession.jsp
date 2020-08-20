<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 설정</title>
</head>
<body>
<%
	session.setAttribute("id", "pinksung");
	session.setAttribute("pwd", "test1234");
	session.setAttribute("age", 20);
%>
<h3>세션 설정</h3>
	<a href="05_getSession.jsp">세션을 확인하려면 클릭하세요.</a>	
</body>
</html>