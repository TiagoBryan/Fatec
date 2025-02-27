/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minhasegundaed;

/**
 *
 * @author FATEC ZONA LESTE
 */

    
public class MinhaSegundaED {

  private String[] nomes = new String[26];  
  public int total_nomes = 0;  

  // Método para obter o índice de um nome com base na primeira letra
  public int getIndice(String nome) {
    ilegalArgument(nome);

    char primeiraLetra = nome.toUpperCase().charAt(0);
    return primeiraLetra - 'A'; 
  }
  
  public void ilegalArgument(String nome){
      if (nome == null || nome.isEmpty()) {
      throw new IllegalArgumentException("Nome não pode ser vazio");
    }
  }

  // Método para adicionar um nome à posição correta no vetor
  public void adiciona(String nome) {
      ilegalArgument(nome);
   
    int posicao = getIndice(nome);
    
    // Verifica se a posição está ocupada
    if (!posicaoOcupada(posicao)) {
      nomes[posicao] = nome;  
      total_nomes++;  
    }
  }

  // Verifica se a posição já está ocupada
  private boolean posicaoOcupada(int posicao) {
    return nomes[posicao] != null;  
  }

  // Verifica se a posição é válida (dentro dos limites do vetor)
  private boolean posicaoValida(int posicao) {
    return posicao >= 0 && posicao < nomes.length;  
  }

  // Método para remover um nome
  public void remove(String nome) {
    int posicao = getIndice(nome);
    
   
    if (posicaoValida(posicao) && nomes[posicao] != null && nomes[posicao].equals(nome)) {
      nomes[posicao] = null;  
      total_nomes--; 
    }
  }

  // Verifica se um nome está presente na estrutura
  public boolean contem(String nome) {
    int posicao = getIndice(nome);
    return nomes[posicao] != null && nomes[posicao].equals(nome);  
  }

  // Retorna o nome na posição especificada (0 a 25)
  public String getNome(int posicao) {
    if (posicaoValida(posicao)) {
      return nomes[posicao]; 
    }
    return null;  
  }

  // Retorna o total de nomes armazenados
  public int totalNomes() {
    return total_nomes;  
  }
}

    

