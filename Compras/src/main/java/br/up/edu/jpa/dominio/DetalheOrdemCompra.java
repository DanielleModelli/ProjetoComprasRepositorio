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
@Table(name = "PurchaseOrderDetail")
public class DetalheOrdemCompra {

	@Id
	@GeneratedValue
	private Integer IdOrdemCompra ;

	@Embedded
	@OneToOne
	private Integer IdDetalheOrdemCompra; 
	
	@Column 
	private Date DataVencimento;
	
	@Embedded
	@OneToMany 
	private Integer IdProduto;
	
	@Column 
	private String PrecoUnitario;
	
	@Column 
	private String PrecoTotal;
	
	@Column 
	private String QuantidadeRecebida;
	
	@Column
	private String QuantidadeRejeitada;
	
	@Column 
	private String QuantidadeEstocada;
	
	@Column 
	private Date DataAlteracao;

	public Integer getIdOrdemCompra() {
		return IdOrdemCompra;
	}

	public void setIdOrdemCompra(Integer idOrdemCompra) {
		IdOrdemCompra = idOrdemCompra;
	}

	public Integer getIdDetalheOrdemCompra() {
		return IdDetalheOrdemCompra;
	}

	public void setIdDetalheOrdemCompra(Integer idDetalheOrdemCompra) {
		IdDetalheOrdemCompra = idDetalheOrdemCompra;
	}

	public Date getDataVencimento() {
		return DataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		DataVencimento = dataVencimento;
	}

	public Integer getIdProduto() {
		return IdProduto;
	}

	public void setIdProduto(Integer idProduto) {
		IdProduto = idProduto;
	}

	public String getPrecoUnitario() {
		return PrecoUnitario;
	}

	public void setPrecoUnitario(String precoUnitario) {
		PrecoUnitario = precoUnitario;
	}

	public String getPrecoTotal() {
		return PrecoTotal;
	}

	public void setPrecoTotal(String precoTotal) {
		PrecoTotal = precoTotal;
	}

	public String getQuantidadeRecebida() {
		return QuantidadeRecebida;
	}

	public void setQuantidadeRecebida(String quantidadeRecebida) {
		QuantidadeRecebida = quantidadeRecebida;
	}

	public String getQuantidadeRejeitada() {
		return QuantidadeRejeitada;
	}

	public void setQuantidadeRejeitada(String quantidadeRejeitada) {
		QuantidadeRejeitada = quantidadeRejeitada;
	}

	public String getQuantidadeEstocada() {
		return QuantidadeEstocada;
	}

	public void setQuantidadeEstocada(String quantidadeEstocada) {
		QuantidadeEstocada = quantidadeEstocada;
	}

	public Date getDataAlteracao() {
		return DataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		DataAlteracao = dataAlteracao;
	} 
	
}