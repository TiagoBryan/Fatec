/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Main {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();

        System.err.println("Fila estpa vazia?" + pilha.estaVazia());//true

        //Empilhando elementos na pilha
        System.err.println("\nCOLOCANDO 3 ELEMENTOS NA PILHA:");
        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        pilha.mostrar();

        System.err.println("\nDESEMPILHANDO UM ELEMENTO:");
        pilha.desempilha();

        pilha.mostrar();

        System.err.println("\nVERIFICANDO SE A FILA ESTÁ CHEIA:");
        System.err.println(pilha.estaCheia());//false
    }
}