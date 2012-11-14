package br.com.starssource.cnjm.ejb;


import javax.annotation.Resource;
import javax.ejb.EJBContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import br.com.starssource.common.utils.log.Logger;

@Stateless(name = "GenericBean", mappedName = "GenericBean")
@TransactionManagement(TransactionManagementType.BEAN)
public class GenericBean {

	private final static Logger log = new Logger("CNJMEjb", "GenericBean");

	@PersistenceContext(unitName = "CJNMEntity")
	protected EntityManager em;

	@Resource
	private EJBContext context;

	@Resource
	private UserTransaction utx = context.getUserTransaction();

	public Boolean salvar(Object objeto) {
		log.setMetodo("Salvar");
		log.trace("Salvando Objeto: " + objeto.getClass().getName().toString());
		try {
			utx.begin();
			em.persist(objeto);
			utx.commit();
			log.debug("Objeto Salvo");
			return true;
		} catch (Exception e) {
			try {
				utx.rollback();
			} catch (IllegalStateException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SystemException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			log.error("Objeto Com erro", e);
			return false;
		} finally {
			em.clear();
			log.trace("EntityManager Clean: "
					+ objeto.getClass().getName().toString());
		}

	}
}
