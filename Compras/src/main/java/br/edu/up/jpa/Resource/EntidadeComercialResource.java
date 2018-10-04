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

import br.edu.up.jpa.Dominio.EntidadeComercial;
import br.edu.up.jpa.Repository.EntidadeComercialRepository;



@RestController
@RequestMapping("/entidadeComercial")
public class EntidadeComercialResource {	
	
	@Autowired
	private EntidadeComercialRepository repository;
	
	@PostMapping()
	public EntidadeComercial postEntidadeComercial(@RequestBody @Valid EntidadeComercial entidadeComercial) {
		return repository.save(entidadeComercial);
	}
	
	@GetMapping("/listar")
	public @ResponseBody Iterable<EntidadeComercial> listaEntidadeComercial() {
		Iterable<EntidadeComercial> listaEntidadeComercial = repository.findAll();
		return listaEntidadeComercial;
	}
	
	@DeleteMapping()
	public EntidadeComercial deletaEntidadeComercial(@RequestBody EntidadeComercial entidadeComercial) {
		repository.delete(entidadeComercial);
		return entidadeComercial;
	}
}