<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Remainder Page</title>
</head>
<form action="remainder" method="post">
	<h3>Simple Remainder Test</h3>
	<!--  added div tags to add css later -->
	<div align="center">
		<div align="center">
			Enter the number: <input type="text" id="num" name="num"> <br>
			Enter the dividend:<input type="text" id="div" name="div"> <br>
			<input type="submit" value="Result"> <br>
		</div>
		<!-- changed the display text of button -->
		RESULT: <input type="text" disabled="disabled" value="${result}">
	</div>
</form>
</html>