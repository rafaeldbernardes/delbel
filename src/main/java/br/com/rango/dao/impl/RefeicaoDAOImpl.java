package br.com.rango.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.rango.dao.RefeicaoDAO;
import br.com.rango.model.Refeicao;

import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;

@Repository
public class RefeicaoDAOImpl extends GenericDAOImpl<Refeicao, Long> implements RefeicaoDAO{
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}
	
	public void salvarRefeicao(Refeicao refeicao) {
		save(refeicao);
	}
}
