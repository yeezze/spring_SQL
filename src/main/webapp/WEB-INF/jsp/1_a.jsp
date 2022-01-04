<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"  isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>1-a</title>
</header>
<body>
    <table width="500" border="1">
        <tr>
            <td width="100">학생 아이디</td>
            <td width="100">이름</td>
            <td width="100">학과명</td>
            <td width="100">이수학점</td>
        </tr>
        <c:forEach items="${students}" var="student">
            <tr>
                <td width="100">${student.getId()}</td>
                <td width="100">${student.getName()}</td>
                <td width="100">${student.getDeptName()}</td>
                <td width="100">${student.getTot()}</td>
            </tr>
        </c:forEach>
    </table>
    <p>Student 테이블 투플의 총 갯수는 ${countstu}개 입니다.</p>

    <table width="500" border="1">
        <tr>
            <td width="100">교수 번호</td>
            <td width="100">이름</td>
            <td width="100">전공</td>
            <td width="100">소속부서</td>
        </tr>
        <c:forEach items="${professors}" var="professor">
            <tr>
                <td width="100">${professor.getPno()}</td>
                <td width="100">${professor.getPname()}</td>
                <td width="100">${professor.getPmajor()}</td>
                <td width="100">${professor.getPdept()}</td>
            </tr>
        </c:forEach>
    </table>
    <p>Professors 테이블 투플의 총 갯수는 ${countpro}개 입니다.</p>

    <table width="500" border="1">
        <tr>
            <td width="100">강좌 아이디</td>
            <td width="100">강좌명</td>
            <td width="100">소속학과</td>
            <td width="100">이수학점</td>
        </tr>
        <c:forEach items="${courses}" var="course">
            <tr>
                <td width="100">${course.getCourseId()}</td>
                <td width="100">${course.getTitle()}</td>
                <td width="100">${course.getDeptName()}</td>
                <td width="100">${course.getCredits()}</td>
            </tr>
        </c:forEach>
    </table>
    <p>Course 테이블 투플의 총 갯수는 ${countcou}개 입니다.</p>

    <table width="500" border="1">
        <tr>
            <td width="100">학생 아이디</td>
            <td width="100">강좌 아이디</td>
            <td width="100">학점</td>
            <td width="100">시험 점수</td>
        </tr>
        <c:forEach items="${enrolls}" var="enroll">
            <tr>
                <td width="100">${enroll.getId()}</td>
                <td width="100">${enroll.getCourseId()}</td>
                <td width="100">${enroll.getGrade()}</td>
                <td width="100">${enroll.getExam()}</td>
            </tr>
        </c:forEach>
    </table>
    <p>Enroll 테이블 투플의 총 갯수는 ${counten}개 입니다.</p>

    <table width="500" border="1">
        <tr>
            <td width="100">강좌 아이디</td>
            <td width="100">교수 번호</td>
            <td width="100">강의 시간</td>
            <td width="100">강의 장소</td>
        </tr>
        <c:forEach items="${lectures}" var="lecture">
            <tr>
                <td width="100">${lecture.getCourseId()}</td>
                <td width="100">${lecture.getPno()}</td>
                <td width="100">${lecture.getLecTime()}</td>
                <td width="100">${lecture.getRoom()}</td>
            </tr>
        </c:forEach>
    </table>
    <p>Lecture 테이블 투플의 총 갯수는 ${countlec}개 입니다.</p>
</body>
</html>