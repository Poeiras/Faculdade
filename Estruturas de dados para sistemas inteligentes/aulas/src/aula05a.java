public class aula05a {
    static class FatorialP{
        //Procedimento sem retorno
        static void fatP(int n, int x, int f){
            if (x == 0 || x == 1){
                System.out.println("O fatorial sem cauda de: " + n + " é: " + f);
            }
            else{
                //regra de 2 e 3
                fatP(n, x-1, f*x);
            }
        }
    }
}