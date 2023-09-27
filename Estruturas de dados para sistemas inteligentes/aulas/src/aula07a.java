public class aula07a {
    static class Pilha {
        //Atributos da classe
        int tamanho;
        int topo;
        int[] vetor;

        //Construtor da classe
        Pilha(int tam) {
            topo = -1;
            tamanho = tam;
            vetor = new int[tam];
        }
        public boolean PilhaVazia() {
            if (topo == -1) {
                return true;
            } else {
                return false;
            }
        }
        public boolean PilhaCheia() {
            if (topo >= tamanho - 1) {
                return true;
            } else {
                return false;
            }
        }

        public void Empilhar(int entrada) {
            if (!PilhaCheia()) {
                topo = topo + 1;
                vetor[topo] = entrada;
            } else {
                System.out.println("Pilha Cheia, seu canalha!");
            }
        }

        public int Desempilhar() {
            int desempilhado = 0;
            if (PilhaVazia()) {
                System.out.println("Pilha Vazia, sua mula!");
            }
            else {
                topo = topo - 1;
                desempilhado = vetor[topo];
            }
            return desempilhado;
        }

        public void ElementoTopo() {
            if (topo >= 0) {
                System.out.println("O elemento do topo é: " + vetor[topo]);
            } else {
                System.out.println("Pilha Vazia, sua mula!");
            }
        }

        public void MostrarPilha() {
            int i;
            for (i = topo; i >= 0; i--) {
                System.out.println("Elemento: " + vetor[i] + " Posição: " + i + " da Pilha");
            }
        }
    }
}