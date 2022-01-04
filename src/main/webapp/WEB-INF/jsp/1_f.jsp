<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1_f</title>
</header>
<body>
    <div>과목별 전체 평균 점수</div>
    <table width="500" border="1">
        <tr>
            <td width="100">평균 점수</td>
            <td width="100">강좌 ID</td>
        </tr>
        <c:forEach items="${avgcourses}" var="avgcourse">
            <tr>
                <td width="100">${avgcourse[0].toString()}</td>
                <td width="100">${avgcourse[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>

    <div>학점별 학생 수 </div>
    <table width="500" border="1">
        <tr>
            <td width="100">학생 수</td>
            <td width="100">학점</td>
        </tr>
        <c:forEach items="${gradestus}" var="gradestu">
            <tr>
                <td width="100">${gradestu[0].toString()}</td>
                <td width="100">${gradestu[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>