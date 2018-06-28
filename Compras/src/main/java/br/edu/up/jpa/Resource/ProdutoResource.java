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

import br.edu.up.jpa.Dominio.Produto;
import br.edu.up.jpa.Repository.ProdutoRepository;



@RestController
@RequestMapping("/Produto")
public interface ProdutoResource {	
	
	@Autowired
	private ProdutoRepository repository;
	
	@PostMapping()
	public Produto postProduto(@RequestBody @Valid Produto produto) {
		return repository.save(produto);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<Produto> listaProduto() {
		Iterable<Produto> listaProduto = repository.findAll();
		return listaProduto;
	}
	
	@DeleteMapping()
	public Produto deletaProduto(@RequestBody Produto produto) {
		repository.delete(produto);
		return produto;
	}
}
