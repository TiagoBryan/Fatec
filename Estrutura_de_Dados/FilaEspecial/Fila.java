/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila;

/**
 *
 * @author TiaguinhoDaGoiaba
 */
public class Fila { 
    
    private Object[] objetos = new Object[10]; 
    public int totalDeObjetos = 0;
    int ultimo = 0;
    int primeiro = 0;
    
    public boolean cheio(){
        return totalDeObjetos == objetos.length;
    }
    
    public boolean vazio(){
        return totalDeObjetos == 0;
    }
    
    public Object ultimo(){
        return objetos[ultimo - 1];
    }
    
    public Object primeiro(){
        return objetos[primeiro];
    }
    
    public int tamanho(){
        return totalDeObjetos;
    }

    public void enfileira(Object objeto) { 
        if(!cheio()){
            if(ultimo == objetos.length){
                int i = 0;
                while(i < totalDeObjetos){
                   objetos[i] = objetos[primeiro + i];
                   i++;
                }
                primeiro = 0;
                objetos[i] = objeto;
                ultimo = i + 1;
                
            }else{
                objetos[ultimo] = objeto;  
                ultimo++;
            }
            
            totalDeObjetos++;
        }else{
            System.out.println("esta cheio");
        }
       
    } 

    public Object desenfileira(){ 
        Object objRetirado = null;
        if(!vazio()){
                objRetirado = primeiro();
                primeiro++;
                totalDeObjetos--;
        }else{
            System.out.println("Lista Vazia");
        }
        return objRetirado;
    }
    
    public void mostra(){
        for(int i = primeiro; i < ultimo; i++){ 
                System.out.println(objetos[i] + " | "); 
          } 
    }
} 
