package br.edu.up.jpa.Dominio;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="Purchasing", name = "FornecedorProdutos")
public class FornecedorProduto {

	@Id
	@Column(name = "ProductID")
	private Integer ProductID ;
	
	@Column(name = "BusinessEntityID")
	private Integer BusinessEntityID ;

	@Column(name = "TempoMedio")
	private Integer TempoMedio; 
	
	@Column(name = "PrecoPadrao")
	private Double PrecoPadrao;
	
	@Column(name = "UltimoCusto")
	private Double UltimoCusto;
	
	@Column(name = "UltimaData")
	private Date UltimaData;
	
	@Column(name = "QuantMinima")
	private Integer QuantMinima;
	
	@Column(name = "QuantMixima")
	private Integer QuantMixima;
	
	@Column(name = "NaOrdem")
	private Integer NaOrdem;
	
	@Column(name = "UnidadeMedidaCod")
	private String UnidadeMedidaCod;
	
	@Column(name = "DataModificacao")
	private Date DataModificacao;
	
}