package br.com.starssource.cnjm.entidade;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: MesaJogo
 * 
 */
@Entity
public class MesaJogo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "mesaJogo")
	private List<MesaJogo_Personagem> listaPersonages;

	public MesaJogo() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<MesaJogo_Personagem> getListaPersonages() {
		return listaPersonages;
	}

	public void setListaPersonages(List<MesaJogo_Personagem> listaPersonages) {
		this.listaPersonages = listaPersonages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
