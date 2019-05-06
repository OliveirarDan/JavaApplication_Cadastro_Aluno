<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<title>Alunos</title>
</head>
<body>

	<form method="post">
		<div>
			<input type="text" id="nome" name="nome" placeholder="Nome do Aluno" />
		</div>
		<div>
			<input type="text" id="sobrenome" name="sobrenome" placeholder="Sobrenome do Aluno" />
		</div>

		<button type="submit" name=cadastraAluno value="cadastraAluno"
			formaction="cadastraAluno">Cadastra Aluno</button>
	</form>

</body>
</html>