<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="book_menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<style>
#tablesize {
	margin-top: 30px;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="tablesize">
		<table id="tableA">
			<c:forEach items="${output }" var="my">
				<tr>
					<c:set var="aa" value="${my.booktitle }" />

					<td><c:if test="${my.booktitle eq aa }">
							<img src="./image/${my.booktitle }.jpg" width="200" height="300"><br><br>
						</c:if></td>
				</tr>

				<tr>
				
					<td>${my.bookcontent }</td>
				</tr>

			</c:forEach>
		</table>
	</div>
</body>
</html>