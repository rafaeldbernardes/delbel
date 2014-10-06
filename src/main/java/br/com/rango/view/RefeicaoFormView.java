package br.com.rango.view;

import java.math.BigDecimal;

public class RefeicaoFormView {
	
	private String nomeRefeicao;
	private String entidade;
	private BigDecimal valorRefeicao;
	private String metodoPagamento;
	
	public String getNomeRefeicao() {
		return nomeRefeicao;
	}
	public void setNomeRefeicao(String nomeRefeicao) {
		this.nomeRefeicao = nomeRefeicao;
	}
	public String getEntidade() {
		return entidade;
	}
	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	public BigDecimal getValorRefeicao() {
		return valorRefeicao;
	}
	public void setValorRefeicao(BigDecimal valorRefeicao) {
		this.valorRefeicao = valorRefeicao;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	
}
