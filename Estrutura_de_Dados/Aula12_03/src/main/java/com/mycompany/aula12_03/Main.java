/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12_03;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {
    public static void main(String[] args) {
        Lista listaLivros = new Lista();

        Livro livro1 = new Livro("Livro A", 2020, 39.90);
        Livro livro2 = new Livro("Livro B", 2018, 29.90);
        Livro livro3 = new Livro("Livro C", 2022, 49.90);

        // Adicionando livros na lista
        listaLivros.adiciona(livro1);
        listaLivros.adiciona(livro2);
        listaLivros.adiciona(livro3);

        // Listando livros
        System.out.println("Lista de Livros:");
        listaLivros.listarLivros();

        // Removendo um livro
        listaLivros.remove();

        System.out.println("\nLista de Livros após remoção:");
        listaLivros.listarLivros();
    }
}
