<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>검색</title>
</header>
<body>
<h2></h2>
<div>모든 고객 정보 확인</div>
<table width="500" border="1">
    <tr>
        <td width="100">이메일</td>
        <td width="100">이름</td>
        <td width="100">주소</td>
        <td width="100">핸드폰 번호</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td width="100">${customer.getEmail()}</td>
            <td width="100">${customer.getName()}</td>
            <td width="100">${customer.getAddress()}</td>
            <td width="100">${customer.getPhone()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>