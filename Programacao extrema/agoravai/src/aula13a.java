import java.util.Scanner;

public class aula13a {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a opcão: 1 ou 2");
            try {
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1 -> System.out.println("Opção digitada: " + opcao);
                    case 2 -> System.out.println("Opção de alternativa: " + opcao);
                    default -> throw new Exception("Erro de exceção custom");
                }
            }
            catch (Exception errocustom) {
                throw new RuntimeException("Mensagem de erro: " + errocustom.getMessage());
            }
            finally {
                System.out.println("Fim do switch de exceção");
            }
        }
        while(true);
    }
}
