import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class aula11 {
    public static void main(String[]args)
    {
        System.out.println("\n" + "-----Exercício de HashMap-----");
        HashMap<Integer, String> linguagem = new HashMap<>();
        linguagem.put(0, "C++");
        linguagem.put(1, "Java");
        linguagem.put(2, "Cobol");
        System.out.println("Conteúdos: "+ "\n" + linguagem);

        //Hashmap coloca posição e não index na chave
        String valor = linguagem.get(2);
        System.out.println("Chave n2: "     + valor);
        System.out.println("Valores: "      + linguagem.values());
        System.out.println("Chave/Valor: "  + linguagem.entrySet());

        //Linked hash map exercicio
        System.out.println("\n" + "-----Exercício de LinkedHashMap-----");
        LinkedHashMap<Integer, String> lahamap = new LinkedHashMap<>();
        lahamap.put(0, "Lucas");
        lahamap.put(1, "Barbosa");
        lahamap.put(2, "Poeiras");
        lahamap.put(3, "Santos");

        System.out.println("Linked hash map:" + lahamap);
        System.out.println("Linked hash map values: " + lahamap.values());
        System.out.println("Linked hash map entry set: " + lahamap.entrySet());
        System.out.println("Linked hash map get n2: " + lahamap.get(2));

        //Exercício de treemap
        System.out.println("\n" + "-----Exercício de Treemap-----");
        TreeMap<Integer, String> arvoremapa = new TreeMap<>();
        arvoremapa.put(0, "Santos");
        arvoremapa.put(1, "Poeiras");
        arvoremapa.put(2, "Barbosa");
        arvoremapa.put(3, "Lucas");
        System.out.println("Treemap: " + arvoremapa);
        System.out.println("Values: " + arvoremapa.values());
        System.out.println("Chaves: " + arvoremapa.keySet());
        System.out.println("Chave/Valor: " + arvoremapa.entrySet());
    }
}
