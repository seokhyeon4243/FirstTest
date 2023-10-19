<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Book 리스트</h1>
	<table>
		<thead>
			<tr>
				<td>번호</td>
				<td>제목</td>
				<td>작성자</td>
				<td>고유번호</td>
				<td>장르</td>
				<td>생성일자</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>${book.id}</td>
					<td><a href="getBook.do?id=${book.id}">${book.title}</a>
					</td>
					<td>${book.author}</td>
					<td>${book.isbn}</td>
					<td>${book.genre}</td>
					<td>${book.created_at}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>