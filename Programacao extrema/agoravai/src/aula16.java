import auladethreads.ListaNumeros;
import auladethreads.ThreadEstendida1;
import auladethreads.ThreadEstendida2;
public class aula16 {
    //Aula de thread e runnable
    public static void main(String[] args) {

        //Thread de runnable
        aula16a minhathread = new aula16a();
        Thread threadvar = new Thread(minhathread);
        threadvar.start();
        System.out.println("Thread principal no main");

        //Start de novas threads
        ListaNumeros listao = new ListaNumeros();
        ThreadEstendida1 minha_thread_1 = new ThreadEstendida1(listao);
        ThreadEstendida2 minha_thread_2 = new ThreadEstendida2(listao);
        minha_thread_1.start();
        minha_thread_2.start();
        }
    }