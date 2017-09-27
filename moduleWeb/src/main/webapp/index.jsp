<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<html>
<head>
    <title>String</title>
</head>
<body>
<%--<c:out value="This is index.jsp: ${sessionScope.admin.name}"/>--%>
<form action="/multi/frontController" method="post">
    <p>Введите строку...тел формат=[+375 (xxx) xxx-xx-xx]  :</p>
    <p><input type="text" required name="strType" maxlength="64"></p>
    <p><input type="submit" value="Отправить"></p>
</form>
</body>
</html>
