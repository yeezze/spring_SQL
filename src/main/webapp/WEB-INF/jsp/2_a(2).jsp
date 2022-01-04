<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Test page</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">도서 제목</td>
        <td width="100">도서의 재고 수량</td>
    </tr>
    <c:forEach items="${stocks}" var="stock">
        <tr>
            <td width="100">${stock[0].toString()}</td>
            <td width="100">${stock[1].toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>