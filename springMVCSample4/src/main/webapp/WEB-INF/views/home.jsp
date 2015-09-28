<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Home画面
</h1>

<P>  The time on the server is ${serverTime}. </P>

<form action="/SpringMVCSample4/test" method="GET">

<label for="label1">数字を入力してください</label>
<input type="text" name="suuzi" value="1">
<input type="submit" value="計算">
</form>



</body>
</html>
