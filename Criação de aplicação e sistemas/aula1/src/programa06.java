// Calculadora
import java.util.Scanner;

public class programa06 {
    public static void soma() //Sem parâmetro
    {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número n1:" + '\n');
        n1 = sc.nextInt();
        System.out.print("Digite o número n2:" + '\n');
        n2 = sc.nextInt();
        System.out.println("Resultado da soma: " + (n1 + n2));
    }
    public static void subtrai(int x, int y) //Com parâmetro
    {
        int sub;
        sub = x - y;
        System.out.println("Resultado da subtração: " + sub);
    }
    public static int multiplica() //Função, não recebe, mas retorna um int
    {
        int n1, n2,pro ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número n1:" + '\n');
        n1 = sc.nextInt();
        System.out.print("Digite o número n2:" + '\n');
        n2 = sc.nextInt();
        pro = n1 * n2;

        return pro ;
    }
    public static double dividir(int x, int y) //Função, recebe dois parâmetros e devolve double
    {
        double diva;
        diva = (double)x / (double)y;
        return diva;
    }
    public static void main(String[]entrada)
    {
        int n1,n2,sum;
        double res;
        Scanner sc = new Scanner(System.in);

        soma();

        System.out.print("Digite o número n1:" + '\n');
        n1 = sc.nextInt();
        System.out.print("Digite o número n2:" + '\n');
        n2 = sc.nextInt();
        subtrai(n1, n2);

        sum = multiplica();
        System.out.println("Resultado da multiplicação: " + sum);

        res = dividir(n1, n2);
        System.out.println("Resultado da Divisão: " + res);

        System.exit(0);
    }
}
