package br.com.rango.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="REFEICAO")
public class Refeicao implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "refeicaoid")
	private long refeicaoId;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "entidade")
	private String entidade;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "metodopagamento")
	private String metodoPagamento;
	
	public Long getRefeicaoId() {
		return refeicaoId;
	}
	public void setRefeicaoId(Long refeicaoId) {
		this.refeicaoId = refeicaoId;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEntidade() {
		return entidade;
	}
	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
