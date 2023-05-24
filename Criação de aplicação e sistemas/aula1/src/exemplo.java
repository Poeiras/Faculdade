// Exemplo da primeira aula
class exemplo
{
    //Módulo
    public static void main(String entrada[])
    {
        //Variáveis
        int n1, n2, resultado;
        //Entrada
        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);

        //Processamento
        resultado  = n1 + n2;

        // Saída de dados
        System.out.println("x= " + n1 + ",y = " + n2 + " , resultado da soma: " + resultado);
        System.exit(0);
    }
}
