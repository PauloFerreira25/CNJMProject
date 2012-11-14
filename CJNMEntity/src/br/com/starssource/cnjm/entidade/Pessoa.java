package br.com.starssource.cnjm.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity implementation class for Entity: Pessoa
 * 
 */

@Inheritance(strategy = InheritanceType.JOINED)
@XmlRootElement(name = "Pessoa")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pessoa", propOrder = { "id", "nome", "email", "senha",
		"listaRedeSocial" })
@Entity
public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@XmlElement(name = "nome", required = true)
	@Column(nullable = false)
	private String nome;

	@XmlElement(name = "email", required = true)
	@Column(nullable = false)
	private String email;

	@XmlElement(name = "senha", required = true)
	@Column(nullable = false)
	private String senha;

	@XmlElement(name = "listaRedeSocial")
	@ManyToMany
	private List<RedeSocial> listaRedeSocial;

	public Pessoa() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public List<RedeSocial> getListaRedeSocial() {
		return listaRedeSocial;
	}

	public void setListaRedeSocial(List<RedeSocial> listaRedeSocial) {
		this.listaRedeSocial = listaRedeSocial;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}
}
