package br.com.starssource.cnjm.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

/**
 * Entity implementation class for Entity: MesaJogo_Personagem
 * 
 */
@Entity
public class MesaJogo_Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	private MesaJogo mesaJogo;

	@ManyToOne
	private Personagem personagem;
	
	@Column(nullable = false)
	@NotNull
	private Boolean personagemAtivo = true;

	public MesaJogo_Personagem() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MesaJogo getMesaJogo() {
		return mesaJogo;
	}

	public void setMesaJogo(MesaJogo mesaJogo) {
		this.mesaJogo = mesaJogo;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public Boolean getPersonagemAtivo() {
		return personagemAtivo;
	}

	public void setPersonagemAtivo(Boolean personagemAtivo) {
		this.personagemAtivo = personagemAtivo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
