//Usando strings e arrays, matriz
import java.util.Scanner;
public class aula06 {
    public static void main(String [] args){
        Scanner digita = new Scanner(System.in);
        int linha, coluna;

        System.out.println("Quantos linhas você quer?");
        linha = digita.nextInt();
        System.out.println("Quantos colunas você quer?");
        coluna = digita.nextInt();

        String [][] nome = new String[linha][coluna];

        for(int k = 0; k < linha; k ++){
            for(int j = 0; j <coluna;j++)
            {
                System.out.println("Digite o nome da posição x " + k + " e  y " + j);
                nome[k][j] = digita.next();
            }
        }

        System.out.println("\nLoop linear de nomes");
        for(int k = 0; k < linha; k++){
            System.out.print("\n");
            for(int j = 0; j < coluna; j++)
            {
                System.out.print(nome[k][j] + " ");
            }
        }

        System.out.println("\nLoop invertido de nomes");
        for(int k = nome[0].length - 1; k >= 0; k --){
            System.out.print("\n");
            for(int j = nome[1].length - 1; j >= 0; j--)
            {
                System.out.print(nome[k][j] + " ");
            }
        }
    }
}
/*
    2 linhas, 2 colunas
    {lucas, barbosa
    poeiras, santos}
 */