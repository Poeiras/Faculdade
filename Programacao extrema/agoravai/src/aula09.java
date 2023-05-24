//Trabalhando strings
public class aula09 {
    public static void main(String [] args) {
        String nome = "Lucas";
        String apelido = "SanK4ra";
        String sobrenome = "Poeiras";

        System.out.println(nome);
        System.out.println(sobrenome);
        System.out.println(apelido);
        StringBuffer buffao = new StringBuffer();
        buffao.append(nome);
        buffao.append(apelido);
        buffao.append(sobrenome);
        String nomebuffado = buffao.toString();

        System.out.println(nome.length());
        System.out.println(sobrenome.length());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.charAt(2));
        System.out.println(buffao);
        System.out.println(nomebuffado);
        System.out.println(nome.substring(1,3));
    }
}
