import java.util.*;

public class aula10 {
    public static void main(String[] args) {
        ArrayList<String> listadenomes = new ArrayList<>();
        listadenomes.add("Lucas");
        listadenomes.add("Ana");
        listadenomes.add("Afrodite");
        listadenomes.add("Lucy");
        listadenomes.add("Cão");

        //Método do iterador
        System.out.println("Iterador");
        Iterator<String> iterador = listadenomes.iterator();
        while(iterador.hasNext()) {
            System.out.println(iterador.next());
        }
        System.out.println(listadenomes.size());

        //Abertura da lista, array e iterador
        System.out.println("Lista ordenada:");
        for (String nome : listadenomes) {
            System.out.println(nome);
        }

        //Sort list com collections
        System.out.println("Lista de comparação: ");
        Comparator<String> comparator = Collections.reverseOrder();
        Collections.sort(listadenomes, comparator);
        for(String nome:listadenomes) {
            System.out.println(nome);
        }

    }
}