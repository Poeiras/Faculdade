//Aula de mergesort
public class aula03c {
    public static int[] mergeSort(int [] a, int inicio, int fim){
        if (inicio == fim){
            return a;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(a, inicio, meio);
        mergeSort(a, meio + 1, fim);
        merge(a, inicio, meio, fim);
        return a;
    }
    public static void merge(int[] a, int inicio, int meio, int fim){
        int n = fim - inicio + 1;
        int [] b = new int[n];
        int i1 = inicio;
        int i2 = meio + 1;
        int j = 0;

        while(i1 <= meio && i2 <= fim){
            if (a[i1]< a[i2]){
                b[j] = a[i1];
                i1++;
            }
            else{
                b[j] = a[i2];
                i2++;
            }
            j = j + 1;
        }

        while(i1 <= meio){
            b[j] = a[i1];
            i1 = i1 + 1;
            j = j + 1;
        }

        while(i2 <= fim){
            b[j] = a[i2];
            i2 = i2 + 1;
            j = j + 1;
        }

        for(j = 0; j< n; j++){
            a[inicio + j] = b[j];
        }
    }
}
