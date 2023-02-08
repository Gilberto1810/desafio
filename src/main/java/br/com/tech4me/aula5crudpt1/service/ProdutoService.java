package br.com.tech4me.aula5crudpt1.service;

import java.util.List;

import br.com.tech4me.aula5crudpt1.model.Produto;

public interface ProdutoService {
    Produto criarProduto(Produto produto);
    List<Produto> obterTodos();
    //localizar por id 
    Produto obterProdutoPorId(String id);   
    //atualizar
    Produto atualizarProduto(String id, Produto produto);
    //deletar   
    void deletarProduto(String id);  
    //contar
    long contar();
   
}