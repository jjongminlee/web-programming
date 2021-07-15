<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="css/main.css">
 	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Main Page</title>
</head>
<body>
	<header>
		<jsp:include page="/WEB-INF/jsp/layout/header.jsp"></jsp:include>
		<ul class="userInfoDiv">
			<li><a href="deptPage.do" class="ullink">부서정보</a></li>
		</ul>
		<div class="userInfoDiv">
			<h1>반갑습니다 !! ^_^♡ </h1>
			
		</div>
		<div>
			<button type="button" class="btn btn-primary" stlye="right" onclick="window.location.href='logout.do'">로그아웃</button>
		<button type="button" class="btn btn-outline-danger" stlye="right" onclick="window.location.href='userInfo.do'">내정보</button>
		<button type="button" onclick="window.location.href='deptPage.do'">부서정보</button>
		</div>
	</header>
	
	
	
	
</body>
</html>
