package br.up.edu.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.edu.up.projeto.dominio.Produto;
import com.edu.up.projeto.dominio.Fornecedor_Produto;
import com.edu.up.projeto.repository.ProdutoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CrudRepository {


    @Autowired
    ProdutoRepository produtoRepository;

    
    @Test
    public void Crud() {
        
    	produtoRepository.save(new Produto("0010","Pedal","industria01")));
    	produtoRepository.save(new Produto("0011","Guidao","industria02")));
    	produtoRepository.save(new Produto("0012","Roda","fabrica01")));
    	produtoRepository.save(new Produto("0013","Correia","fabrica02")));

        System.out.println("\n*************Todos os produtos *************");
        produtoRepository.findAll().forEach(System.out::println);

        
        produtoRepository.findAll().forEach(produto -> {
            produto.setNome_Produto(produto.getNome_Produto());
            produtoRepository.save(produto);
        });

        System.out.println("\n*************Produtos alterados*************");
        produtoRepository.findAll().forEach(System.out::println);

//        produtoRepository.deleteAll();
//        System.out.println("\n*************produtos  excluidos*************");
//        produtoRepository.findAll().forEach(System.out::println);

    }


}
