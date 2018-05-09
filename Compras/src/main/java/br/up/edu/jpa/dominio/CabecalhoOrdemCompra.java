package br.up.edu.jpa.dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseOrderHeader")
public class CabecalhoOrdemCompra {

	@Id
	@GeneratedValue
	private Integer IdCabecalhoOrdemCompra ;

	@Column
	private String NumeroRevisao; 
	
	@Column 
	private String Status;
	
	@Embedded
	@OneToOne 
	private Integer IdEmpregado;
	
	@Embedded
	@OneToMany 
	private Integer IdFornecedor;
	
	@Embedded
	@OneToOne 
	private Integer IdMetodoEntrega;
	
	@Column 
	private Date DataOrdem;
	
	@Column 
	private Date DataEntrega;

	@Column
	private String SubTotal; 
	
	@Column
	private String Frete; 
	
	@Column
	private String TotalDevido;
	
	@Column
	private Date DataAlteracao;

	public Integer getIdCabecalhoOrdemCompra() {
		return IdCabecalhoOrdemCompra;
	}

	public void setIdCabecalhoOrdemCompra(Integer idCabecalhoOrdemCompra) {
		IdCabecalhoOrdemCompra = idCabecalhoOrdemCompra;
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

	public Date getDataAlteracao() {
		return DataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		DataAlteracao = dataAlteracao;
	} 
		
}
