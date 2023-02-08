package br.com.tech4me.aula5crudpt1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.tech4me.aula5crudpt1.model.Produto;
import br.com.tech4me.aula5crudpt1.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    
    @Autowired
    private ProdutoService servico;
     //RETONA STATUS 202 ok
   @GetMapping
    public ResponseEntity<List<Produto>> obterTodos() {
        return new ResponseEntity<>(servico.obterTodos(), HttpStatus.OK);
   }
   
    //RETONA STATUS 201
    @PostMapping
    public ResponseEntity<Produto> criarProduto(@RequestBody Produto prod) {
        return new ResponseEntity<>(servico.criarProduto(prod), HttpStatus.CREATED);
    }

   
    
    //RETORNA STATUS 302
    @GetMapping(value="/{id}")
    public ResponseEntity<Produto> obterPorId(@PathVariable String id) {
        return new ResponseEntity<>(servico.obterProdutoPorId(id), HttpStatus.FOUND);
    }

    @PutMapping(value = "/{id}")
    public Produto ProdutoAtualizarProduto(@PathVariable String id, @RequestBody Produto produto){
        return servico.atualizarProduto(id, produto);
    }
   //RETORNA STATUS 204
   @DeleteMapping(value="/{id}")
    public ResponseEntity<String> deletarProduto(@PathVariable String id) {
        servico.deletarProduto(id);
        return new ResponseEntity<>("Item apagado com sucesso!", HttpStatus.OK);
    }

    @GetMapping("/contar")
    public long contarProdutos() {
        return servico.contar();
    } 

    
    

}