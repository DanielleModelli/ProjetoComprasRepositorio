package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="production", name = "unidademedida")
public class UnidadeMedida {
	
	@Id
	@Column(name = "unidademedidacod")
	private String UnidadeMedidaCod ;

	@Column(name = "nome")
	private String Nome; 
	
	@Column(name = "datamodificacao")
	private Date DataModificacao;

	public String getUnidadeMedidaCod() {
		return UnidadeMedidaCod;
	}

	public void setUnidadeMedidaCod(String unidadeMedidaCod) {
		UnidadeMedidaCod = unidadeMedidaCod;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Date getDataModificacao() {
		return DataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}
}