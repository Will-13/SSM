<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <link href="${ctxStatic}/error/css/404.css" type="text/css" rel="stylesheet"/>

    <script src="${ctxStatic}/jquery/jquery-2.1.1.min.js"></script>
    <script src="${ctxStatic}/error/js/bodymovin.js"></script>
    <script src="${ctxStatic}/error/js/data.js"></script>
</head>
<body>
    <div id="svgContainer"></div>
    <script type="text/javascript">
        var svgContainer = document.getElementById('svgContainer');
        var animItem = bodymovin.loadAnimation({
            wrapper: svgContainer,
            animType: 'svg',
            loop: true,
            animationData: JSON.parse(animationData)
        });
    </script>
</body>
</html>
