<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/10
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page1</title>
</head>
<body>
    <shiro:hasPermission name="page1:list">
        <h1>page1</h1>
    </shiro:hasPermission>
    <shiro:hasPermission name="page1:edit">
        <input >
    </shiro:hasPermission>
</body>
</html>
