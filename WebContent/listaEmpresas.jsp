<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lista de Empresas</title>
	</head>
	<body>
			
			<c:if test="${not empty empresa}">
				<h1> ${empresa} cadastrada com sucesso</h1>
			</c:if>	
	
		<h3>Lista de Empresas:</h3>
		<ul>
			<c:forEach items="${empresas}" var="empresa">
			<li> 
				${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yy" /> 
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}" >deletar</a>
			</li>
			</c:forEach>
		</ul>	
	</body>
</html>