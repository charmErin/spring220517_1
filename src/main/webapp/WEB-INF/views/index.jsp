<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-17
  Time: 오전 8:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>index.jsp</h2>
    <%-- 컨트롤러를 통해서 컨트롤러가 그 링크를 표시해줌/ jsp -> jsp 로 이동불가 ! --%>
    <%-- server에게 /welcome 주소를 get방식으로 요청 --%>
    <a href="welcome">welcome 페이지로 이동</a><br>
    <%-- form-ex 페이지로 이동 --%>
    <a href="form-ex">form-ex 페이지로 이동</a>
</body>
</html>
