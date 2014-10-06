<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
		<header>
			<img src="resources/img/logoprincipal.jpg" alt="Logo Mirror Fashion">
			<div class="middle">
				<div class="row">
					<ul>
						<li><label class="label label-default"><spring:message code="rango.paginainicial.buscarmarmita"/></label></li>
						<li><a href="#"><spring:message code="rango.paginainicial.buscarmarmitas"/></a></li>
						<li><a href="#"><spring:message code="rango.paginainicial.marmitasrecentes"/></a></li>
					</ul>
				</div>
				<div class="row">
					<input id="pesquisarMarmita" type="text" class="inputPesquisar" />
					<button id="buscarMarmita" type="button" class="btn btn-default btn-lg" onclick="buscarMarmita();">
						<span class="glyphicon glyphicon-search"></span><spring:message code="rango.paginainicial.buscar"/>
					</button>
				</div>
				<div class="row">
		            <label><input type="checkbox"><spring:message code="rango.pesquisar.pratos"/></label>
		            <label><input type="checkbox"><spring:message code="rango.pesquisar.sobremesas"/></label>
		            <label><input type="checkbox"><spring:message code="rango.pesquisar.saladas"/></label>
		            <label><input type="checkbox"><spring:message code="rango.pesquisar.pratosdiets"/></label>
		            <label><input type="checkbox" checked="checked"><spring:message code="rango.pesquisar.tudo"/></label>
				</div>
			</div>
		</header>
		<section class="menu-principal container">
		  <div id="tabelaRefeicao">
		  	<jsp:include page="_tabelarefeicao.jsp"/>	
		  </div>
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