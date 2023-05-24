// Nome da classe
class primeiro {
    //Módulo principal com a entrada na linha de comando
    public static void main(String[] entrada)
    {
        //Declaração de variáveis
        int idade = 31;
        double altura = 1.75;
        double peso = 99.5;
        char sexo = 'M';
        String nome = "Lucas Barbosa Poeiras Santos";
        boolean vivo = true;

        //Processamento e saída
        if (vivo)
        {
            System.out.println("Meu nome é " + nome + " e tenho "+ idade + " anos");
            System.out.println("Eu meço " + altura + " metro de altura" + " e peso " + peso + " Kilos");
            System.out.println("Meu gênero é: " + sexo);
            System.out.println("Eu estou vivo? " + vivo);
        }
        System.exit(0);
    }
}
