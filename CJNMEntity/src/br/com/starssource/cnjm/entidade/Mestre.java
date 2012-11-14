package br.com.starssource.cnjm.entidade;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Mestre
 * 
 */
@Entity
public class Mestre extends Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	public Mestre() {
		super();
	}

}
