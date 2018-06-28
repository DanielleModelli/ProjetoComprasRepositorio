package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="Purchasing", name = "fornecedor")
public class Fornecedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "entidadecomercialid")
	private Integer EntidadeComercialID ;

	@Column(name = "numerocont")
	private String NumeroCont; 
	
	@Column(name = "nome")
	private String Nome;
	
	@Column(name = "creditrating")
	private Integer ClassificacaoCredito;
	
	@Column(name = "statusfornecedor")
	private boolean StatusFornecedor;
	
	@Column(name = "activeflag")
	private boolean ActiveFlag;
	
	@Column(name = "webserviceurlcompras")
	private String WebServiceURLCompras;
	
	@Column(name = "datamodificacao")
	private Date DataModificacao;

	public Integer getEntidadeComercialID() {
		return EntidadeComercialID;
	}

	public void setEntidadeComercialID(Integer entidadeComercialID) {
		EntidadeComercialID = entidadeComercialID;
	}

	public String getNumeroCont() {
		return NumeroCont;
	}

	public void setNumeroCont(String numeroCont) {
		NumeroCont = numeroCont;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Integer getClassificacaoCredito() {
		return ClassificacaoCredito;
	}

	public void setClassificacaoCredito(Integer classificacaoCredito) {
		ClassificacaoCredito = classificacaoCredito;
	}

	public boolean isStatusFornecedor() {
		return StatusFornecedor;
	}

	public void setStatusFornecedor(boolean statusFornecedor) {
		StatusFornecedor = statusFornecedor;
	}

	public boolean isActiveFlag() {
		return ActiveFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		ActiveFlag = activeFlag;
	}

	public String getWebServiceURLCompras() {
		return WebServiceURLCompras;
	}

	public void setWebServiceURLCompras(String webServiceURLCompras) {
		WebServiceURLCompras = webServiceURLCompras;
	}

	public Date getDataModificacao() {
		return DataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}

}

