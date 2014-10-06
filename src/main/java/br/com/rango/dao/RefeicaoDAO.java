package br.com.rango.dao;

import br.com.rango.model.Refeicao;

import com.googlecode.genericdao.dao.hibernate.GenericDAO;

public interface RefeicaoDAO extends GenericDAO<Refeicao, Long> {
	
	public void salvarRefeicao(Refeicao refeicao);
	
}