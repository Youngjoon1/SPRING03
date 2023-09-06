<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>index</h1>
	<h3>get방식</h3>
	<form action="/root/my/result" method="get"> <%-- 절대경로 --%>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="get전송"><br>
	</form>
	<hr>
	<h3>post방식</h3>
	<form action="result" method="post"> <%-- 상대경로 --%>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="submit" value="post전송"><br>
	</form>
	<hr>
	<h3>dto 방식</h3>
	<form action="dto" method="post"> <%-- 상대경로 --%>
		<input type="text" name="name"><br>
		<input type="text" name="age"><br>
		<input type="text" name="addr"><br>
		<input type="submit" value="dto전송"><br>
	</form>
	
</body>
</html>