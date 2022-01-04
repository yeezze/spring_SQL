<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>레코드 삽입</title>
</head>
<body>
<p> 새로운 도서를 삽입(추가) 했습니다.</p>
<div>새로 추가한 도서, 저자, 재고량 정보</div>
<table width="500" border="1">
    <tr>
        <td width="100">ISBN</td>
        <td width="100">책이름</td>
        <td width="100">출판년도</td>
        <td width="100">가격</td>
    </tr>
        <tr>
            <td width="100">${book.getIsbn()}</td>
            <td width="100">${book.getTitle()}</td>
            <td width="100">${book.getYear())}</td>
            <td width="100">${book.getPrice()}</td>
        </tr>
</table>

</body>
</html>