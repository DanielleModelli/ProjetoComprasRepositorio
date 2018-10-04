package br.edu.up.jpa.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
			
	@GetMapping("/listar")
	public @ResponseBody Iterable<UnidadeMedida> listaUnidadeMedida() {
		Iterable<UnidadeMedida> listaUnidadeMedida = repository.findAll();
		return listaUnidadeMedida;
	}
}
