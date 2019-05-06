<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<title>Alunos</title>
</head>
<body>

	
	<form method="POST">
	
	<c:forEach items="${lista}" var="a">
				ID: ${a.id} || Nome: ${a.nome} || Sobrenome: ${a.sobrenome} <br>
	</c:forEach>
	
	
		<button type="submit" name="novoAluno" 
			formaction="novoAluno">Novo Aluno</button>
	</form>

</body>
</html>