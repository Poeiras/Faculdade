import java.util.Scanner;

public class aula03 {
    public static void main (String[] args)
    {
        //Exercícios com operadores
        double nota1, nota2, media;
        nota1 = 9.1;
        nota2 = 8.3;
        media = (nota1 + nota2)/2;
        System.out.println("\nMédia dele: " + media);

        int valor, valorx1, valorx2;
        Scanner digita = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        valor = digita.nextInt();
        System.out.println("\nValorzin: " + valor/2);
        System.out.println("\nMódulo de divisão: " + valor%2);

        //Operadores de incremento e decremento
        System.out.println("\nDigite o valor: ");
        valor = digita.nextInt();
        valorx1 = valor;
        valorx2 = valor;
        valorx1 ++;
        valorx2 --;
        System.out.println("\nValor digitado: " + valor);
        System.out.println("\nValor incrementado: " + valorx1);
        System.out.println("\nValor decrementado: " + valorx2);

    }
}
