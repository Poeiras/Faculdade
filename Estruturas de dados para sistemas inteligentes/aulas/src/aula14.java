import java.util.Scanner;

public class aula14 {
    public static void main(String [] arg){
    Scanner digita = new Scanner(System.in);
    aula14a.ArvoreBinaria obj = new aula14a.ArvoreBinaria();
    int i, num;
    for(i = 0; i <= 4; i++){
        System.out.println("Digite o valor: ");
        num = digita.nextInt();
        obj.inserirNo(num);
        }
    obj.exibirNoDir();
    obj.exibirNoEsq();
    obj.exibirRaiz();
    }
}