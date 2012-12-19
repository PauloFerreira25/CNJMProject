package br.com.starssource.cnjm.webservice;

import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.starssource.cnjm.ejb.GenericBean;
import br.com.starssource.cnjm.entidade.Pessoa;
import br.com.starssource.common.utils.log.Logger;

@WebService(name = "PessoaWS", serviceName = "PessoaWS", targetNamespace = "http://starssource.com.br/CNJMWebService/PessoaWS")
public class PessoaWS {
	private final static Logger log = new Logger("CNJMwebService", "PessoaWS");
	@EJB
	private GenericBean ejb;
	
	@WebResult(name = "return")
	@WebMethod(operationName = "addPessoa")
	public Boolean addPessoa(@WebParam(name = "pessoa") Pessoa pessoa) {
		log.setMetodo("addPessoa");
		log.debug("Adcionar Pessoa");
		
		try {
			return ejb.salvar(pessoa);
		} catch (Exception e) {
			log.error("Erro no insert de pessoa", e);
			return false;
		}

	}
}
