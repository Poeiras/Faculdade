import javax.swing.*;

public class aula02a {
    //Quando escrevemos um algoritmo que recebe 50 números reais em um vetor
    //Para calcular e mostrar a média aritmética destes 50 números
    public static void main(String[] entrada){
        int[] notas;
        int i;
        double soma = 0;
        double media = 0;
        notas = new int[50];

        for (i = 0; i <=49; i++){
            notas[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: "));
            soma += notas[i];
        }
        media = soma / notas.length;
        System.out.printf("Média aritimética das notas: %.2f %n", media);
    }
}
