<%--
  Created by IntelliJ IDEA.
  User: An
  Date: 2024-04-28
  Time: 오후 9:28
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>글 작성</title>
    <form action="save" method="post">
        제목: <input type="text" name="boardTitle"/>
        작성자: <input type="text" name="boardWriter"/>
        비밀번호: <input type="text" name="boardPass"/>
        내용: <input type="text" name="boardContents"/>
        <input type="submit" value="작성">
    </form>
</head>
<body>

</body>
</html>