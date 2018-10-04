package br.edu.up.jpa.Resource;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.up.jpa.Dominio.CabecalhoOrdemCompra;
import br.edu.up.jpa.Dominio.DadosCompra;
import br.edu.up.jpa.Repository.CabecalhoOrdemCompraRepository;

@Service
@RestController
@Component
@RequestMapping("/cabecalhoOrdemCompra")
public class CabecalhoOrdemCompraResource {	
	
	@Autowired
	private CabecalhoOrdemCompraRepository repository;
	
	@PostMapping("/")
	public CabecalhoOrdemCompra postCabecalhoOrdemCompra(@RequestBody @Valid CabecalhoOrdemCompra cabecalhoOrdemCompra) {
		return repository.save(cabecalhoOrdemCompra);
	}
	
	//@PostMapping("/efetuarCompra")
	//public CabecalhoOrdemCompra postEfetuarCompra(@RequestBody DadosCompra dadosCompra) {
		//CabecalhoOrdemCompra cabecalho = new CabecalhoOrdemCompra();
		//Produto
		//cabecalho.setIdEmpregado(dadosCompra.getEmpregadoId());
		//return repository.save(cabecalho);
	//}
	
	@GetMapping("/listar")
	public @ResponseBody Iterable<CabecalhoOrdemCompra> listaCabecalhoOrdemCompra() {
		Iterable<CabecalhoOrdemCompra> listaCabecalhoOrdemCompra = repository.findAll();
		return listaCabecalhoOrdemCompra;
	}
	
	@DeleteMapping()
	//@ResquestMapping("/delete/{ordemcompraid}")
	public boolean deletaCabecalhoOrdemCompra(@PathVariable ("ordemcompraid") Integer ordemcompraid) {
		repository.deleteById(ordemcompraid);
		return true;
	}	
}