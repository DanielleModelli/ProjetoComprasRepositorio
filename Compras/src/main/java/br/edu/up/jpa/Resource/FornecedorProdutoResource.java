
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

import br.edu.up.jpa.Dominio.FornecedorProduto;
import br.edu.up.jpa.Repository.FornecedorProdutoRepository;



@RestController
@RequestMapping("/FornecedorProduto")
public interface FornecedorProdutoResource {	
	
	@Autowired
	private FornecedorProdutoRepository repository;
	
	@PostMapping()
	public FornecedorProduto postFornecedorProduto(@RequestBody @Valid FornecedorProduto fornecedorProduto) {
		return repository.save(fornecedorProduto);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<FornecedorProduto> listaFornecedorProduto() {
		Iterable<FornecedorProduto> listaFornecedorProduto = repository.findAll();
		return listaFornecedorProduto;
	}
	
	@DeleteMapping()
	public FornecedorProduto deletaFornecedorProduto(@RequestBody FornecedorProduto fornecedorProduto) {
		repository.delete(fornecedorProduto);
		return fornecedorProduto;
	}
}
