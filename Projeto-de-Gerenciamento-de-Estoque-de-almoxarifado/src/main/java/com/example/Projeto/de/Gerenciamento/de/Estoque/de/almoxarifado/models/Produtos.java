package com.example.Projeto.de.Gerenciamento.de.Estoque.de.almoxarifado.models;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String nome;

    private String status;

    @DecimalMin(value = "0.5")
    private Double preco;

    @Min(1)
    private Integer quantidade;


    private String fornecedor;


    private String description;

    public Produtos(){

    }

    public Produtos(Integer id, String nome, String status, Double preco, Integer quantidade, String fornecedor, String description) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.preco = preco;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.description = description;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public @NotBlank String getNome() {
        return nome;
    }

    public void setNome(@NotBlank String nome) {
        this.nome = nome;
    }

    public @DecimalMin(value = "0.5") Double getPreco() {
        return preco;
    }

    public void setPreco(@DecimalMin(value = "0.5") Double preco) {
        this.preco = preco;
    }

    public @Min(1) Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(@Min(1) Integer quantidade) {
        this.quantidade = quantidade;
    }

    public @NotBlank String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(@NotBlank String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public @NotBlank String getDescription() {
        return description;
    }

    public void setDescription(@NotBlank String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
