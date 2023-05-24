import java.util.*;

public class programa02 {
    //Módulo
    public static void main(String entrada[])
    {
        int n1, n2;
        int mod, div;
        double raiz, pot;
        Scanner sc = new Scanner(System.in);
        String msg = "";

        //Entrada
        System.out.print("Primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        n2 = sc.nextInt();

        //Processamento
        mod = n1 % n2;
        div = (int)n1 / (int)n2;
        raiz = Math.sqrt(n1);
        pot = Math.pow(n1,n2);

        //Saídas
        msg = "n1 = " + n1 + " || n2 = " + n2 + " \n";
        System.out.println(msg);
        System.exit(0);
    }
}
