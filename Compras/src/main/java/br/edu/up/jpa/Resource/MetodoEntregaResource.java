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

import br.edu.up.jpa.Dominio.MetodoEntrega;
import br.edu.up.jpa.Repository.MetodoEntregaRepository;



@RestController
@RequestMapping("/MetodoEntrega")
public class MetodoEntregaResource {	
	
	@Autowired
	private MetodoEntregaRepository repository;
	
	@PostMapping()
	public MetodoEntrega postMetodoEntrega(@RequestBody @Valid MetodoEntrega metodoEntrega) {
		return repository.save(metodoEntrega);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<MetodoEntrega> listaMetodoEntrega() {
		Iterable<MetodoEntrega> listaMetodoEntrega = repository.findAll();
		return listaMetodoEntrega;
	}
	
	@DeleteMapping()
	public MetodoEntrega deletaMetodoEntrega(@RequestBody MetodoEntrega metodoEntrega) {
		repository.delete(metodoEntrega);
		return metodoEntrega;
	}
}
