package auladethreads;

public class ThreadEstendida1 extends Thread {
    ListaNumeros listaNumeros;
    public ThreadEstendida1(ListaNumeros listaNumeros){
        this.listaNumeros = listaNumeros;
    }
    public void run(){
        listaNumeros.printTable(500);
        System.out.println("Rodou Thread Estendida 1");
    }
}