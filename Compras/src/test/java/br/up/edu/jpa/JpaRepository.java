
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.up.jpa.dominio.Fornecedor_Produto;
import br.edu.up.jpa.repository.Fornecedor_ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExemploJpaRepository {
    @Autowired
    private Fornecedor_ProdutoRepository fornecedor_produtoRepository;
    
    @Test
    public void rodarMetodosJpa() {

    	fornecedor_produtoRepository.save(new Fornecedor_Produto("empresa 01"));
    	fornecedor_produtoRepository.flush();
    	fornecedor_produtoRepository.saveAndFlush(new Fornecedor_Produto("empresa 02"));
    	fornecedor_produtoRepository.save(new Fornecedor_Produto("empresa 03"));

        System.out.println("\n*************3 fornecedores *************");
        fornecedor_produtoRepository.findAll().forEach(System.out::println);

        fornecedor_produtoRepository.deleteInBatch(fornecedor_produtoRepository.findAll().subList(0,1));

        System.out.println("\n*************1 fornecedor*************");
        fornecedor_produtoRepository.findAll().forEach(System.out::println);
        fornecedor_produtoRepository.deleteAllInBatch();
        System.out.println("\n*************Nenhum fornecedor*************");
        fornecedor_produtoRepository.findAll().forEach(System.out::println);

    }
    
    @Before
    @After
    public void banner() {
        System.out.println("\n\n----------------------------------------------------------------\n");
    }
}

	
	

}

