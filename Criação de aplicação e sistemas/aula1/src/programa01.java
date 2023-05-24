//Arquivo programa01.java

public class programa01 {
    public static void main(String entrada[])
    {
        //Variáveis
        int x1;
        double x2, soma;
        char caractere;

        //Entrada de dados
        x1 = Integer.parseInt(entrada[0]);
        x2 = Integer.parseInt(entrada[1]);
        caractere = (entrada[2].charAt(0));

        //Processamento
        soma = x1 + x2;

        //Saída de resultado
        System.out.print("Resultado: " + soma);
        System.exit(0);
    }
}
