<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>

<table class="table table-hover">
	<tr>
		<th class="tg-031e"><spring:message code="rango.pesquisar.nomerefeicao"/></th>
		<th class="tg-031e"><spring:message code="rango.pesquisar.marmitaria"/></th>
		<th class="tg-031e"><spring:message code="rango.pesquisar.valorrefeicao"/></th>
		<th class="tg-031e"><spring:message code="rango.pesquisar.metodopagamento"/></th>
	</tr>
	<c:if test="${refeicoes != undefined}">
		<c:forEach items="${refeicoes}" var="refeicao">
			<tr>
				<td class="tg-031e">${refeicao.nomeRefeicao}</td>
				<td class="tg-031e">${refeicao.entidade}</td>
				<td class="tg-031e">${refeicao.valorRefeicao}</td>
				<td class="tg-031e">${refeicao.metodoPagamento}</td>
			</tr>
		</c:forEach>
	</c:if>
</table>