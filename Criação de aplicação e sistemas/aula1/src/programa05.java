//Aula de vetores e matriz
import java.util.Scanner;

public class programa05 {
    public static void main(String[]entrada)
    {
        int[] vetor = {2, 4, 6, 8, 10};
        int[][] matriz = new int[2][3]; // 2 linhas 3 colunas
        Scanner sc = new Scanner(System.in);
        String msg = "Vetor = ";
        String msg2 = "Matriz = \n";

        //Vetor
        for(int i = 0; i < vetor.length; i++)
        {
            msg = msg + vetor[i] + " ";
        }
        System.out.println(msg);
        //Matriz
        for (int j = 0; j < matriz.length; j++)
        {
            for(int k = 0; k < matriz[0].length; k++)
            {
                System.out.print("Digite o número para posição: " + j + " Posição: " + k + "\n");
                matriz[j][k] = sc.nextInt();
                msg2 = msg2 + matriz[j][k];
            }
            msg2 = msg2 + "\n";
        }
        System.out.println(msg2);
        System.exit(0);
    }
}
