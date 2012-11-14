//package br.com.starssource.cnjm.mbean;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//
//import br.com.starssource.cnjm.ejb.PessoaBean;
//import br.com.starssource.cnjm.entidade.Pessoa;
//
//@ManagedBean
//@ViewScoped
//public class PessoaMB {
//
//	private Pessoa pessoa = new Pessoa();
//	private List<Pessoa> lstPessoa = new ArrayList<Pessoa>();
//	private PessoaBean pessoaBean;
//	private InitialContext ini;
//
//	private Boolean iniciaBean() {
//		try {
//			ini = new InitialContext();
//			pessoaBean = (PessoaBean) ini.lookup("java:module/PessoaBean");
//			return true;
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
//	}
//
//	private Boolean releaseBean() {
//		try {
//			pessoaBean = null;
//			ini.close();
//			pessoa = new Pessoa();
//			return true;
//		} catch (NamingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return false;
//		}
//
//	}
//
//	public String incluirPessoa() {
//
//		try {
//			this.iniciaBean();
//			pessoaBean.salvar(pessoa);
//			this.releaseBean();
//			this.listaPessoa();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//	public String editAction(Pessoa pessoa) {
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$a");
//		System.out.println(pessoa.getId());
//		System.out.println(pessoa.getNome());
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$b");
//		pessoaBean.atualizar(pessoa);
//		return null;
//	}
//
//	public String atualizarPessoa() {
//
//		try {
//			this.iniciaBean();
//			for (Pessoa pessoa : lstPessoa) {
//				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//				System.out.println(pessoa.getId());
//				System.out.println(pessoa.getNome());
//				pessoaBean.atualizar(pessoa);
//				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//			}
//			this.releaseBean();
//			this.listaPessoa();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//	public String excluirPessoa() {
//
//		try {
//			this.iniciaBean();
//			pessoaBean.deletar(this.getPessoa());
//			this.releaseBean();
//			this.listaPessoa();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return null;
//	}
//
//	private void listaPessoa() {
//		this.iniciaBean();
//		lstPessoa = pessoaBean.buscarPessoas();
//		this.releaseBean();
//	}
//
//	public Pessoa getPessoa() {
//		return pessoa;
//	}
//
//	public void setPessoa(Pessoa pessoa) {
//		this.pessoa = pessoa;
//	}
//
//	public List<Pessoa> getLstPessoa() {
//		this.listaPessoa();
//		System.out.println("####################1");
//		for (Pessoa pessoa : lstPessoa) {
//			System.out.println("####################2");
//			System.out.println(pessoa.getId());
//			System.out.println(pessoa.getNome());
//			System.out.println("####################");
//		}
//		return lstPessoa;
//	}
//
//	public void setLstPessoa(List<Pessoa> lstPessoa) {
//		this.lstPessoa = lstPessoa;
//
//	}
//
//}
