package br.com.starssource.cnjm.entidade;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Entity implementation class for Entity: Jogador
 * 
 */
@Entity
@XmlRootElement(name = "Jogador")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "produto", propOrder = { "jogo", "personagens", "inicioJogarRPG" })
public class Jogador extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "jogo")
	@OneToMany(mappedBy = "jogo")
	private List<Jogador_Jogo> jogo;

	@XmlElement(name = "personagens")
	@OneToMany(mappedBy = "jogador", targetEntity = Personagem.class)
	private List<Personagem> personagens;
	
	@XmlElement(name = "inicioJogarRPG")
	@Column(nullable = false)
	@NotNull
	@Temporal(TemporalType.DATE)
	private Calendar inicioJogarRPG;

	public Jogador() {
		super();
	}

	public List<Personagem> getPersonagens() {
		return personagens;
	}

	public void setPersonagens(List<Personagem> personagens) {
		this.personagens = personagens;
	}

	public List<Jogador_Jogo> getJogo() {
		return jogo;
	}

	public void setJogo(List<Jogador_Jogo> jogo) {
		this.jogo = jogo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Calendar getInicioJogarRPG() {
		return inicioJogarRPG;
	}

	public void setInicioJogarRPG(Calendar inicioJogarRPG) {
		this.inicioJogarRPG = inicioJogarRPG;
	}

}
