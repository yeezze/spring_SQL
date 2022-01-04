<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-f</title>
</header>
<body>
<table width="500" border="1">
    <tr>
        <td width="100">작가 이름</td>
        <td width="100">도서의 총 개수</td>
        <td width="100">최고 가격</td>
        <td width="100">최저 가격</td>
        <td width="50">평균 가격</td>
    </tr>
    <c:forEach items="${lists}" var="list">
        <tr>
            <td width="100">${list[0].toString()}</td>
            <td width="100">${list[1].toString()}</td>
            <td width="100">${list[2].toString()}</td>
            <td width="100">${list[3].toString()}</td>
            <td width="50">${list[4].toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>