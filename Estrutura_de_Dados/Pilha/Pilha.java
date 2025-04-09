/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
import javax.swing.JOptionPane;

public class Pilha {
    int inicio;
    int topo = -1;
    int tamanho;
    int qtdeElementos = 0;
    int p[];

    public Pilha() {
        inicio = -1;
        tamanho = 10;
        p = new int[tamanho];
        qtdeElementos = 0;
    }

    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia(){
        if(qtdeElementos == tamanho){
            return true;
        }
        return false;
    }

    public void empilha(int e){
        if (!estaCheia()){
            if (inicio == -1){
                inicio = 0;
            }
            topo++;
            p[topo] = e;
            qtdeElementos++;

        }
    }

    public int desempilha(){
        int x = 0;
        if(!estaVazia()){
            x = p[topo];
            topo--;
            qtdeElementos--;

        }
        return x;
    } 

    public void mostrar(){
        String elementos = "";
        for(int i=topo;i>=0;i--){
            elementos += p[i] + " | ";
        }
        JOptionPane.showMessageDialog(null, elementos);
    }

}
