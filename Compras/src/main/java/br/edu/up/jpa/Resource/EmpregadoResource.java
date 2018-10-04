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

import br.edu.up.jpa.Dominio.Empregado;
import br.edu.up.jpa.Repository.EmpregadoRepository;



@RestController
@RequestMapping("/empregado")
public class EmpregadoResource {	
	
	@Autowired
	private EmpregadoRepository repository;
	
	@PostMapping("/")
	public Empregado postEmpregado(@RequestBody @Valid Empregado empregado) {
		return repository.save(empregado);
	}
	
	@GetMapping("/listar")
	public @ResponseBody Iterable<Empregado> listaEmpregado() {
		Iterable<Empregado> listaEmpregado = repository.findAll();
		return listaEmpregado;
	}
	
	@DeleteMapping()
	public Empregado deletaEmpregado(@RequestBody Empregado empregado) {
		repository.delete(empregado);
		return empregado;
	}
}