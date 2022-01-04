<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-c</title>
</header>
<body>
<div>특정 고객 이메일 입력 시 정보 출력</div>
<table width="500" border="1">
    <tr>
        <td width="100">해당 고객이 주문한 도서 ISBN</td>
        <td width="100">출판사명</td>
        <td width="100">저자 이름</td>
        <td width="100">저자 주소</td>
    </tr>
    <c:forEach items="${lists}" var="list">
        <tr>
            <td width="100">${list[0].toString()}</td>
            <td width="100">${list[1].toString()}</td>
            <td width="100">${list[2].toString()}</td>
            <td width="100">${list[3].toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>