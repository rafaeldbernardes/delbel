<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>

<html>
<head>
	<link href="<c:url value="/resources/css/reset.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/rango.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
	<script src="<c:url value="/resources/js/rango.js" />"></script>
</head>
<body>
	<section class="menu-principal container">
		<h3>
			<label class="label label-default"><spring:message code="rango.paginainicial" /></label>
		</h3>
		<img src="resources/img/logoprincipal.jpg" alt="Logo Mirror Fashion">
		<nav class="menu-marmita">
			<ul>
				<li><label class="label label-default"><spring:message code="rango.paginainicial.buscarmarmita" /></label></li>
				<li><a href="#"><spring:message code="rango.paginainicial.buscarmarmitas" /></a></li>
				<li><a href="#"><spring:message code="rango.paginainicial.marmitasrecentes" /></a></li>
			</ul>
			<div class="row">
				<form action="/rango/buscar">
					<input id="pesquisarMarmita" type="text" class="inputPesquisar" name="nomeMarmita" />
					<button id="buscarMarmita" type="submit" class="btn btn-default">
						<spring:message code="rango.paginainicial.buscar" />
					</button>
				</form>
				<label class="label label-default"><spring:message code="rango.paginainicial.localizacao" /></label>
			</div>
		</nav>
	</section>

	<footer>
		<div class="container">
			<img src="resources/img/facebook.png" alt="Logo Mirror Fashion">
			<ul class="social">
				<li><a href="http://facebook.com/mirrorfashion">Facebook</a></li>
				<li><a href="http://twitter.com/mirrorfashion">Twitter</a></li>
				<li><a href="http://plus.google.com/mirrorfashion">Google+</a></li>
			</ul>
		</div>
	</footer>
</body>
</html>