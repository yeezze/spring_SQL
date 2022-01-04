<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>검색</title>
</header>
<body>
<div>특정 고객 조회</div>
<form name="2-c" method="get" action="/2_c(2)">
    <p>
        <input type="text" name="email" placeholder="고객 이메일을 입력해주세요">
        <button>조회하기</button>
    </p>
</form>
</body>
</html>