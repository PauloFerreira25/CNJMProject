package br.com.starssource.cnjm.entidade;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Teste
 *
 */
@Entity

public class Teste implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar startDate;

	public Teste() {
		super();
	}
   
}
