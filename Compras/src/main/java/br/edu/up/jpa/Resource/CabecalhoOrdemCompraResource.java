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

import br.edu.up.jpa.Dominio.CabecalhoOrdemCompra;
import br.edu.up.jpa.Repository.CabecalhoOrdemCompraRepository;



@RestController
@RequestMapping("/CabecalhoOrdemCompra")
public interface CabecalhoOrdemCompraResource {	
	
	@Autowired
	private CabecalhoOrdemCompraRepository repository;
	
	@PostMapping()
	public CabecalhoOrdemCompra postCabecalhoOrdemCompra(@RequestBody @Valid CabecalhoOrdemCompra cabecalhoOrdemCompra) {
		return repository.save(cabecalhoOrdemCompra);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<CabecalhoOrdemCompra> listaCabecalhoOrdemCompra() {
		Iterable<CabecalhoOrdemCompra> listaCabecalhoOrdemCompra = repository.findAll();
		return listaCabecalhoOrdemCompra;
	}
	
	@DeleteMapping()
	public CabecalhoOrdemCompra deletaCabecalhoOrdemCompra(@RequestBody CabecalhoOrdemCompra cabecalhoOrdemCompra) {
		repository.delete(cabecalhoOrdemCompra);
		return cabecalhoOrdemCompra;
	}
}
