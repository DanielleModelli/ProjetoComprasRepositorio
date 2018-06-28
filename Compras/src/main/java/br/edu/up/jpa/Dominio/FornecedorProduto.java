package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="purchasing", name = "fornecedorprodutos")
public class FornecedorProduto {

	@Id
	@Column(name = "productid")
	private Integer ProductID ;
	
	@Column(name = "businessentityid")
	private Integer BusinessEntityID ;

	@Column(name = "tempomedio")
	private Integer TempoMedio; 
	
	@Column(name = "precopadrao")
	private Double PrecoPadrao;
	
	@Column(name = "ultimocusto")
	private Double UltimoCusto;
	
	@Column(name = "ultimadata")
	private Date UltimaData;
	
	@Column(name = "quantminima")
	private Integer QuantMinima;
	
	@Column(name = "quantmaxima")
	private Integer QuantMaxima;
	
	@Column(name = "naordem")
	private Integer NaOrdem;
	
	@Column(name = "unidademedidacod")
	private String UnidadeMedidaCod;
	
	@Column(name = "datamodificacao")
	private Date DataModificacao;

	public Integer getProductID() {
		return ProductID;
	}

	public void setProductID(Integer productID) {
		ProductID = productID;
	}

	public Integer getBusinessEntityID() {
		return BusinessEntityID;
	}

	public void setBusinessEntityID(Integer businessEntityID) {
		BusinessEntityID = businessEntityID;
	}

	public Integer getTempoMedio() {
		return TempoMedio;
	}

	public void setTempoMedio(Integer tempoMedio) {
		TempoMedio = tempoMedio;
	}

	public Double getPrecoPadrao() {
		return PrecoPadrao;
	}

	public void setPrecoPadrao(Double precoPadrao) {
		PrecoPadrao = precoPadrao;
	}

	public Double getUltimoCusto() {
		return UltimoCusto;
	}

	public void setUltimoCusto(Double ultimoCusto) {
		UltimoCusto = ultimoCusto;
	}

	public Date getUltimaData() {
		return UltimaData;
	}

	public void setUltimaData(Date ultimaData) {
		UltimaData = ultimaData;
	}

	public Integer getQuantMinima() {
		return QuantMinima;
	}

	public void setQuantMinima(Integer quantMinima) {
		QuantMinima = quantMinima;
	}

	public Integer getQuantMaxima() {
		return QuantMaxima;
	}

	public void setQuantMaxima(Integer quantMaxima) {
		QuantMaxima = quantMaxima;
	}

	public Integer getNaOrdem() {
		return NaOrdem;
	}

	public void setNaOrdem(Integer naOrdem) {
		NaOrdem = naOrdem;
	}

	public String getUnidadeMedidaCod() {
		return UnidadeMedidaCod;
	}

	public void setUnidadeMedidaCod(String unidadeMedidaCod) {
		UnidadeMedidaCod = unidadeMedidaCod;
	}

	public Date getDataModificacao() {
		return DataModificacao;
	}

	public void setDataModificacao(Date dataModificacao) {
		DataModificacao = dataModificacao;
	}
	
}