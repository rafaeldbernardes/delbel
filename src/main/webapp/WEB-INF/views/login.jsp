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
		<div class="container">
			<div id="passo1">
				<div class="form-signin">
					<h2 class="form-signin-heading"><spring:message code="rango.login.logar"/>
						<span class="glyphicon glyphicon-fire"></span>
					</h2>
					<input type="email" class="form-control" placeholder="Email address" required="" autofocus=""> 
					<input type="password" class="form-control" placeholder="Password" required=""> 
					<label class="checkbox"> 
						<input type="checkbox" value="remember-me"><spring:message code="rango.login.lembrar"/>
					</label>
					<button class="btn btn-lg btn-primary btn-block" onclick="mostrarPasso2();"><spring:message code="rango.login.entrar"/></button>
				</div>
			</div>
			<div id="passo2" class="hidden">
				<form:form method="POST" modelAttribute="refeicaoForm">
				    <form role="form" class="form">
				        <h1><spring:message code="rango.login.informacoesrefeicao"/></h1>
				        <div class="required-field-block">
				            <input type="text" name="nomeRefeicao" placeholder="<spring:message code="rango.login.nomerefeicao"/>" class="form-control">
				            <div class="required-icon">
				                <div class="text">*</div>
				            </div>
				        </div>
				        <div class="required-field-block">
				            <input type="number" name="valorRefeicao" placeholder="<spring:message code="rango.login.valorrefeicao"/>" class="form-control">
				            <div class="required-icon">
				                <div class="text">*</div>
				            </div>
				        </div>
	   			        <div class="required-field-block">
				            <input type="text" name="metodoPagamento" placeholder="<spring:message code="rango.login.pagamentorefeicao"/>" class="form-control">
				            <div class="required-icon">
				                <div class="text">*</div>
				            </div>
				        </div>
				        <button class="btn btn-primary" type="submit"><spring:message code="rango.login.enviar"/></button>
				    </form>
			    </form:form>
		    </div>
		</div>
	</body>
</html>