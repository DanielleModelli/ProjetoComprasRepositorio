package br.up.edu.jpa;


import java.sql.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.edu.up.jpa.Dominio.CabecalhoOrdemCompra;
import br.edu.up.jpa.Dominio.DetalheOrdemCompra;
import br.edu.up.jpa.Dominio.Empregado;
import br.edu.up.jpa.Dominio.EntidadeComercial;
import br.edu.up.jpa.Dominio.Fornecedor;
import br.edu.up.jpa.Dominio.FornecedorProduto;
import br.edu.up.jpa.Dominio.MetodoEntrega;
import br.edu.up.jpa.Dominio.Produto;
import br.edu.up.jpa.Dominio.UnidadeMedida;
import br.edu.up.jpa.Repository.CabecalhoOrdemCompraRepository;
import br.edu.up.jpa.Repository.DetalheOrdemCompraRepository;
import br.edu.up.jpa.Repository.EmpregadoRepository;
import br.edu.up.jpa.Repository.EntidadeComercialRepository;
import br.edu.up.jpa.Repository.FornecedorProdutoRepository;
import br.edu.up.jpa.Repository.FornecedorRepository;
import br.edu.up.jpa.Repository.MetodoEntregaRepository;
import br.edu.up.jpa.Repository.ProdutoRepository;
import br.edu.up.jpa.Repository.UnidadeMedidaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ComprasApplicationTests.class)
public class CrudCompraTest {

	@Autowired
	private CabecalhoOrdemCompraRepository cabecalhoOrdemCompraRepository;
	@Autowired
	private DetalheOrdemCompraRepository detalheOrdemCompraRepository; 
	@Autowired
	private EmpregadoRepository empregadoRepository;
	@Autowired
	private EntidadeComercialRepository entidadeComercialRepository;
	@Autowired
	private FornecedorProdutoRepository fornecedorProdutoRepository;
	@Autowired
	private FornecedorRepository fornecedorRepository;
	@Autowired
	private MetodoEntregaRepository metodoEntregaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private UnidadeMedidaRepository unidadeMedidaRepository;
	
	@Test
	public void Teste() {
		
		CabecalhoOrdemCompra cabecalhoOrdemCompra = new CabecalhoOrdemCompra(); 
		DetalheOrdemCompra detalheOrdemCompra = new DetalheOrdemCompra();
		Empregado empregado = new Empregado();
		EntidadeComercial entidadeComercial = new EntidadeComercial();
		FornecedorProduto fornecedorProduto = new FornecedorProduto();
		Fornecedor fornecedor = new Fornecedor();
		MetodoEntrega metodoEntrega = new MetodoEntrega();
		Produto produto = new Produto();
		UnidadeMedida unidadeMedida = new UnidadeMedida();
		Date data = new Date(System.currentTimeMillis());

		cabecalhoOrdemCompra.setNumeroRevisao(55);
		cabecalhoOrdemCompra.setStatus(1);
		cabecalhoOrdemCompra.setIdEmpregado(3);
		cabecalhoOrdemCompra.setIdFornecedor(5);
		cabecalhoOrdemCompra.setIdMetodoEntrega(2);
		cabecalhoOrdemCompra.setDataOrdem(data);
		cabecalhoOrdemCompra.setDataEntrega(data);
		cabecalhoOrdemCompra.setSubTotal("270.0");
		cabecalhoOrdemCompra.setFrete("22.0");
		cabecalhoOrdemCompra.setTotalDevido("292.0");
		cabecalhoOrdemCompra.setDataModificacao(data);
		
		detalheOrdemCompra.setIdDetalheOrdemCompra(2);
		detalheOrdemCompra.setDataVencimento(data);
		detalheOrdemCompra.setQuantidadePedido(23);
		detalheOrdemCompra.setIdProduto(4);
		detalheOrdemCompra.setPrecoUnitario("22");
		detalheOrdemCompra.setPrecoTotal("100");
		detalheOrdemCompra.setQuantidadeRecebida("2");
		detalheOrdemCompra.setQuantidadeRejeitada("23");
		detalheOrdemCompra.setQuantidadeEstocada("200");
		detalheOrdemCompra.setDataAlteracao(data);
		
		empregado.setNumeroID("345423");
		empregado.setEntidadeComercialID(3);
		
		entidadeComercial.setNumeroID("3121");
		entidadeComercial.setDataAlteracao(data);
		
		fornecedorProduto.setTempoMedio(12);
		fornecedorProduto.setPrecoPadrao(34.2);
		fornecedorProduto.setUltimoCusto(50.2);
		fornecedorProduto.setUltimaData(data);
		fornecedorProduto.setQuantMinima(2);
		fornecedorProduto.setQuantMaxima(10);
		fornecedorProduto.setNaOrdem(2);
		fornecedorProduto.setUnidadeMedidaCod("CTN");
		fornecedorProduto.setDataModificacao(data);
		
		fornecedor.setNumeroCont("AUSTRALI0001");
		fornecedor.setNome("Australia");
		fornecedor.setClassificacaoCredito(2);
		fornecedor.setStatusFornecedor(true);
		fornecedor.setActiveFlag(false);
		fornecedor.setWebServiceURLCompras(null);
		fornecedor.setDataModificacao(data);
		
		metodoEntrega.setNome("LALALA");
		metodoEntrega.setShipBase(23.1);
		metodoEntrega.setShipRate(0.99);
		metodoEntrega.setRowguid("6BE756D9-D7BE-4463-8F2C-AE60C710D606");
		metodoEntrega.setDataModificacao(data);
		
		produto.setNome("Freewheel");
		produto.setProdutoNum("FH-2981");
		
		unidadeMedida.setUnidadeMedidaCod("CAN");
		unidadeMedida.setNome("Canister");
		unidadeMedida.setDataModificacao(data);
		
		cabecalhoOrdemCompraRepository.save(cabecalhoOrdemCompra);
		detalheOrdemCompraRepository.save(detalheOrdemCompra);
		empregadoRepository.save(empregado);
		entidadeComercialRepository.save(entidadeComercial);
		fornecedorProdutoRepository.save(fornecedorProduto);
		fornecedorRepository.save(fornecedor);
		metodoEntregaRepository.save(metodoEntrega);
		produtoRepository.save(produto);
		unidadeMedidaRepository.save(unidadeMedida);
		
		//Integer teste = cabecalhoOrdemCompra.getStatus();		
		//System.out.println("Lista de ordens de compra");
		
		cabecalhoOrdemCompraRepository.findAll().forEach(System.out::println);
		detalheOrdemCompraRepository.findAll().forEach(System.out::println);
		empregadoRepository.findAll().forEach(System.out::println);
		entidadeComercialRepository.findAll().forEach(System.out::println);
		fornecedorProdutoRepository.findAll().forEach(System.out::println);
		fornecedorRepository.findAll().forEach(System.out::println);
		metodoEntregaRepository.findAll().forEach(System.out::println);
		produtoRepository.findAll().forEach(System.out::println);
		
		//Integer compraid = 2; 
		//CabecalhoOrdemCompra compra = cabecalhoOrdemCompraRepository.findById(compraid);
		//cabecalhoOrdemCompraRepository.deleteById(compra);
	}
}