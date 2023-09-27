//Aula de Quicksort
public class aula03b {
    public static int[] quicksort(int p, int q, int [] vetor){
        int x;
        if(p < q){
            x = particao(p, q, vetor);
            quicksort(p, x - 1, vetor);
            quicksort(x + 1, q, vetor);
        }
        return vetor;
    }
    public static int particao(int p, int q, int [] vetor){
        int j = p - 1;
        int tempo;
        int aux = vetor[q];
        for (int i = p; i <= q; i ++){
            if (vetor[i] <= aux){
                j ++;
                tempo = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = tempo;
            }
        }
        return j;
    }
}
