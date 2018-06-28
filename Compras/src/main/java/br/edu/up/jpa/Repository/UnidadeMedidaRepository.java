package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.UnidadeMedida;


public interface UnidadeMedidaRepository extends JpaRepository
<UnidadeMedida, String> {	
}
