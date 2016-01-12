<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Teste titulo</title>
</head>
<body>
	<p>Conversor de Medidas</p>
	<form method="post" action="/ConversorMedidas/Resposta">
		Centímetros:<br> <input type="text" name="entrada">
		<br>
		
		Polegadas:<br>
		<input type="text" value="${convert.saida}" name="saida" disabled="disabled">
		<br>
		<br> <input type="submit" value="Converter">
	</form>
</body>
</html>