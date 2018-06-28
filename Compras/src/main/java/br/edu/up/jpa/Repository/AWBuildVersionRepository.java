package br.edu.up.jpa.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.up.jpa.Dominio.AWBuildVersion;


public interface AWBuildVersionRepository extends JpaRepository
<AWBuildVersion, String> {	
}
