<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>ログイン</title>
	<script src="<c:url value="/resources/js/jquery-2.1.0.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
</head>
<body>
<h1>
	ログイン画面
</h1>

<form action="/springLoginDB/welcome" method="GET">
<label for="userId">ユーザID</label>
<input name="userId" id="userId" type="text" value="1" class="form-control"/>
<label for="userPassWord">パスワード</label>
<input name="userPassWord" id="userPassWord" type="text" value="pass1" class="form-control"/>
<input type="submit" value="ログイン" class="btn btn-primary btn-lg" >
</form>

<p>現在の時刻 ${serverTime}. </p>


</body>
</html>
