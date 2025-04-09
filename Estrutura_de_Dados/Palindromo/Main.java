public class Main {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();

        System.err.println("Fila estpa vazia?" + pilha.estaVazia());//true

        //Empilhando elementos na pilha
        System.err.println("\nCOLOCANDO 3 ELEMENTOS NA PILHA:");
        pilha.empilha("o");
        pilha.empilha("c");
        pilha.empilha("a");

        System.err.println("\nVerificando Palindromo:");
        System.err.println(pilha.verificarPalindromo());

        pilha.mostrar();

        System.err.println("\nDESEMPILHANDO UM ELEMENTO:");
        pilha.desempilha();

        pilha.mostrar();

        System.err.println("\nVERIFICANDO SE A FILA ESTÁ CHEIA:");
        System.err.println(pilha.estaCheia());//false
    }
}