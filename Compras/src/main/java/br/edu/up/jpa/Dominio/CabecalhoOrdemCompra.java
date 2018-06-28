package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="Purchasing", name = "CabecalhoOrdemCompra")
public class CabecalhoOrdemCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrdemCompraID")
	private Integer IdOrdemCompra ;

	@Column(name = "NumeroRevisao")
	private String NumeroRevisao; 
	
	@Column(name = "Status")
	private String Status;
	
	@Column(name = "EmpregadoID")
	private Integer IdEmpregado;
	
	@Column(name = "FornecedorID")
	private Integer IdFornecedor;
	
	@Column(name = "MetodoEntregaID")
	private Integer IdMetodoEntrega;
	
	@Column(name = "OrderDate")
	private Date DataOrdem;
	
	@Column(name = "ShipDate")
	private Date DataEntrega;

	@Column(name = "SubTotal")
	private String SubTotal; 
	
	@Column(name = "Freight")
	private String Frete; 
	
	@Column(name = "TotalDue")
	private String TotalDevido;
	
	@Column(name = "DataModificacao")
	private Date DataModificacao;

	public Integer getIdOrdemCompra() {
		return IdOrdemCompra;
	}

	public void setIdOrdemCompra(Integer idOrdemCompra) {
		IdOrdemCompra = idOrdemCompra;
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
		return DataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		DataEntrega = dataEntrega;
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