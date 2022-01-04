<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>2-e</title>
</header>
<body>
    <div>전체 도서의 평균 가격</div>
    <table width="500" border="1">
        <tr>
            <td width="100">평균 가격</td>
        </tr>
        <tr>
            <td width="100">${avgPrice}</td>
        </tr>
    </table>
    <br>
    <div>년도별 평균 가격</div>
    <table width="500" border="1">
        <tr>
            <td width="100">평균 가격 (반올림 처리함)</td>
            <td width="100">년도</td>
        </tr>
        <c:forEach items="${avgPriceByYear}" var="list">
            <tr>
                <td width="100">${list[0].toString()}</td>
                <td width="100">${list[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>