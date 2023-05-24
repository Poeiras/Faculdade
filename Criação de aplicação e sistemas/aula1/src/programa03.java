import java.util.*;

public class programa03 {
    //Módulo
    public static void main(String[] entrada)
    {
        int opera;
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        String positivo = " é um número é positivo";
        String negativo = " é um Número é negativo";
        String par  = " é um número par";
        String impar = " é um número impar";
        String tabuada = ("Tabuada do número: ");

        //Entrada
        System.out.print("Digite 1 para OP POS/NES || " +
                "Digite 2 para OP PAR/IMPAR  || " +
                "Digite 3 para OP Tabuada" + "\n");
        opera = sc.nextInt();
        System.out.print("Digite o número a analisar:" + '\n');
        n1 = sc.nextInt();


        //Processamento e saídas
        switch (opera)
        {
            //Operação positivo/negativo
            case 1:
                if(n1 >= 0)
                {
                    System.out.println(n1 + positivo);
                }
                else
                {
                    System.out.println(n1 + negativo);
                }
                break;
            //Operação par/ímpar
            case 2:
                if(n1 % 2 == 0)
                {
                    System.out.println(n1 + par);
                }
                else {
                    System.out.println(n1 + impar);
                }
                break;
                //Operação tabuada
            case 3:
                int i = 1;
                do
                {
                    n2 = n1 * i;
                    System.out.println(tabuada + n1 + " multiplicado por: " + i + "\n" + " é igual a: " + n2);
                    i = i + 1;
                }
                while (i <= 10);
                break;
        }

        //Fim do programa
        System.exit(0);
    }
}
