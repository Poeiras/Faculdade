import javax.swing.*;

public class aula08a {
    static class Fila {
        int tamanho, inicio, fim, total;
        int[] vetor;
        Fila(int tam) {
            inicio = 0;
            fim = 0;
            total = 0;
            tamanho = tam;
            vetor = new int[tam];
        }
        public boolean FilaVazia() {
            if (total == 0) {
                return true;
            } else {
                return false;
            }
        }
        public boolean FilaCheia() {
            if (total >= tamanho) {
                return true;
            } else {
                return false;
            }
        }
        public void Enfileirar(int elemento) {
            if (!FilaCheia()) {
                vetor[fim] = elemento;
                fim = fim + 1;
                total = total + 1;
                if (fim >= tamanho) {
                    fim = 0;
                }
            } else {
                System.out.println("Fila cheia, filha da puta");
            }
        }
        public int Desenfileirar() {
            int desenfileirado = 0;
            if (FilaVazia()) {
                System.out.println("Fila vazia, boa 0meia");
            } else {
                desenfileirado = vetor[inicio];
                inicio = inicio + 1;
                total = total - 1;
                if (inicio >= tamanho) {
                    inicio = 0;
                }
            }
            return desenfileirado;
        }
        public void ElementoInicio() {
            if (!FilaVazia()) {
                System.out.println("O primeiro elemento é: " + vetor[inicio]);
            } else {
                System.out.println("Fila vazia, boa 0meia");
            }
        }
        public void MostrarFila() {
            int i, aux;
            aux = inicio;
            for (i = 0; i <= total; i++) {
                System.out.println("Elemento: " + vetor[i] + " Posição: " + i + " da Fila");
                aux = aux + 1;
            }
            if (aux >= tamanho) {
                aux = 0;
            }
        }
    }
}