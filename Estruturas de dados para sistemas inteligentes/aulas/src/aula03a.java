//Aula de bubblesort
public class aula03a {
    public static int[] Bolha (int [] numeros){
        final int n = numeros.length;
        int aux;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n - 1 - i; j++){
                if (numeros[j] > numeros[j + 1]){
                    aux = numeros[j];
                    numeros[j] = numeros [j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }
        return numeros;
    }
}