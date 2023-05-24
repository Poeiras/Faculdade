//Calculadora com vetores
public class programa07
{
    public static void soma()
    {
        int s = 0;
        int[] vetor = {1, 2, 3, 4, 5};

        for (int i = 0; i < vetor.length; i++)
        {
            s = s + vetor[i];
        }
        System.out.println("Resultado da soma: " + s);
    }
    public static int produto()
    {
        int p = 1;
        int [] vec = {1,2,3,4,5};

        for(int i = 0; i < vec.length; i++)
        {
            p = p * vec[i];
        }
        return p;
    }
    public static void main (String[] entrada)
    {
        int resultado;
        soma();
        resultado = produto();
        System.out.println("Resultado da produtória: " + resultado);
    }
}
