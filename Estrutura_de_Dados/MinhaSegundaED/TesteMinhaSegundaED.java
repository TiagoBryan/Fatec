/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minhasegundaed;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class TesteMinhaSegundaED {
    

  public static void main(String[] args) {
    
    MinhaSegundaED ed = new MinhaSegundaED();

    // Testando a operação 'adiciona'
    System.out.println("Adicionando nomes...");
    ed.adiciona("Ana");
    ed.adiciona("Beatriz");
    ed.adiciona("Carlos");
    ed.adiciona("Daniela");

    // Verificando se os nomes foram corretamente adicionados
    System.out.println("Total de nomes armazenados: " + ed.totalNomes());
    System.out.println("Nome na posição 0: " + ed.getNome(0)); 
    System.out.println("Nome na posição 1: " + ed.getNome(1)); 
    System.out.println("Nome na posição 2: " + ed.getNome(2));
    System.out.println("Nome na posição 3: " + ed.getNome(3)); 

    // Testando a operação 'contem'
    System.out.println("\nVerificando se os nomes estão na estrutura:");
    System.out.println("Contém 'Ana'? " + ed.contem("Ana")); 
    System.out.println("Contém 'Carlos'? " + ed.contem("Carlos")); 
    System.out.println("Contém 'Eduarda'? " + ed.contem("Eduarda")); 

    // Testando a operação 'remove'
    System.out.println("\nRemovendo nomes...");
    ed.remove("Beatriz");
    System.out.println("Contém 'Beatriz' após remoção? " + ed.contem("Beatriz")); 
    System.out.println("Total de nomes após remoção: " + ed.totalNomes()); 

    // Testando a operação 'getIndice'
    System.out.println("\nTestando getIndice...");
    System.out.println("Índice de 'Carlos': " + ed.getIndice("Carlos")); 
    System.out.println("Índice de 'Daniela': " + ed.getIndice("Daniela")); 

    // Testando a operação 'getNome' com uma posição inválida
    System.out.println("\nTestando getNome com posição inválida...");
    System.out.println("Nome na posição 10: " + ed.getNome(10)); 
    System.out.println("Nome na posição 5: " + ed.getNome(5)); 
 

}}
