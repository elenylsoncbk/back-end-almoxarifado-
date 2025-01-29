package com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.service;
import com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.models.Produtos;
import com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutosService {

    @Autowired
    private ProdutosRepository produtosRepository;

    public Produtos salvar(Produtos produtos){
        return produtosRepository.save(produtos);
    }
    public List<Produtos> listar(){

        return produtosRepository.findAll();
    }
    public Produtos obterPorId(Integer id){
        return produtosRepository.findById(id).orElseThrow();
    }
    public void deletar(Integer id){
        produtosRepository.deleteById(id);
    }
    public Produtos editar(Integer id,Produtos produtos){
        Produtos produtosAEditar = produtosRepository.findById(id).get();
        if (produtosAEditar != null){
           produtosAEditar.setNome(produtos.getNome());
           produtosAEditar.setPreco(produtos.getPreco());
           produtosAEditar.setQuantidade(produtos.getQuantidade());
           produtosAEditar.setFornecedor(produtos.getFornecedor());
           produtosAEditar.setDescription(produtos.getDescription());
           produtosAEditar.setStatus(produtos.getStatus());
           produtosRepository.save(produtosAEditar);
        }else{
            throw new RuntimeException("Produto não encontrada");
        }
        return produtosAEditar;
    }


}
