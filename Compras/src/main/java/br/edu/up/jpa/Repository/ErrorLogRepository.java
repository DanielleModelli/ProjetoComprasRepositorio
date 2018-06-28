package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.ErrorLog;

public interface ErrorLogRepository extends JpaRepository
<ErrorLog, String> {	
}
