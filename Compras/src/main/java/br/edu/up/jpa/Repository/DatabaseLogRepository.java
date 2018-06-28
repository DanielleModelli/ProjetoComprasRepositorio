package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.DatabaseLog;

public interface DatabaseLogRepository extends JpaRepository
<DatabaseLog, String> {	
}
