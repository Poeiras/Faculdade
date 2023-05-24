//Aula Instrução Java: if, else, switch
import java.util.Scanner;

public class aula04 {
    public static void main(String[] args){
        double n1,n2, n3, media;
        int aprova;
        String[] mensagem = {"\nAprovado", "\nReprovado", "\nProva final", "\nNota inválida"};

        Scanner digita = new Scanner(System.in);
        System.out.println("Digite a nota:");
        n1 = digita.nextDouble();

        System.out.println("Digite a nota:");
        n2 = digita.nextDouble();

        System.out.println("Digite a nota:");
        n3 = digita.nextDouble();

        media = (n1 + n2 + n3)/3;
        System.out.println("\nA média é:" + media);

        if(media >= 7) {
            aprova = 0;
            if(media >10){
                aprova = 3;
            }
        }
        else {
            if(media >=4) {
                aprova = 2;
            }
            else {
                aprova = 1;
            }
        }

        switch (aprova) {
            //Aprovado
            case 0 -> System.out.println(mensagem[0]);
            //Reprovado
            case 1 -> System.out.println(mensagem[1]);
            //Final
            case 2 -> System.out.println(mensagem[2]);
            //Nota inválida
            case 3 -> System.out.println(mensagem[3]);
            }
        }
    }