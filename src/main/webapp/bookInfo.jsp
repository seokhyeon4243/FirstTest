<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상세정보</h1>
	<table>
		<tr>
			<td>번호:</td>
			<td>${book.id}</td>
		</tr>
		<tr>
			<td>제목:</td>
			<td>${book.title}</td>
		</tr>
		<tr>
			<td>작성자:</td>
			<td>${book.author}</td>
		</tr>
		<tr>
			<td>고유번호:</td>
			<td>${book.isbn}</td>
		</tr>
		<tr>
			<td>장르:</td>
			<td>${book.genre}</td>
		</tr>
		<tr>
			<td>생성일자:</td>
			<td>${book.created_at}</td>
		</tr>
	</table>
</body>
</html>