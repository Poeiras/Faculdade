import javax.swing.*;

public class aula05 {
    public static void main(String[] entrada){
        int numero;
        int f;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if (numero < 0){
            System.out.println("Inválido");
        }
        else{
            aula05a.FatorialP.fatP(numero, numero, 1);
            f = aula05b.Fatorial.fat(numero);
            System.out.println("O fatorial de cauda de: " + numero + " é: " + f);
        }
        System.exit(0);
    }
}