package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="purchasing", name = "cabecalhoordemcompra")
public class CabecalhoOrdemCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ordemcompraid")
	private Integer OrdemCompraID ;

	@Column(name = "numerorevisao")
	private String NumeroRevisao; 
	
	@Column(name = "status")
	private String Status;
	
	@Column(name = "empregadoid")
	private Integer IdEmpregado;
	
	@Column(name = "fornecedorid")
	private Integer IdFornecedor;
	
	@Column(name = "metodoentregaid")
	private Integer IdMetodoEntrega;
	
	@Column(name = "orderdate")
	private Date DataOrdem;
	
	@Column(name = "shipdate")
	private Date ShipDate;

	@Column(name = "subtotal")
	private String SubTotal; 
	
	@Column(name = "freight")
	private String Frete; 
	
	@Column(name = "totaldue")
	private String TotalDevido;
	
	@Column(name = "datamodificacao")
	private Date DataModificacao;

	public Integer getIdOrdemCompra() {
		return OrdemCompraID;
	}

	public void setIdOrdemCompra(Integer idOrdemCompra) {
		OrdemCompraID = idOrdemCompra;
	}

	public String getNumeroRevisao() {
		return NumeroRevisao;
	}

	public void setNumeroRevisao(String numeroRevisao) {
		NumeroRevisao = numeroRevisao;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Integer getIdEmpregado() {
		return IdEmpregado;
	}

	public void setIdEmpregado(Integer idEmpregado) {
		IdEmpregado = idEmpregado;
	}

	public Integer getIdFornecedor() {
		return IdFornecedor;
	}

	public void setIdFornecedor(Integer idFornecedor) {
		IdFornecedor = idFornecedor;
	}

	public Integer getIdMetodoEntrega() {
		return IdMetodoEntrega;
	}

	public void setIdMetodoEntrega(Integer idMetodoEntrega) {
		IdMetodoEntrega = idMetodoEntrega;
	}

	public Date getDataOrdem() {
		return DataOrdem;
	}

	public void setDataOrdem(Date dataOrdem) {
		DataOrdem = dataOrdem;
	}

	public Date getDataEntrega() {
		return ShipDate;
	}

	public void setDataEntrega(Date dataEntrega) {
		ShipDate = dataEntrega;
	}

	public String getSubTotal() {
		return SubTotal;
	}

	public void setSubTotal(String subTotal) {
		SubTotal = subTotal;
	}

	public String getFrete() {
		return Frete;
	}

	public void setFrete(String frete) {
		Frete = frete;
	}

	public String getTotalDevido() {
		return TotalDevido;
	}

	public void setTotalDevido(String totalDevido) {
		TotalDevido = totalDevido;
	}

	public Date getDataModificacao() {
		return DataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}

}