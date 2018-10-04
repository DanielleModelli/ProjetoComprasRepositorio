package br.edu.up.jpa.Dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empregado")
public class Empregado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entidadecomercialid")
	private Integer EntidadeComercialID ;

	@Column(name = "numeroid")
	private String NumeroID;

	public Integer getEntidadeComercialID() {
		return EntidadeComercialID;
	}

	public void setEntidadeComercialID(Integer entidadeComercialID) {
		EntidadeComercialID = entidadeComercialID;
	}

	public String getNumeroID() {
		return NumeroID;
	}

	public void setNumeroID(String numeroID) {
		NumeroID = numeroID;
	} 
	
}