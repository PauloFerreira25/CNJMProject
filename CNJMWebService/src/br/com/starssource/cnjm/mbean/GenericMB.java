package br.com.starssource.cnjm.mbean;

import javax.naming.InitialContext;

import br.com.starssource.cnjm.ejb.GenericBean;

public class GenericMB {

	private GenericBean genericBean;
	private InitialContext ini;

	public Boolean incluir(Object objeto) {

		try {

			ini = new InitialContext();
			genericBean = (GenericBean) ini.lookup("java:global/CNJM/CNJMEjb/GenericBean");
			genericBean.salvar(objeto);
			genericBean = null;
			ini.close();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
