<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body>
<header>
		
		<div class="logoDiv">

			<img alt="대구대학교 로고" src="images/image.png">

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