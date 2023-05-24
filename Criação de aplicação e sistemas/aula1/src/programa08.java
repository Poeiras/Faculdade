import java.util.Scanner;
//Funções com parâmetros
public class programa08
{
    public static void soma(int[] x) //Procedimento com parâmetro
    {
        int resultado = 0;
        for (int i = 0; i < x.length; i++)
        {
            resultado = resultado + x[i];
        }
        System.out.println("Resultado da soma: " + resultado);
    }
    public static int produto(int[] x) //Função com parâmetro
    {
        int pro = 1;
        for (int k = 0; k < x.length; k++)
        {
            pro = pro * x[k];
        }
        return pro;
    }
    public static void main(String[] entrada)
    {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Digite o número para posição: " + i + '\n');
            vetor[i] = sc.nextInt();
        }
        soma(vetor);
        System.out.println("Resultado do produto: " + produto(vetor));
    }
}
