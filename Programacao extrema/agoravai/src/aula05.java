//Instruções de loop: while,do, for
import java.util.Scanner;
public class aula05 {
    public static void main (String[] args) {
        //Switch do nome
        int n1;
        String [] nome = {"Lucas", "Barbosa", "Poeiras", "Santos","Não existe"};
        Scanner digita = new Scanner(System.in);
        System.out.println("Manda a opção:");
        n1 = digita.nextInt();

        switch (n1) {
            case 1 -> System.out.println(nome[0]);
            case 2 -> System.out.println(nome[1]);
            case 3 -> System.out.println(nome[2]);
            case 4 -> System.out.println(nome[3]);
            default -> System.out.println(nome[4]);
        }

        System.out.println("Será que agora eu entendi FOR?");
        for(int i=0; i < 4; i++) {
            System.out.println(nome[i]);
        }
        //For de nome para gerar o nome
        int n2;
        System.out.println("Quantos nomes você tem?");
        n2 = digita.nextInt();
        String [] nomeado = new String[n2];

        for(int k = 0; k <n2; k++) {
            System.out.println("Digite o nome n°: " + k);
            nomeado[k] = digita.next();
        }

        System.out.println("\nResultado do nome");

        for(int j=0; j < nomeado.length; j++) {
            System.out.println("Nome n°:" + j + " é " + nomeado[j]);
        }
        //Fim
        System.out.println("\nAcabou essa merda");
    }
}
