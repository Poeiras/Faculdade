package auladethreads;

public class ThreadEstendida2 extends Thread{
    ListaNumeros lista_n2;
    public ThreadEstendida2(ListaNumeros listaNumeros){
        this.lista_n2 = listaNumeros;
    }
    public void run(){
        lista_n2.printTable(1000);
        System.out.println("Rodou Thread Estendida 2");
    }
}
