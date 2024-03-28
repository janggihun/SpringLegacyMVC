<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 페이지</title>

<%@include file = "../inc/header.jsp" %>
</head>
<body>
로그인 페이지 입니다.

<div class = "loginContainer ">
	<div class = "loginBox">
		<form action="/login" method="post">
			<div class = "idBox centerGlobal"><input type = text placeholder="id를 적어주세요" name = "userId" id = "userId" /></div>
			<div class = "pwBox centerGlobal"><input type = text placeholder="pw를 적어주세요" name = "userPw" id = "userPw" /></div>
			<div class = "loginBox" ><input type = "submit" value="로그인"></div>
		</form>	
	</div>
</div>

<a href = "/main"> 메인으로 가기 </a>




</body>
</html>