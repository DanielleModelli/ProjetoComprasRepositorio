package br.edu.up.jpa.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "fornecedor_produto")
public class Fornecedor_Produto {
	@Id
    @GeneratedValue
	private Long EmpresaId;
	@Column
	private String Fornecedor;
	@Column
	private Long ProdutoId;
	@Column
	private Float Preco;
	
	@OneToMany(mappedBy = "fornecedor_produto", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Produto> produto = new ArrayList<>();

    public Fornecedor_Produto (String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    protected Fornecedor_Produto() {
    }
	
	public Long getEmpresaid() {
		return EmpresaId;
	}
	public void setEmpresaid(Long empresaid) {
		EmpresaId = empresaid;
	}
	public String getFornecedor() {
		return Fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		Fornecedor = fornecedor;
	}
	public Long getProdutoid() {
		return ProdutoId;
	}
	public void setProdutoid(Long produtoid) {
		ProdutoId = produtoid;
	}
	public Float getPreco() {
		return Preco;
	}
	public void setPreco(Float preco) {
		Preco = preco;
	}

      @Override
      public String toString() {
    return "Fornecedor_produto{" + "EmpresaId=" + EmpresaId + ", Fornecedor='" + Fornecedor + '\'' + ", ProdutoId=" + ProdutoId + ",Preco=" + Preco + '}';
}
}
