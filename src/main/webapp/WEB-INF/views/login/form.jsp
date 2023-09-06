<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${contextPath}/css/test.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/test.js">
	<%--
	function test() {
		alert("test클릭")
	}
	
	window.onload = () => {
		const btn = document.getElementById("btn");
		btn.addEventListener("click",test);
	
	}
	--%>
</script>
</head>
<body>
	<h1>로그인 페이지</h1><br>
	
	<button type="button" id="btn">클릭</button> &nbsp;
	<button type="button" onclick="test()">클릭test</button><br>
	
	<form action="login_chk" method="post">
		id : <input type="text" name="id"><br>
		pwd : <input type="text" name="pwd"><br>
		<input type="submit" value="로그인"><br>
	
	</form>
</body>
</html>