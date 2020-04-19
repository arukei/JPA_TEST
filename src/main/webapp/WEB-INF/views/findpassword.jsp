<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>FindPassword</title>
</head>
<body>
<h1>
Find User Password
</h1>

<form action = "findpassword">
ID: <br>
<input type="text" name ="id" required="required"><br>
E-Mail: <br>
<input type="text" name ="email1" required="required">@<input type="text" name="email2" required="required"><br>

<input type="submit" value="FindPassword">

</form>


</body>
</html>
