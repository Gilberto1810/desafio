package br.com.tech4me.aula5crudpt1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.aula5crudpt1.model.Produto;


public interface ProdutoRepository extends MongoRepository<Produto, String> {

    
    //ressalva:
    //insert > save
    //find > findAll
    //métodos vão mudar de nome aqui dentro da nossa aplicação
    //porém, vão continuar fazendo a mesma coisa que faziam dentro do Mongo
    //findByBlablabla
    //@Query()
}
