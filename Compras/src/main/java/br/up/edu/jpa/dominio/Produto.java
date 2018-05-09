package br.up.edu.jpa.dominio;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "produto ")
public class Produto {
    @Id
    @GeneratedValue
    private Integer produtoId;

    @Column
    private String Nome;

    @Column
    private Integer Numero;

    @Embedded
    private Fornecedor_produto Fornecedor;

    @OneToOne
    private List<Fornecedor_produto> Fornecedor = new ArrayList<>();

    public Produto (Fornecedor_produto Fornecedor, String Nome, Integer Numero) {
        this.Fornecedor_produto = Fornecedor;
        this.Nome  = Nome ;
        this.Numero = Numero;
        Fornecedor_produto = new ArrayList<>();
    }

    protected Produto() {
    }

    public Integer getProdutoId() {
        return ProdutoId;
    }

    public nome getNome() {
        return Nome;
    }
    public numero getNumero() {
    	return Numero;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public List<Fornecedor_produto> getFornecedor() {
        return Fornecedor  ;
    }

    @Override
    public String toString() {
        return "Produto {" + "ProdutoId=" + ProdutoId + ", " + "nome =" + Nome + ", Num_Produto=" + Numero +
                "}\n";
    }
}

