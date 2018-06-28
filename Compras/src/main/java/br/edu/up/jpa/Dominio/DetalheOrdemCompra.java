package br.edu.up.jpa.Dominio;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(schema="Purchasing", name = "DetalheOrdemCompra")
public class DetalheOrdemCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrdemCompraID")
	private Integer IdOrdemCompra ;

	@Column(name = "DetalheOrdemCompraID")
	private Integer IdDetalheOrdemCompra; 
	
	@Column(name = "DataVencimento")
	private Date DataVencimento;
	
	@Column(name = "OrderQty")
	private Integer QuantidadePedido;
	
	@Column(name = "ProdutoID")
	private Integer IdProduto;
	
	@Column(name = "UnitPrice")
	private String PrecoUnitario;
	
	@Column(name = "LineTotal")
	private String PrecoTotal;
	
	@Column(name = "ReceivedQty")
	private String QuantidadeRecebida;
	
	@Column(name = "RejectedQty")
	private String QuantidadeRejeitada;
	
	@Column(name = "StockedQty")
	private String QuantidadeEstocada;
	
	@Column(name = "DataModificacao")
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

	public Integer getQuantidadePedido() {
		return QuantidadePedido;
	}

	public void setQuantidadePedido(Integer quantidadePedido) {
		QuantidadePedido = quantidadePedido;
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