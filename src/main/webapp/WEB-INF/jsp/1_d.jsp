<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1_d</title>
</header>
<body>
<div>과목별 최고 점수를 획득한 학생 정보</div>
<table width="500" border="1">
    <tr>
        <td width="100">학생 ID</td>
        <td width="100">학생 이름</td>
        <td width="100">학과명</td>
        <td width="100">이수 학점</td>
        <td width="100">학년</td>
        <td width="100">시험 점수</td>
        <td width="100">과목 ID</td>
    </tr>
    <c:forEach items="${maxCourses}" var="maxcourse">
        <tr>
            <td width="100">${maxcourse[0].toString()}</td>
            <td width="100">${maxcourse[1].toString()}</td>
            <td width="100">${maxcourse[2].toString()}</td>
            <td width="100">${maxcourse[3].toString()}</td>
            <td width="100">${maxcourse[4].toString()}</td>
            <td width="100">${maxcourse[5].toString()}</td>
            <td width="100">${maxcourse[6].toString()}</td>
        </tr>
    </c:forEach>
</table>
<br>
<div>과목별 최저 점수를 획득한 학생 정보</div>
<table width="500" border="1">
    <tr>
        <td width="100">학생 ID</td>
        <td width="100">학생 이름</td>
        <td width="100">학과명</td>
        <td width="100">이수 학점</td>
        <td width="100">학년</td>
        <td width="100">시험 점수</td>
        <td width="100">과목 ID</td>
    </tr>
    <c:forEach items="${minCourses}" var="mincourse">
        <tr>
            <td width="100">${mincourse[0].toString()}</td>
            <td width="100">${mincourse[1].toString()}</td>
            <td width="100">${mincourse[2].toString()}</td>
            <td width="100">${mincourse[3].toString()}</td>
            <td width="100">${mincourse[4].toString()}</td>
            <td width="100">${mincourse[5].toString()}</td>
            <td width="100">${mincourse[6].toString()}</td>
        </tr>
    </c:forEach>
</table>
<p>과목별 수강생이 1명인 경우 최고, 최저점을 획득한 학생의 정보가 동일할 수 있음</p>
</body>
</html>