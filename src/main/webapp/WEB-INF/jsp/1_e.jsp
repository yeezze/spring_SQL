<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1_e</title>
</header>
<body>
    <div>학생별 수강한 교과목의 총학점과 시험점수의 평균</div>
    <table width="500" border="1">
        <tr>
            <td width="100">학생 ID</td>
            <td width="100">총학점</td>
            <td width="100">시험점수의 평균</td>
        </tr>
        <c:forEach items="${examStus}" var="examStu">
            <tr>
                <td width="100">${examStu[0].toString()}</td>
                <td width="100">${examStu[1].toString()}</td>
                <td width="100">${examStu[2].toString()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>