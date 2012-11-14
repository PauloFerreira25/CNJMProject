//package br.com.starssource.buscapreco.produto;
//
//import java.util.ArrayList;
//
//import javax.jws.WebResult;
//import javax.jws.WebService;
//import javax.xml.bind.annotation.XmlElement;
//
//import br.com.starssource.buscapreco.common.produto.CaracteristicaVO;
//import br.com.starssource.buscapreco.common.produto.PrecoRegistroVO;
//import br.com.starssource.buscapreco.common.produto.ProdutoBuscaRefazer;
//import br.com.starssource.buscapreco.common.produto.ProdutoCadastroRefazer;
//import br.com.starssource.buscapreco.common.produto.ProdutoVO;
//import br.com.starsssource.common.utils.log.Logger;
//
//@WebService(name = "ProdutoWS", serviceName = "ProdutoWS", targetNamespace = "http://starssource.com.br/BuscaPrecoWebService/ProdutoWS")
//public class ProdutoWSRefazer {
//    private static Logger log = new Logger("BuscaPrecoWS", "ProdutosWS");
//    private ProdutoBuscaRefazer prodBusca = new ProdutoBuscaRefazer();
//    private ProdutoCadastroRefazer prodCadastro = new ProdutoCadastroRefazer();
//
//    // ADD
//    @WebResult(name = "return")
//    public Boolean addProduto(
//	    @XmlElement(name = "produto", required = true) ProdutoVO produto) {
//	log.setMetodo("addProduto");
//	log.debug("Adcionar Produto");
//	return this.prodCadastro.save(produto);
//    }
//
//    @WebResult(name = "return")
//    public Boolean addPreco(
//	    @XmlElement(name = "barCode", required = true) int barCode,
//	    @XmlElement(name = "preco", required = true) PrecoRegistroVO preco) {
//	log.setMetodo("addPreco");
//	log.debug("Adcionar Preco");
//	return this.prodCadastro.addPreco(barCode, preco);
//    }
//
//    @WebResult(name = "return")
//    public Boolean addCaracteristica(
//	    @XmlElement(name = "barCode", required = true) int barCode,
//	    @XmlElement(name = "caracteristica", required = true) CaracteristicaVO caracteristica) {
//	log.setMetodo("addCaracteristica");
//	log.debug("Adcionar Caracteristica");
//	return this.prodCadastro.addCaracteristica(barCode, caracteristica);
//    }
//
//    // UPDATE
//
//    @WebResult(name = "return")
//    public Boolean updateProduto(
//	    @XmlElement(name = "barCode", required = true) int barCode,
//	    @XmlElement(name = "campo", required = true) String campo,
//	    @XmlElement(name = "valor", required = true) Object valor) {
//	log.setMetodo("updateProduto");
//	log.debug("Atualiza produto");
//	return this.prodCadastro.update(barCode, campo, valor);
//    }
//
//    @WebResult(name = "return")
//    public Boolean updateCaracteristica(
//	    @XmlElement(name = "barCode", required = true) int barCode,
//	    @XmlElement(name = "valor", required = true) CaracteristicaVO caracteristica) {
//	log.setMetodo("updateProduto");
//	log.debug("Atualiza produto");
//	return this.prodCadastro.update(barCode, caracteristica);
//    }
//
//    // BUSCA
//    @WebResult(name = "produto")
//    public ArrayList<ProdutoVO> searchProdutoNome(
//	    @XmlElement(name = "nome", required = true) String nome) {
//	log.setMetodo("searchProdutoNome");
//	log.debug("Buscar Produto Por Nome: " + nome);
//	if (this.prodBusca.busca(nome) != null) {
//	    return this.prodBusca.busca(nome);
//	} else {
//	    return null;
//	}
//    }
//
//    @WebResult(name = "produto")
//    public ArrayList<ProdutoVO> searchProdutoBarCode(
//	    @XmlElement(name = "barcode", required = true) int barCode) {
//	log.setMetodo("searchProdutoBarCode");
//	log.debug("Buscar Produto Por barCode: " + barCode);
//	if (this.prodBusca.busca(barCode) != null) {
//	    return this.prodBusca.busca(barCode);
//	} else {
//	    return null;
//	}
//    }
//
//    @WebResult(name = "produto")
//    public ArrayList<ProdutoVO> searchProdutoCaracteristica(
//	    @XmlElement(name = "barcode", required = true) CaracteristicaVO caracteristicas) {
//	log.setMetodo("searchProdutoCaracteristica");
//	log.debug("Buscar Produto Por Caracteristica: "
//		+ caracteristicas.toString());
//	return this.prodBusca.busca(caracteristicas);
//    }
//}
