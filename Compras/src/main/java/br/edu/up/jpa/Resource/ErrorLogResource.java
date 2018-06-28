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

import br.edu.up.jpa.Dominio.ErrorLog;
import br.edu.up.jpa.Repository.ErrorLogRepository;



@RestController
@RequestMapping("/ErrorLog")
public interface ErrorLogResource {	
	
	@Autowired
	private ErrorLogRepository repository;
	
	@PostMapping()
	public ErrorLog postErrorLog(@RequestBody @Valid ErrorLog errorLog) {
		return repository.save(errorLog);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<ErrorLog> listaErrorLog() {
		Iterable<ErrorLog> listaErrorLog = repository.findAll();
		return listaErrorLog;
	}
	
	@DeleteMapping()
	public ErrorLog deletaErrorLog(@RequestBody ErrorLog errorLog) {
		repository.delete(errorLog);
		return errorLog;
	}
}
