package br.up.edu.jpa.dominio;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Fornecedor_Produto")
public class Fornecedor_Produto {
    @Id
    @GeneratedValue
    private Integer Empresaid;
    
    @Column
    private String Fornecedor;
    
    @Column
    private Integer Produtoid;
    
    @Column
    private Float Preco;
    
    

    @OneToMany(mappedBy = "Fornecedor_Produto", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Fornecedor_Produto > Fornecedor = new ArrayList<>();

    public Fornecedor_Produto(Integer Empresaid) {
        this.Empresaid = Empresaid;
    }

    protected Fornecedor_Produto() {
    }
    public String getFornecedor() {
        return Fornecedor ;
    }
    public Integer getProdutoid() {
        return Produtoid;
    }

    public Float getPreco() {
        return Preco;
    }
    public void setFornecedor(String Fornecedor ) {
        this.Fornecedor = Fornecedor;
    }
    public void setPreco(float preco) {
        this.Preco = Preco;
    }
    
    public void adicionarFornecedor(Fornecedor_Produto Fornecedor) {
        ((List<Fornecedor_Produto>) Fornecedor).add(Fornecedor);
    }

    @Override
    public String toString() {
        return Fornecedor_Produto ("Empresaid=" + Empresaid , "Fornecedor "+ fornecedor ,"Produtoid=" + Produtoid , "preco=" + Preco );
    }
}


