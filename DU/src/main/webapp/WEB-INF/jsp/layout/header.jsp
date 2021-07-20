<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/bootstrap.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/webapp/js/bootstrap/bootstrap.bundle.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/main.css">
</head>
<body>
<header>
		
		<div class="logoDiv">

			<img alt="대구대학교 로고" src="${pageContext.request.contextPath }/images/image.png"
			onclick="window.location.href='${pageContext.request.contextPath }/mainPage.do'">
				

		</div>

		<ul class="infoUl">

			<li><a href="deptPage.do">부서정보</a></li>

		</ul>

		<div class="userInfoDiv">

			반갑습니다! <c:out value="${USER.name}"></c:out>님

			<button type="button" onClick="window.location.href='logout.do'" class="btn btn-primary btn-sm">로그아웃</button>

		    <button type="button" onClick="window.location.href='userInfo.do'" class="btn btn-outline-primary btn-sm">내정보</button>

		</div>
</header>
</body>
</html>