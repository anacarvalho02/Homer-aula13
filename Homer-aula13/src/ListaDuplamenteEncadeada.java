public class ListaDuplamenteEncadeada {
    private static class No {
        int valor;
        No anterior;
        No proximo;

        public No(int valor) {
            this.valor = valor;
            this.anterior = null;
            this.proximo = null;
        }
    }

    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void remover(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }
}

