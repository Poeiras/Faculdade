import java.util.*;

public class programa04 {
    //Módulo
    public static void main(String[] entrada)
    {
        int opera;
        int n1,n2,multi,pro;
        Scanner sc = new Scanner(System.in);
        String resultado = "O resultado é igual a: ";
        String erro = "Números negativos";

        //Entrada
        System.out.print("Digite 1 para produto || " +
                "Digite 2 produtória " + "\n");
        opera = sc.nextInt();
        System.out.print("Digite o número n1:" + '\n');
        n1 = sc.nextInt();
        System.out.print("Digite o número n2:" + '\n');
        n2 = sc.nextInt();


        //Processamento e saídas
        switch (opera)
        {
            //Operação multiplica
            case 1:
                if(n1 >= 0 && n2 >= 0)
                {
                    multi = n1 * n2;
                    System.out.println(resultado + multi);
                }
                else
                {
                    System.out.println(n1 + erro);
                }
                break;
            //Operação vezes
            case 2:
                pro = 1;
                for (int i = 1; i <= n2; i = i +1)
                {
                    pro = pro * n1;
                }
                System.out.println(resultado + pro);
                break;
        }

        //Fim do programa
        System.exit(0);
    }
}