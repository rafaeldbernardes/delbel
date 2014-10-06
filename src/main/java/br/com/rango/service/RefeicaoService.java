package br.com.rango.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rango.dao.RefeicaoDAO;
import br.com.rango.model.Refeicao;

import com.googlecode.genericdao.search.Search;

@Service
@Transactional
public class RefeicaoService {
	@Autowired private RefeicaoDAO refeicaoDAOImpl;
	
	public void salvarRefeicao(Refeicao ref) {
		refeicaoDAOImpl.salvarRefeicao(ref);
	}
	
	public List<Refeicao> buscarRefeicaoPorNome(String nomeRefeicao) {
		Search search = new Search();
		List<Refeicao> refeicoes = new ArrayList<Refeicao>();
		search.addFilterEqual("nome", nomeRefeicao );
		if(nomeRefeicao.isEmpty()) {
			refeicoes = refeicaoDAOImpl.findAll();
		} else {
			refeicoes = refeicaoDAOImpl.search(search);
		}
		return refeicoes;
	}
	
}
