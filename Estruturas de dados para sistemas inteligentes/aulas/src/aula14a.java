public class aula14a {
    public static class BIntNo {
        int valor;
        BIntNo esq, dir;
        BIntNo(int novoValor) {
            valor = novoValor;
        }
    }
        public static class ArvoreBinaria {
            BIntNo Raiz;
            public BIntNo inserir(BIntNo arvore, int novoNo) {
                if (arvore == null) {
                    return new BIntNo(novoNo);
                } else {
                    if (novoNo < arvore.valor) {
                        inserir(arvore.esq, novoNo);
                    } else {
                        inserir(arvore.dir, novoNo);
                    }
                }
                return arvore;
            }
            public void inserirNo(int novoValor) {
                Raiz = inserir(Raiz, novoValor);
            }
            public void exibirEsquerdo(BIntNo arv) {
                if (arv != null) {
                    exibirEsquerdo(arv.esq);
                    System.out.println("Elemento esquerdo: " + arv.valor);
                }
            }
            public void exibirNoEsq() {
                exibirEsquerdo(Raiz);
            }
            public void exibirDireito(BIntNo arv) {
                if (arv != null) {
                    exibirDireito(arv.dir);
                    System.out.println("Elemento direito: " + arv.valor);
                }
            }
            public void exibirNoDir() {
                exibirDireito(Raiz);
            }
            public void exibirRaiz() {
                System.out.println("Raiz: " + Raiz);
            }
            public void No(int item) {
                BIntNo tempNo, pai, filho, temp;
                temp = null;
                tempNo = Raiz;
                pai = null;
                filho = Raiz;
                while (tempNo != null && tempNo.valor != item) {
                    if (item < tempNo.valor) {
                        tempNo = tempNo.esq;
                    } else {
                        tempNo = tempNo.dir;
                    }
                    if (tempNo == null) {
                        System.out.println("Item não localizado, seu burro!");
                    }
                    if (pai == null) {
                        if (tempNo.dir == null) {
                            Raiz = tempNo.esq;
                        } else {
                            if (tempNo.esq == null) {
                                Raiz = tempNo.dir;
                            } else {
                                for(temp = tempNo, tempNo.esq = filho.dir; filho.dir != null;){
                                    temp.dir = filho.esq;
                                    filho.esq = Raiz.esq;
                                }
                            }
                            if (filho != tempNo.esq) {
                                temp.dir = filho.esq;
                                filho.esq = Raiz.esq;
                            }
                            filho.dir = Raiz.dir;
                            Raiz = filho;
                        }
                    }
                    else {
                        if (tempNo.dir == null) {
                            if (pai.esq == null) {
                                pai.esq = tempNo.esq;
                            } else {
                                pai.dir = tempNo.esq;
                            }
                        } else {
                            if (tempNo == null) {
                                if (pai.esq == tempNo.dir) {
                                    pai.esq = tempNo.dir;
                                } else {
                                    pai.dir = tempNo.dir;
                                }
                            } else {
                                for (temp = tempNo, filho = tempNo.esq; filho.dir != null; ) {
                                    temp = filho;
                                    filho = filho.dir;
                                }
                                if (filho != tempNo.esq) {
                                    temp.dir = filho.esq;
                                    filho.esq = tempNo.esq;
                                }
                                filho.dir = tempNo.dir;
                                if (pai.esq == tempNo) {
                                    pai.esq = filho;
                                } else {
                                    pai.dir = filho;
                                }
                            }
                        }
                    }
                }
            }
        }
    }