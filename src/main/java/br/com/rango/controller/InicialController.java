package br.com.rango.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/inicial")
public class InicialController {
	
	@RequestMapping
	public String paginaInicial() {
		return "principal/inicial";
	}
	
}
