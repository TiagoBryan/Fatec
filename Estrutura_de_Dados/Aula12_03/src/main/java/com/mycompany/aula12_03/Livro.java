/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12_03;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Livro {
    private String nome;
    private int ano;
    private Double preco;
    private Livro anterior; 

    
    public Livro(String nome, int ano, Double preco) {
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
        this.anterior = null;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Livro getAnterior() {
        return anterior;
    }

    public void setAnterior(Livro anterior) {
        this.anterior = anterior;
    }
}
