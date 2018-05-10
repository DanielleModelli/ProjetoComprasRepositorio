package br.edu.up.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.dominio.Fornecedor_Produto;


public interface Fornecedor_ProdutoRepository extends JpaRepository<Fornecedor_Produto, Integer> {
}
