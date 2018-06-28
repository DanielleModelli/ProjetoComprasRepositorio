package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.EntidadeComercial;

public interface EntidadeComercialRepository extends JpaRepository
<EntidadeComercial, String> {	
}
