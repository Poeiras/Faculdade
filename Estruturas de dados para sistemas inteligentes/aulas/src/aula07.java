import javax.swing.*;
public class aula07 {
        public static void main (String [] arg){
            aula07a.Pilha intPilha = new aula07a.Pilha(5);
            int i;
            int entrada;

            for(i = 1; i <= 5; i++){
                entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
                intPilha.Empilhar(entrada);
            }
            intPilha.MostrarPilha();
            System.exit(0);
    }
}
