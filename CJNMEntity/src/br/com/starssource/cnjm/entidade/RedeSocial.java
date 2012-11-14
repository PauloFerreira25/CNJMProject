package br.com.starssource.cnjm.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity implementation class for Entity: RedeSocial
 * 
 */

@Inheritance(strategy = InheritanceType.JOINED)
@XmlRootElement(name = "RedeSocial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "redeSocial", propOrder = { "id", "nome", "url" })
@Entity
public class RedeSocial implements Serializable {

	private static final long serialVersionUID = 1L;
	/* TODO Melhorar rede social */

	@XmlElement(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@XmlElement(name = "nome")
	@Column
	private String nome;
	
	@XmlElement(name = "url")
	@Column
	private String url;

	public RedeSocial() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
