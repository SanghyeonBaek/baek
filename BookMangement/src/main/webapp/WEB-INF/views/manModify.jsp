<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@include file="man_menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
table {
	text-align: center;
	border-color: gray;
	font-size: 14px;
}

#mm {
	margin-top: 30px;
}
</style>
<meta charset="UTF-8">
<title>회원정보수정</title>
</head>
<body>
	<form action="manModifydata" method="post">
		<%
		int userno = Integer.parseInt(request.getParameter("userno"));
		%>
		<div id="mm">
			<fieldset>
				<legend>
					<b>회원정보수정</b>
				</legend>

				<table border="1" width="450" align="center">
					<tr>
						<td>회원번호</td>
						<td>${param.userno }</td>
					</tr>
					<tr>
						<td>회원이름</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>전화번호</td>
						<td><input type="text" name="usertel"></td>
					</tr>
					<tr>
						<td>이메일</td>
						<td><input type="text" name="usermail"></td>
					</tr>
				</table>

				<p>
					<input type="submit" value="수정" font-size="12px">
			</fieldset>
		</div>
		<%
		HttpSession hs = request.getSession();
		hs.setAttribute("userno", userno);
		%>
	</form>
</body>
</html>