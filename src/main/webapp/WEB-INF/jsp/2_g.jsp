<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>재고가 특정 부수 이상 넘어가는 도서 검색</title>
</header>
<body>
<div>재고를 입력하세요.</div>
<form name="2-c" method="get">
    <p>
        <input type="text" name="stock" placeholder="재고를 입력해주세요">
        <button>조회하기</button>
    </p>
</form>
<form name="2-c" method="post">
    <p>
        <input type="text" name="num" placeholder="재고를 입력해주세요">
        <input type="text" name="price" placeholder="할인을 원하는 퍼센트를 입력해주세요">
        <button>가격 할인하기</button>
    </p>
</form>
<table width="500" border="1">
    <tr>
        <td width="100">ISBN</td>
        <td width="100">총 재고 부수</td>
    </tr>
    <c:forEach items="${lists}" var="list">
        <tr>
            <td width="100">${list[0].toString()}</td>
            <td width="100">${list[1].toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>