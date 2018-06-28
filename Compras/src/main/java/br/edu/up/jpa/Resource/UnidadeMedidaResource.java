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

import br.edu.up.jpa.Dominio.UnidadeMedida;
import br.edu.up.jpa.Repository.UnidadeMedidaRepository;



@RestController
@RequestMapping("/UnidadeMedida")
public class UnidadeMedidaResource {	
	
	@Autowired
	private UnidadeMedidaRepository repository;
			
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<UnidadeMedida> listaUnidadeMedida() {
		Iterable<UnidadeMedida> listaUnidadeMedida = repository.findAll();
		return listaUnidadeMedida;
	}
	
	
}
