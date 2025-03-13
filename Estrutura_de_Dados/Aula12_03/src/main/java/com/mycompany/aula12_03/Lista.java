/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12_03;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Lista {
    private Livro cabeca;  
    private Livro anterior;
    
    public Lista() {
        this.cabeca = null;
    }

  
    public void adiciona(Livro livro) {
        if (cabeca == null) {
            cabeca = livro;
        } else {
            livro.setAnterior(cabeca);
            cabeca = livro;
        }
    }

    
    public void remove() {
        if (cabeca != null) {
            cabeca = cabeca.getAnterior();
        }
    }

    
    public Livro getCabeca() {
        return cabeca;
    }

  
    public void listarLivros() {
        Livro atual = cabeca;
        while (atual != null) {
            System.out.println("Nome: " + atual.getNome());
            System.out.println("Ano: " + atual.getAno());
            System.out.println("Preço: R$ " + atual.getPreco());
            System.out.println("-----------------------");
            atual = atual.getAnterior();
        }
    }
}
