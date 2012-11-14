package br.com.starssource.cnjm.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlElement;

/**
 * Entity implementation class for Entity: Personagem
 * 
 */
@Entity
public class Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@XmlElement(name = "nome")
	@Column(nullable = false)
	private String nome;

	@XmlElement(name = "idade")
	@Column
	private Integer idade;

	@ManyToOne
	@JoinColumn(name = "jogador_id", nullable = false)
	private Jogador jogador;

	@OneToOne
	private Jogo jogo;

	@OneToMany(mappedBy = "personagem")
	private List<MesaJogo_Personagem> listaDeMesas;

	public Personagem() {
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public List<MesaJogo_Personagem> getListaDeMesas() {
		return listaDeMesas;
	}

	public void setListaDeMesas(List<MesaJogo_Personagem> listaDeMesas) {
		this.listaDeMesas = listaDeMesas;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
