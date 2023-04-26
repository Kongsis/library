<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-25
  Time: 오전 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <h2>detail.jsp</h2>
    <table class="table table-dark table-hover">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>publisher</th>
            <th>author</th>
            <th>price</th>
        </tr>
            <tr>
                <td>${book.id}</td>
                <td>${book.bookName}</td>
                <td>${book.bookPublisher}</td>
                <td>${book.bookAuthor}</td>
                <td>${book.bookPrice}</td>
            </tr>
    </table>
</body>
</html>
