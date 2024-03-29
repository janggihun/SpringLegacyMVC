<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 페이지</title>

<%@include file="../inc/header.jsp"%>
</head>
<body>
	<h1>로그인 (id : aaa | pw :111)</h1>
	<hr>
	<h1>Post form 형식</h1>
	<div class="loginContainer ">
		<div class="loginBox">
			<form action="/login" method="post">
				<div class="idBox centerGlobal">
					<input type=text placeholder="id를 적어주세요" name="userId" />
				</div>
				<div class="pwBox centerGlobal">
					<input type=text placeholder="pw를 적어주세요" name="userPw" />
				</div>
				<div class="loginBox">
					<input type="submit" value="로그인">
				</div>
			</form>
		</div>
	</div>

	<hr>

	<h1>ajax 형식</h1> 


	<div class="loginContainer ">
		<div class="loginBox">
			<div class="idBox centerGlobal">
				<input type=text placeholder="id를 적어주세요" id="userId" />
			</div>
			<div class="pwBox centerGlobal">
				<input type=text placeholder="pw를 적어주세요" id="userPw" />
			</div>
			<div class="loginBox">
				<input type="submit" value="로그인" id = "loginButton">
			</div>
		</div>
		
		
	</div>
	<br>
	<div style = "display: flex">
	
	<h2><div>결과 : </div><div id = "resultFlag"></div></h2>
	</div>
<hr>

	<a href="/main"> 메인으로 가기 </a>
<script src="<c:url value="/resources/js/login/login.js" />"></script>
<%-- <script defer src="${pageContext.request.contextPath}/resources/js/login/login.js"></script> --%>
<!-- 	<script defer src="/js/login/login.js"></script> -->

</body>
</html>