package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entidadecomercial")
public class EntidadeComercial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "businessentityid")
	private Integer BusinessEntityID ;

	@Column(name = "rowguid")
	private String NumeroID;

	@Column(name = "datamodificacao")
	private Date DataAlteracao;
	
	public Integer getBusinessEntitylID() {
		return BusinessEntityID;
	}
	
	public void setBusinessEntityID(Integer businessEntityID) {
		BusinessEntityID = businessEntityID;
	}

	public String getNumeroID() {
		return NumeroID;
	}

	public void setNumeroID(String numeroID) {
		NumeroID = numeroID;
	} 
	

	public Date getDataAlteracao() {
		return DataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		DataAlteracao = dataAlteracao;
	}
}