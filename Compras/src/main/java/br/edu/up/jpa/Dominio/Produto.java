package br.edu.up.jpa.Dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="production", name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "produtoid")
	private Integer ProdutoID ;

	@Column(name = "nome")
	private String Nome; 
	
	@Column(name = "produtonum")
	private String ProdutoNum;

	public Integer getProdutoID() {
		return ProdutoID;
	}

	public void setProdutoID(Integer produtoID) {
		ProdutoID = produtoID;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getProdutoNum() {
		return ProdutoNum;
	}

	public void setProdutoNum(String produtoNum) {
		ProdutoNum = produtoNum;
	}
	
}