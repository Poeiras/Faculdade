import java.util.Scanner;

public class aula11 {
    public static void main(String [] arg){
        aula11a.ListaLigada objLL = new aula11a.ListaLigada();
        int i;
        int num;
        Scanner digita = new Scanner(System.in);
        for(i = 1; i <= 10; i++){
            System.out.println("Digite o valor: ");
            num = digita.nextInt();
            if(num % 3 == 0){
                objLL.InserirInicio(new aula11a.No(num));
            }
        }
        int tamanho = objLL.ContarNos();
        System.out.println("Tamanho da lista: " + tamanho);
        objLL.MostrarLista();
        objLL.ElementoInicio();
        objLL.ElementoFinal();
        objLL.Destruir();
    }
}