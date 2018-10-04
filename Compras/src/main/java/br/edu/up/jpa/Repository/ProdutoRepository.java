package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.up.jpa.Dominio.Produto;

public interface ProdutoRepository extends JpaRepository
<Produto, String> {	
}
