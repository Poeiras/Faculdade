import java.util.Scanner;

public class aula16 {
    static class No {
        int elemento;
        aula11a.No prox;

        No(int elem) {
            elemento = elem;
            prox = null;
        }
    }
    public void emOrdem(No ABB){
    if (ABB != null){
        emOrdem(ABB.esquerda);
        visita(ABB);
        emOrdem(ABB.direita);
    }
}
    public void preOrdem(No ABB){
        if(ABB != null){
            visita(ABB);
            preOrdem(ABB.esquerda);
            preOrdem(ABB.direita);
        }
    }
    public void posOrdem(No ABB){
        if(ABB != null){
            posOrdem(ABB.esquerda);
            posOrdem(ABB.direita);
            visita(ABB);
        }
    }
    public static void visita(No ABB){
        System.out.println(ABB.num + " ");
    }
    public static int menu(){
        String msg = "";
        int operacao;
        Scanner digita = new Scanner(System.in);
        msg = msg + "Digite 1 para em ordem \n";
        msg = msg + "Digite 2 para PRÉ ordem \n";
        msg = msg + "Digite 3 para PÓS ordem \n";
        msg = msg + "Digite 0 para sair \n";

        System.out.println(msg);
        operacao = digita.nextInt();
        return operacao;
    }
    public static void Main(String [] arg){
        aula14a.ArvoreBinaria ABB = new aula14a.ArvoreBinaria();
        do{
            int operacao = menu();
            vi = LerNum();
            switch (operacao) {
                case 1 -> aula16a.emOrdem(ABB);
                case 2 -> aula16a.preOrdem(ABB);
                case 3 -> aula16a.posOrdem(ABB);
            }
        }
        while (operacao < 1 && operacao > 3);
        System.exit(0);
    }

}
