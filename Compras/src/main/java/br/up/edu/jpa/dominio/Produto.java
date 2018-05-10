package br.edu.up.jpa.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "produto")
public class Produto {
	@Id
    @GeneratedValue
    private Long id;
	@Column
	private String nome;
	@Column
	private Integer numero;
	
	@Embedded
    private Fornecedor_Produto fornecedor_produto;

    @OneToMany
    private List<Produto> produto = new ArrayList<>();

    public Produto(Fornecedor_Produto  fornecedor_produto, String nome, Integer numero){
        this.fornecedor_produto = fornecedor_produto;
        this.nome = nome;
        this.numero = numero;
        produto = new ArrayList<>();
    }

    protected Produto() {
    }
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
@Override
public String toString() {
    return "Produto{" + "id=" + id+ ", " + fornecedor_produto + ", nome=" + nome +
            ", numero=" + numero + "}\n";
}
}
