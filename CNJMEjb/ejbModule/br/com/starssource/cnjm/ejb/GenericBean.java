package br.com.starssource.cnjm.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.starssource.common.utils.log.Logger;

@Stateless
public class GenericBean {

	private final static Logger log = new Logger("CNJMEjb", "GenericBean");

	@PersistenceContext(unitName = "CJNMEntity")
	protected EntityManager em;

	public Boolean salvar(Object objeto) {
		log.setMetodo("Salvar");
		log.trace("Salvando Objeto: " + objeto.getClass().getName().toString());
		try {
			em.persist(objeto);
			log.debug("Objeto Salvo");
			return true;
		} catch (Exception e) {
			log.error("Objeto Com erro", e);
			return false;
		}
	}
}
