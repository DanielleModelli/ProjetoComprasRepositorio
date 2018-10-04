package br.edu.up.jpa.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.jpa.Dominio.Produto;
import br.edu.up.jpa.Repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {	
	
	@Autowired
	private ProdutoRepository repository;
			
	@GetMapping("/listar")
	public @ResponseBody Iterable<Produto> listaProduto() {
		Iterable<Produto> listaProduto = repository.findAll();
		return listaProduto;
	}
		
}