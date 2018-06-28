package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="Purchasing", name = "MetodoEntrega")
public class MetodoEntrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MetodoEntregaID")
	private Integer MetodoEntregaID ;

	@Column(name = "Nome")
	private String Nome; 
	
	@Column(name = "ShipBase")
	private Double ShipBase;
	
	@Column(name = "ShipRate")
	private Double ShipRate;
	
	@Column(name = "rowguid")
	private String rowguid;
			
	@Column(name = "DataModificacao")
	private Date DataModificacao;

	public Integer getMetodoEntregaID() {
		return MetodoEntregaID;
	}

	public void setMetodoEntregaID(Integer metodoEntregaID) {
		MetodoEntregaID = metodoEntregaID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Double getShipBase() {
		return ShipBase;
	}

	public void setShipBase(Double shipBase) {
		ShipBase = shipBase;
	}

	public Double getShipRate() {
		return ShipRate;
	}

	public void setShipRate(Double shipRate) {
		ShipRate = shipRate;
	}

	public String getRowguid() {
		return rowguid;
	}

	public void setRowguid(String rowguid) {
		this.rowguid = rowguid;
	}

	public Date getDataModificacao() {
		return DataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}
}
