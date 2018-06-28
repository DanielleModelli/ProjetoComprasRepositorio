package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.CabecalhoOrdemCompra;
import br.edu.up.jpa.Dominio.MetodoEntrega;


public interface MetodoEntregaRepository extends JpaRepository
<MetodoEntrega, String> {	
}
