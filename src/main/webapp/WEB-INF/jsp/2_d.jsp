<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>레코드 삽입</title>
</head>
<body>
<div>현재 등록되어 있는 도서 정보</div>
<table width="500" border="1">
    <tr>
        <td width="100">ISBN</td>
        <td width="100">책이름</td>
        <td width="100">출판년도</td>
        <td width="100">가격</td>
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
<p>새로운 도서 등록</p>
<form name="bookform" method="post" action="/2_d_insert">
    <p>ISBN : <input type="text" name="isbn"></p>
    <p>책이름 : <input type="text" name="title"></p>
    <p>출판년도 : <input type="text" name="year"></p>
    <p>가격 : <input type="text" name="price"></p>
    <br>
    <p>저자 이름: <input type="text" name="name"></p>
    <p>저자 주소: <input type="text" name="address"></p>
    <p>저자 url: <input type="text" name="url"></p>
    <br>
    <div>출판사 창고별 재고량</div>
    <p>창고 코드: <input type="text" name="code"></p>
    <p>재고량: <input type="text" name="num"></p>
</form>
</body>
</html>