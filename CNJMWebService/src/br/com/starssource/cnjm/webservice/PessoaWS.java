package br.com.starssource.cnjm.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.starssource.cnjm.entidade.Pessoa;
import br.com.starssource.cnjm.mbean.GenericMB;
import br.com.starssource.common.utils.log.Logger;

@WebService(name = "PessoaWS", serviceName = "PessoaWS", targetNamespace = "http://starssource.com.br/CNJMwebService/PessoaWS")
public class PessoaWS {
	private final static Logger log = new Logger("CNJMwebService", "PessoaWS");

	@WebResult(name = "return")
	@WebMethod(operationName = "addPessoa")
	public Boolean addPessoa(@WebParam(name = "pessoa") Pessoa pessoa) {
		log.setMetodo("addPessoa");
		log.debug("Adcionar Pessoa");
		try {
			GenericMB a = new GenericMB();
			return a.incluir(pessoa);
		} catch (Exception e) {
			log.error("Erro no insert de pessoa", e);
			return false;
		}

	}
//asdasd
	//asdasd
	//asdasd
}
