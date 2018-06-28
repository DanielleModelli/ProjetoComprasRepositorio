
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

import br.edu.up.jpa.Dominio.Fornecedor;
import br.edu.up.jpa.Repository.FornecedorRepository;



@RestController
@RequestMapping("/Fornecedor")
public class FornecedorResource {	
	
	@Autowired
	private FornecedorRepository repository;
	
	@PostMapping()
	public Fornecedor postFornecedor(@RequestBody @Valid Fornecedor fornecedor) {
		return repository.save(fornecedor);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Fornecedor> listaFornecedor() {
		Iterable<Fornecedor> listaFornecedor = repository.findAll();
		return listaFornecedor;
	}
	
	@DeleteMapping()
	public Fornecedor deletaFornecedor(@RequestBody Fornecedor fornecedor) {
		repository.delete(fornecedor);
		return fornecedor;
	}
}
