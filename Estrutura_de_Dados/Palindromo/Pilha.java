
import javax.swing.JOptionPane;
public class Pilha {
    int topo = -1;
    int tamanho;
    int qtdeElementos = 0;
    String p[];
    String p_aux[];

    public Pilha() {
        tamanho = 10;
        p = new String[tamanho];
        qtdeElementos = 0;
        p_aux = new String[tamanho];
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

    public void empilha(String e){
        if (!estaCheia()){
           
            topo++;
            p[topo] = e;
            qtdeElementos++;

        }
    }

    public boolean verificarPalindromo(){
        for(int i=topo;i>=0;i--){
            p_aux[topo - i] = p[i];
            
        }

        int i = 0;

        while((p_aux[i] == p[i]) && (i <= topo)){
            i++;
        }

        if((i - 1) == topo){
            return true;
        }else{
            return false;
        }



    }



    public String desempilha(){
        String x = "";
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