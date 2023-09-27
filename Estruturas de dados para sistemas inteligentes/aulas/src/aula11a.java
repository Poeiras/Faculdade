public class aula11a {
    static class No {
        int elemento;
        No prox;

        No(int elem) {
            elemento = elem;
            prox = null;
        }
    }
        static class ListaLigada {
            No primeiro, ultimo;

            ListaLigada() {
                primeiro = null;
                ultimo = null;
            }

            public boolean ListaVazia() {
                if (primeiro == null && ultimo == null) {
                    return false;
                } else {
                    return true;
                }
            }

            public void InserirInicio(No novoNo) {
                if (ListaVazia()) {
                    ultimo = novoNo;
                } else {
                    novoNo.prox = primeiro;
                }
                primeiro = novoNo;
            }

            public void InserirFinal(No novoNo) {
                if (ListaVazia()) {
                    primeiro = novoNo;
                } else {
                    ultimo.prox = novoNo;
                }
                ultimo = novoNo;
            }

            public void Destruir() {
                primeiro = null;
                ultimo = null;
            }

            public int ContarNos() {
                int tamanho = 0;
                No NoTemp = primeiro;

                while (NoTemp != null) {
                    tamanho = tamanho + 1;
                    NoTemp = NoTemp.prox;
                }
                return tamanho;
            }

            public void MostrarLista() {
                No NoTemp = primeiro;
                int i = 1;

                while (NoTemp != null) {
                    System.out.println("Elemento: " + NoTemp.elemento + " Posição: " + i);
                    NoTemp = NoTemp.prox;
                    i = i + 1;
                }
            }

            public void ElementoInicio() {
                if (ListaVazia()) {
                    System.out.println("O primeiro elemento: " + primeiro.elemento);
                } else {
                    System.out.println("Lista Ligada Vazia, fraca, capenga, anêmica");
                }
            }

            public void ElementoFinal() {
                if (ListaVazia()) {
                    System.out.println("O último elemento: " + ultimo.elemento);
                } else {
                    System.out.println("Lista Ligada Vazia, fraca, capenga, anêmica");
                }
            }

            public void InserirMeio(No novoNo, int posicao) {
                No NoTemp = primeiro;
                int NroNos = 1;
                int posAux = 1;
                NroNos = ContarNos();
                if (posicao <= 1) {
                    InserirInicio(novoNo);
                } else {
                    if (posicao > NroNos) {
                        InserirFinal(novoNo);
                    } else {
                        while (posAux < (posicao - 1)) {
                            NoTemp = NoTemp.prox;
                            posAux = posAux + 1;
                        }
                        novoNo.prox = NoTemp.prox;
                        NoTemp.prox = novoNo;
                    }
                }
            }

            public void Remover(int elemento) {
                No NoTemp = primeiro;
                No NoAnt = null;
                if (primeiro.elemento == elemento) {
                    primeiro = primeiro.prox;
                } else {
                    while (NoTemp != null && NoTemp.elemento != elemento) {
                        NoAnt = NoTemp;
                        NoTemp = NoTemp.prox;
                    }
                    if (NoTemp != null) {
                        NoAnt.prox = NoTemp.prox;
                    }
                    if (NoTemp == ultimo) {
                        ultimo = NoAnt;
                    }
                }
            }

            public No BuscarNo(int elemento) {
                int i = 1;
                No NoTemp = primeiro;
                while (NoTemp != null) {
                    if (NoTemp.elemento == elemento) {
                        System.out.println("Nó: " + NoTemp.elemento + " Posição: " + i);
                        return NoTemp;
                    }
                    i = i + 1;
                    NoTemp = NoTemp.prox;
                }
                return null;
            }
        }
    }