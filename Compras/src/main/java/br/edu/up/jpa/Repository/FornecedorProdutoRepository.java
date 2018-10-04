package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.up.jpa.Dominio.FornecedorProduto;


public interface FornecedorProdutoRepository extends JpaRepository
<FornecedorProduto, String> {	
}
