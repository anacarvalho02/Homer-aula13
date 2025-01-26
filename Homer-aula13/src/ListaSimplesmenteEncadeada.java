public class ListaSimplesmenteEncadeada {
    private static class Nodo {
        int valor;
        Nodo proximo;

        public Nodo(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Nodo cabeca;
    private int tamanho;

    public ListaSimplesmenteEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void adicionarInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        novoNodo.proximo = cabeca;
        cabeca = novoNodo;
        tamanho++;
    }

    public void adicionarFim(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (cabeca == null) {
            cabeca = novoNodo;
        } else {
            Nodo atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
        tamanho++;
    }

    public int pegarDados(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            return -1; // Posição inválida
        }
        Nodo atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public void removerInicio() {
        if (cabeca != null) {
            cabeca = cabeca.proximo;
            tamanho--;
        }
    }

    public boolean contem(int valor) {
        Nodo atual = cabeca;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void inserirMeio(int posicao, int valor) {
        if (posicao <= 0) {
            adicionarInicio(valor);
        } else if (posicao >= tamanho) {
            adicionarFim(valor);
        } else {
            Nodo novoNodo = new Nodo(valor);
            Nodo atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novoNodo.proximo = atual.proximo;
            atual.proximo = novoNodo;
            tamanho++;
        }
    }

    public void removerMeio(int posicao) {
        if (posicao <= 0) {
            removerInicio();
        } else if (posicao < tamanho) {
            Nodo atual = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }
    }

    public int tamanhoLista() {
        return tamanho;
    }
}

