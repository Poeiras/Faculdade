import javax.swing.*;
public class aula08 {
    public static void main(String[] arg) {
        aula08a.Fila intFila = new aula08a.Fila(10);
        int x, entrada;
        for (x = 0; x <= 3; x++) {
            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
            if (entrada % 2 == 0) {
                intFila.Enfileirar(entrada);
            }
        }
        intFila.MostrarFila();
        System.exit(0);
    }
}