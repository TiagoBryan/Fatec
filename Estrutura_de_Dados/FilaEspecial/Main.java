/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Main {
    public static void main(String[] args){
        Fila fila = new Fila();
        
        fila.enfileira("A");
        fila.enfileira("B");
        fila.enfileira("C");
        fila.enfileira("D");
        
        fila.mostra();
        
        System.out.println("----------");
        
        System.out.println("Elemento retirado: " + fila.desenfileira());
        fila.mostra();
        
        System.out.println("----------");
        
        System.out.println("Elemento retirado: " + fila.desenfileira());
        fila.mostra();
        
        System.out.println("----------");
        
        fila.enfileira("E");
        fila.enfileira("F");
        fila.enfileira("G");
        fila.enfileira("H");
        fila.enfileira("I");
        fila.enfileira("J");
        
        fila.mostra();
        
        System.out.println("----------");
        
        //Deve Deslocar
        fila.enfileira("K");
        fila.enfileira("L");
        
        fila.mostra();
        
        System.out.println("----------");
        
        //vetor cheio
        fila.enfileira("M");
        
        System.out.println("Primeiro elemento: " + fila.primeiro());
        System.out.println("Ultimo elemento: " + fila.ultimo());
        
        System.out.println("----------");
        
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        System.out.println("Elemento retirado: " + fila.desenfileira());
        fila.mostra();
        
    }
}
