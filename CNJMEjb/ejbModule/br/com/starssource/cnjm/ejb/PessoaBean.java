package br.com.starssource.cnjm.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.starssource.cnjm.entidade.Pessoa;

@Stateless(name = "PessoaBean", mappedName = "PessoaBean") 
public class PessoaBean {

	@PersistenceContext(unitName="CJNMEntity")
	protected EntityManager em;

	public Boolean salvar(Pessoa pessoa) {
		try {
			// userTransaction.begin();
			em.persist(pessoa);
			// userTransaction.commit();
			return true;
		} catch (Exception e) {
			// userTransaction.rollback();
			e.printStackTrace();
			return false;
		} finally {
			// emf.close();
		}

	}
}
