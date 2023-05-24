package auladethreads;

public class ListaNumeros {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Número n+1: " + (n + i));
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
