<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Login</title>
</head>
<body>
	<h2>Página de Login das Tarefas</h2>
	<form action="efetuaLogin" method="post">
		Login: <input type="text" name="usuario" /> <br />
		Senha: <input type="password" name="senha" /> <br />
		<input type="submit" value="Entrar nas tarefas" />
	</form>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>