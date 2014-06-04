package br.com.rango.controller;

import java.math.BigDecimal;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.rango.dao.RefeicaoDAO;
import br.com.rango.model.Refeicao;

@Controller
@RequestMapping
public class InicialController {
	@Autowired
	private RefeicaoDAO refeicaoDAO;
	
	@RequestMapping(value = "/inicial")
	@Transactional
	public String paginaInicial() {
		Refeicao ref = new Refeicao();
		ref.setMetodoPagamento("cartao");
		ref.setRefeicaoId(1L);
		ref.setEntidade("andromeda");
		ref.setValor(BigDecimal.valueOf(7.50));
		refeicaoDAO.save(ref);
		return "/inicial";
	}
	
	@RequestMapping(value = "/buscar")
	public String buscar() {
		return "/buscar";
	}
	
}
