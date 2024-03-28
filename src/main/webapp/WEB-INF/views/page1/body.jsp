<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Page 1 Main</title>

<%-- <%@include file = "../inc/header.jsp" %> --%>

</head>
<body>

페이지 1의 메인입니다.


<br>

 세션에 저장된 값은  : ${userId} 입니다.
 <br><h1>${userId}님의 접속을 환영합니다.</h1>
 

</body>
</html>