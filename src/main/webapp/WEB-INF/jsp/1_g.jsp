<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1_g</title>
</header>
<body>
    <div>학과 별로 개설된 강좌수</div>
    <table width="500" border="1">
        <tr>
            <td width="100">강좌수</td>
            <td width="100">학과</td>
        </tr>
        <c:forEach items="${countLecs}" var="countLec">
            <tr>
                <td width="100">${countLec[0].toString()}</td>
                <td width="100">${countLec[1].toString()}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>