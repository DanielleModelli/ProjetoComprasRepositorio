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

import br.edu.up.jpa.Dominio.AWBuildVersion;
import br.edu.up.jpa.Repository.AWBuildVersionRepository;

@RestController
@RequestMapping("/AWBuildVersion")
public interface AWBuildVersionResource {	
	
	@Autowired
	private AWBuildVersionRepository repository;
	
	@PostMapping()
	public AWBuildVersion postAWBuildVersion(@RequestBody @Valid AWBuildVersion aWBuildVersion) {
		return repository.save(aWBuildVersion);
	}
	
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<AWBuildVersion> listaAWBuildVersion() {
		Iterable<AWBuildVersion> listaAWBuildVersion = repository.findAll();
		return listaAWBuildVersion;
	}
	
	@DeleteMapping()
	public AWBuildVersion deleteaAWBuildVersion(@RequestBody AWBuildVersion aWBuildVersion) {
		repository.delete(aWBuildVersion);
		return aWBuildVersion;
	}
}
