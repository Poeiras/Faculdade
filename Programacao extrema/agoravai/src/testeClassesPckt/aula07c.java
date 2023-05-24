package testeClassesPckt;

//Classe  de Professor
public class aula07c  extends aula07a {
    double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    private double getSalario() {
        return salario;
    }

    private double getINSS()    {
        return getSalario() * 0.11;
    }
    public double getSalarioLiquido(){
        return salario - getINSS();
    }
}
