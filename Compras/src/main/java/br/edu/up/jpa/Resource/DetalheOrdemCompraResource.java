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

import br.edu.up.jpa.Dominio.DetalheOrdemCompra;
import br.edu.up.jpa.Repository.DetalheOrdemCompraRepository;



@RestController
@RequestMapping("/DetalheOrdemCompra")
public interface DetalheOrdemCompraResource {	
	
	@Autowired
	private DetalheOrdemCompraRepository repository;
	
	@PostMapping()
	public DetalheOrdemCompra postDetalheOrdemCompra(@RequestBody @Valid DetalheOrdemCompra detalheOrdemCompra) {
		return repository.save(detalheOrdemCompra);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<DetalheOrdemCompra> listaDetalheOrdemCompra() {
		Iterable<DetalheOrdemCompra> listaDetalheOrdemCompra = repository.findAll();
		return listaDetalheOrdemCompra;
	}
	
	@DeleteMapping()
	public DetalheOrdemCompra deletaDetalheOrdemCompra(@RequestBody DetalheOrdemCompra detalheOrdemCompra) {
		repository.delete(detalheOrdemCompra);
		return detalheOrdemCompra;
	}
}
