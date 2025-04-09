/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhaencadeada;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Main {
    public static void main(String[] args){
        PilhaEncadeada pilha = new PilhaEncadeada();
        
        pilha.Empilha(1); 
        pilha.Empilha(2); 
        pilha.Empilha(3); 
        pilha.Empilha(4); 
        pilha.Empilha(5); 
        
        System.out.println("----------");
        
        pilha.Mostra();
        
        System.out.println("----------");
        
        System.out.println("Numero retirado: " + pilha.Desempilha());
        System.out.println("Numero retirado: " + pilha.Desempilha());
        
        pilha.Mostra();
        
    }
}

