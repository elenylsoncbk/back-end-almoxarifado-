package com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.repository;
import com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutosRepository extends JpaRepository<Produtos,Integer> {
}
