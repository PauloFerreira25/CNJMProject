package br.com.starssource.cnjm.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.starssource.cnjm.entidade.Pessoa;

@Stateless(name = "GenericBean", mappedName = "GenericBean") 
public class GenericBean {

	@PersistenceContext(unitName="CJNMEntity")
	protected EntityManager em;

	public Boolean salvar(Object objeto) {
		try {
			// userTransaction.begin();
			em.persist(objeto);
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
