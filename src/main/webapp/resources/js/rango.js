function buscarMarmita() {
	var nomeMarmita = $("#pesquisarMarmita").val();
	$.ajax({
		type: "GET",
		contentType : "application/json",
		data: {	nomeMarmita: nomeMarmita
			},
		url: "/rango/pesquisar"
	}).done(function(data) {
		atribuirHtml(data, $("#tabelaRefeicao"));
	}).fail(function(data) {
	});
}

function atribuirHtml(html, destino) {
	$(destino).empty();
	$(destino).append(html);
};

function mostrarPasso2() {
	if ($("#passo2").hasClass('hidden')) {
		$("#passo2").removeClass('hidden');
		$("#passo2").addClass('shown');
    }
}

$(document).ready(function() {	

});
