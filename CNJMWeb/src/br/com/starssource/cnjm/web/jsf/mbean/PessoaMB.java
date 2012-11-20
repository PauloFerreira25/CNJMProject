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
	transient int nid = 0;
	transient Boolean editable = false;
	private static final ArrayList<Pessoa> pessoaList = new ArrayList<Pessoa>();

	public ArrayList<Pessoa> getPessoaList() {
		return pessoaList;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public Boolean getEditable() {
		return editable;
	}

	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static ArrayList<Pessoa> getPessoalist() {
		return pessoaList;
	}

	public String saveAction(Pessoa pessoa) {
		this.setEditable(false);
		System.out.println(pessoa.getNome());
		return null;

	}

	public String editAction(Pessoa pessoa) {
		this.setEditable(true);
		return null;
	}

	public String addAction() {
		final Pessoa pessoa = new Pessoa();
		pessoa.setNome(this.getNome());
		pessoa.setSenha(this.getSenha());
		pessoa.setEmail(this.getEmail());
		pessoaList.add(pessoa);
		return null;
	}

	public String deleteAction(Pessoa pessoa) {
		pessoaList.remove(pessoa);
		return null;
	}

}