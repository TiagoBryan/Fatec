/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilhaencadeada;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class PilhaEncadeada {   
    
    class No {
    int numero;
    No proximo;
    
    public No(int numero){
        this.numero = numero;
        this.proximo = null;
    }
    
}
    
    
    No topo;

    public PilhaEncadeada(){ 
        this.topo = null;
    }
    
    public boolean PilhaVazia(){
         return topo == null;
    }
    
    
    public void Empilha(int n){
         No numero = new No(n);
         numero.proximo = topo;
         topo = numero;
    
    }
    
    public int Desempilha(){  

        if (PilhaVazia()) {
            System.out.println("Pilha vazia");
            return -1;
        }
        int valor = topo.numero;
        topo = topo.proximo;
        return valor;
      
    }
    
    public void Mostra(){
        No atual = topo;
        while (atual != null) {
            System.out.println("Empilhado: " + atual.numero);
            atual = atual.proximo;
        }
    
    }
}