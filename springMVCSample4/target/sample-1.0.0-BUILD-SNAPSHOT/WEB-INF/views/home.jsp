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

<form action="/SpringMVCSample2/test" method="GET">

<label for="shozoku">所属</label>
<select name="shozoku">
<option value="SB">SB</option>
<option value="MB">MB</option>
<option value="NTCS">NTCS</option>
</select>

<input type="submit" value="ボタン">
</form>



</body>
</html>
