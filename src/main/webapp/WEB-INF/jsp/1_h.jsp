<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1_h</title>
</header>
<body>
    <div>학과별 총 학생 수</div>
    <table width="500" border="1">
        <tr>
            <td width="100">총 학생 수</td>
            <td width="100">학과</td>
        </tr>
        <c:forEach items="${dept_stu}" var="dept_stu">
            <tr>
                <td width="100">${dept_stu[0].toString()}</td>
                <td width="100">${dept_stu[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>

    <div>학년별 총 학생 수</div>
    <table width="500" border="1">
        <tr>
            <td width="100">총 학생 수</td>
            <td width="100">학년</td>
        </tr>
        <c:forEach items="${year_stu}" var="year_stu">
            <tr>
                <td width="100">${year_stu[0].toString()}</td>
                <td width="100">${year_stu[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>