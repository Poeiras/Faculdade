import javax.swing.*;

public class aula02 {
    public static void main(String[] entrada){
        int[] vetor_soma;
        int i;
        int soma =0;
        vetor_soma = new int[5];

        for (i = 0; i <=4; i++){
            vetor_soma[i] = Integer.parseInt((JOptionPane.showInputDialog("Digite o valor")));
            soma += vetor_soma[i];
            //System.out.println("Posição: " + i);
            //System.out.println("Valor " + soma);*/
        }
        System.out.println("Valor da soma vetorial: " + soma);

        int[][] matriz;
        int a;
        int b;
        matriz = new int [5][3];
        int soma2 = 0;

        for (a = 0; a <= 4; a ++){
            for (b = 0; b <= 2; b++){
                matriz[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor: "));
                soma2 += matriz[a][b];
                //System.out.println("Linha: " + a);
                //System.out.println("Coluna: " + b);
            }
        }
        System.out.println("Soma da matriz: " + soma2);
        System.exit(0);
    }
}