<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<meta http=equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MAin Page</title>
</head>
<body>
<%
	int sum = 0;
	for(int i = 0; i <= 10; i++){
		sum += i;
	}
%>

<c:set var="total" value="0"/>
<c:forEach var="i" begin="1" end="10" step="1">
<c:set var="total" value="${total+i}"/>
</c:forEach>1부터 10까지의 합은 <c:out value="${total}"/> 입니다.ㅁㅁㅁㅁ

</body>
</html>