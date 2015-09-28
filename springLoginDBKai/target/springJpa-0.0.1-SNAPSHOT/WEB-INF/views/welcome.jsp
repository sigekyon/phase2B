<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome</title>
    <script src="<c:url value="/resources/js/jquery-2.1.0.js" />"></script>
    <script src="<c:url value="/resources/js/bootstrap.js" />"></script>
    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
</head>

<body>
<h1>
    ようこそ画面
</h1>

<h2 class="text-info">${userName}</h2>
${message}

</body>

</html>