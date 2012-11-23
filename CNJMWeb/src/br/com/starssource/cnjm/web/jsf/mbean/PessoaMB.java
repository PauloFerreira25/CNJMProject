package br.com.starssource.cnjm.web.jsf.mbean;

import java.io.Serializable;
import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.starssource.cnjm.entidade.Pessoa;

@ManagedBean(name = "pessoa")
@ViewScoped
public class PessoaMB extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getlista() {
		return lista;
	}

	public int getNlista() {
		return lista.size();
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String saveAction(Pessoa pessoa) {
		pessoa.setEditable(false);
		System.out.println(pessoa.getNome());
		return null;

	}

	public String editAction(Pessoa pessoa) {
		pessoa.setEditable(true);
		return null;
	}

	public String addAction() {
		final Pessoa pessoa = new Pessoa();
		pessoa.setNome(this.getNome());
		pessoa.setSenha(this.getSenha());
		pessoa.setEmail(this.getEmail());
		lista.add(pessoa);
		return null;
	}

	public String deleteAction(Pessoa pessoa) {
		lista.remove(pessoa);
		return null;
	}

}