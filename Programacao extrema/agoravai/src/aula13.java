import java.util.InputMismatchException;
import java.util.Scanner;

public class aula13 {
    public static void main (String [] args)
    {
        //Exercício try & catch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = scanner.nextInt();

        //Try catch vai sempre na roda do menos genérico ao mais genércio
        try {
            int quociente = dividendo / divisor;
            System.out.println("Resultado: " + quociente);
            System.out.println("Rodou na safe");
        }
        //Erro de input
        catch (InputMismatchException erroinput) {
            System.out.println("Causa:" + erroinput.getCause());
            System.out.println("Mensagem: " + erroinput.getMessage());
            System.out.println("Tipo da exceção: " + erroinput.getClass().getCanonicalName());
            System.out.println("Deu erro de input");
        }
        //Erro aritimético
        catch (ArithmeticException erroaritimetico) {
            System.out.println("Causa:" + erroaritimetico.getCause());
            System.out.println("Mensagem: " + erroaritimetico.getMessage());
            System.out.println("Tipo da exceção: " + erroaritimetico.getClass().getCanonicalName());
            System.out.println("Deu erro aritimético");
        }
        //Erro global
        catch (Exception erro) {
            System.out.println("Causa:" + erro.getCause());
            System.out.println("Mensagem: " + erro.getMessage());
            System.out.println("Tipo da exceção: " + erro.getClass().getCanonicalName());
            System.out.println("Deu erro");
        }
        //Conclusão
        finally {
            System.out.println("Fim do programa");
        }
    }
}
