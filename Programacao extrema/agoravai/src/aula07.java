import testeClassesPckt.aula07b;
import testeClassesPckt.aula07c;

//Conceitos de programação orientada a objetos
public class aula07 {
    public static void main(String [] args){
        aula07b aluno = new aula07b();
        aluno.setNome("Lucas");
        aluno.setNota1(9.0);
        aluno.setNota2(8.4);

        aula07c professor = new aula07c();
        professor.setNome("Geisa");
        professor.setSalario(1000);

        System.out.println("Nome do aluno: "    + aluno.getNome());
        System.out.println("Média do aluno: "   + aluno.ObterMedia());
        System.out.println("Nome do professor: "+ professor.getNome());
        System.out.println("Salário líquido: "  + professor.getSalarioLiquido());
    }
}