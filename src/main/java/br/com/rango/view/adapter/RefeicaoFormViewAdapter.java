package br.com.rango.view.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.rango.model.Refeicao;
import br.com.rango.view.RefeicaoFormView;

@Component
public class RefeicaoFormViewAdapter {
	public Refeicao adaptToModel(RefeicaoFormView form) {
		Refeicao ref = new Refeicao();
		ref.setNome(form.getNomeRefeicao());
		ref.setValor(form.getValorRefeicao());
		ref.setMetodoPagamento(form.getMetodoPagamento());
		ref.setEntidade("Andromeda");
		return ref;
	}
	
	public RefeicaoFormView adaptToFormView(Refeicao ref) {
		RefeicaoFormView form = new RefeicaoFormView();
		form.setNomeRefeicao(ref.getNome());
		form.setValorRefeicao(ref.getValor());
		form.setMetodoPagamento(ref.getMetodoPagamento());
		form.setEntidade("Andromeda");
		return form;
	}
	
	public List<RefeicaoFormView> adaptToFormView(List<Refeicao> listRefeicoes) {
		List<RefeicaoFormView> listFormView = new ArrayList<RefeicaoFormView>();
		for (Refeicao refeicao : listRefeicoes) {
			listFormView.add(adaptToFormView(refeicao));
		}
		return listFormView;
	}
}
