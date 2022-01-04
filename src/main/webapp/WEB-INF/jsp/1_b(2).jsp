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
        <td width="100">Course 이름</td>
        <td width="100">학점</td>
        <td width="100">시험 점수</td>
    </tr>
    <c:forEach items="${courses}" var="course">
        <tr>
            <td width="100">${course[0].toString()}</td>
            <td width="100">${course[1].toString()}</td>
            <td width="100">${course[2].toString()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>