package br.com.starssource.cnjm.mbean;

import javax.naming.InitialContext;

import br.com.starssource.cnjm.ejb.PessoaBean;
import br.com.starssource.cnjm.entidade.Pessoa;

public class PessoaMB {

	private PessoaBean pessoaBean;
	private InitialContext ini;

	public Boolean incluir(Pessoa pessoa) {

		try {
			Pessoa a = new Pessoa();
			a = pessoa;
			ini = new InitialContext();
			pessoaBean = (PessoaBean) ini.lookup("java:global/CNJM/CNJMEjb/PessoaBean");
			pessoaBean.salvar(a);
			pessoaBean = null;
			ini.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		
	}

}
