package br.com.rango.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.rango.model.Refeicao;
import br.com.rango.service.RefeicaoService;
import br.com.rango.view.RefeicaoFormView;
import br.com.rango.view.adapter.RefeicaoFormViewAdapter;

@Controller
@RequestMapping(value="/")
public class InicialController {
	@Autowired private RefeicaoService refeicaoService;
	@Autowired private RefeicaoFormViewAdapter refeicaoFormViewAdapter;
	
	@RequestMapping(value = "/inicial")
	public String paginaInicial() {
		return "/inicial";
	}
	
	@RequestMapping(value = "/buscar")
	public String buscar(@RequestParam("nomeMarmita") String nomeMarmita, Model model) {
		List<Refeicao> refeicoes = refeicaoService.buscarRefeicaoPorNome(nomeMarmita);
		model.addAttribute("refeicoes", refeicaoFormViewAdapter.adaptToFormView(refeicoes));
		return "/buscar";
	}
	
	@RequestMapping(value = "/pesquisar")
	public String pesquisarMarmita(@RequestParam("nomeMarmita") String nomeMarmita, Model model ) {
		List<Refeicao> refeicoes = refeicaoService.buscarRefeicaoPorNome(nomeMarmita);
		model.addAttribute("refeicoes", refeicaoFormViewAdapter.adaptToFormView(refeicoes));
		return "/_tabelarefeicao";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String submeter(@ModelAttribute("refeicaoForm") RefeicaoFormView refeicaoFormView) {
		refeicaoService.salvarRefeicao(refeicaoFormViewAdapter.adaptToModel(refeicaoFormView));
		return "/login";
	}
	
	@RequestMapping(value = "/login")
	public String login() {
		return "/login";
	}
	
	public void setRefeicaoDAOImpl(RefeicaoService refeicaoService) {
		this.refeicaoService = refeicaoService;
	}
	
}
