<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cadastre sua empresa</title>
	</head>
	<body>
	
		<form action="${linkServletNovaEmpresa}" method="post">
		
			Nome da Empresa: <input type="text" name="nomeEmpresa"/>
			Data de Abertura: <input type="text" name="dataAbertura" pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}" placeholder="dd/mm/yyyy"/>
			<input type="submit"/>
		
		</form>
		
	</body>
</html>