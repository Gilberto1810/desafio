package br.com.tech4me.aula5crudpt1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.aula5crudpt1.model.Produto;
import br.com.tech4me.aula5crudpt1.repository.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoRepository repositorio;

    @Override
    public Produto criarProduto(Produto produto) {
        return repositorio.save(produto);
    }

    @Override
    public List<Produto> obterTodos() {
        return repositorio.findAll();
    }

    @Override
    public Produto obterProdutoPorId(String id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Produto atualizarProduto(String id, Produto produto) {
        produto.setId(id);
        return repositorio.save(produto);

    }

    @Override
    public void deletarProduto(String id) {        
        repositorio.deleteById(id);
                
    }

    @Override
    public long contar() {
        return repositorio.count();
    } 
    
        
}
