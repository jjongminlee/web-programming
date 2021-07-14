<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>본인 확인</title>
</head>
<body>
<form action="userCheck.do" method="post" id="userCheckForm">
<div>
		<h1>User Check Page</h1>
	</div>
		<fieldset>
			<legend>Check</legend>
			<table>
				<tr>
					<th>PasswordCheck</th>
					<td><input type="password" id="pwd" name="pwdInput" placeholder="비밀번호를 입력해주세요"></td>
				</tr>
				
			</table>
			<br>
			<div>
				<button type="button" onclick="window.location.href='userInfo.do'">확인</button>
				<button type="button" onclick="window.history.go(-1)">이전</button>
			
			</div>
		</fieldset>
</form>
</body>
</html>