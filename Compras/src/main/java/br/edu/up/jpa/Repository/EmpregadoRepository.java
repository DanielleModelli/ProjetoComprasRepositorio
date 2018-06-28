package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.Empregado;

public interface EmpregadoRepository extends JpaRepository
<Empregado, String> {	
}
