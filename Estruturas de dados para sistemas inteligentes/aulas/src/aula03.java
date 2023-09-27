public class aula03 {
    public static void main (String [] entrada){
        int i;

        System.out.println("BubbleSorter começou -------------");
        int [] vetor = {9, 5, 1, 3, 10, 8, 4, 6, 7, 2};
        int [] ordenado = aula03a.Bolha(vetor);
        for (i = 0; i <= 9; i++){
            System.out.println("BubbleSorter " + ordenado[i]);
        }
        System.out.println("BubbleSorter acabou -------------");

        System.out.println("Quicksorter começou -------------");
        int [] vetor1 = {12, 5, -3, 4, 0, 21, 8, -7, 9 ,6};
        int [] ordenado1 = aula03b.quicksort(0, 9, vetor1);
        for (i = 0; i <= 9; i++){
            System.out.println("Quicksorter " + ordenado1[i]);
        }
        System.out.println("Quicksorter acabou -------------");

        System.out.println("MergeSort começou -------------");
        int [] vetor2 = {0, 8, -4, 16, -12, 17, 13, -9, 2, 11};
        int [] ordenado2 = aula03c.mergeSort(vetor2, 0, 9);
        for (i = 0; i <= 9; i++){
            System.out.println("MergeSort " + ordenado2[i]);
        }
        System.out.println("MergeSort acabou -------------");


        System.exit(0);
    }
}
