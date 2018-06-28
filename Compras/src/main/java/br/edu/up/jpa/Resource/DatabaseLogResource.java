package br.edu.up.jpa.Resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.jpa.Dominio.DatabaseLog;
import br.edu.up.jpa.Repository.DatabaseLogRepository;



@RestController
@RequestMapping("/DatabaseLog")
public interface DatabaseLogResource {	
	
	@Autowired
	private DatabaseLogRepository repository;
	
	@PostMapping()
	public DatabaseLog postDatabaseLog(@RequestBody @Valid DatabaseLog databaseLog) {
		return repository.save(databaseLog);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<DatabaseLog> listaDatabaseLog() {
		Iterable<DatabaseLog> listaDatabaseLog = repository.findAll();
		return listaDatabaseLog;
	}
	
	@DeleteMapping()
	public DatabaseLog deletaDatabaseLoga(@RequestBody DatabaseLog databaseLog) {
		repository.delete(databaseLog);
		return databaseLog;
	}
}
