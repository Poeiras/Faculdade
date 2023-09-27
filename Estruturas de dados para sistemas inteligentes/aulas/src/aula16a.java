public class aula16a {
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
}
