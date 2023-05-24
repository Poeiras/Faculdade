package testeClassesPckt;
//Classe de aluno
public class aula07b extends aula07a {
    protected double nota1,nota2;

    private double getNota1(){
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    private double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double ObterMedia()    {
        return (getNota1() + getNota2())/2;
    }
}
