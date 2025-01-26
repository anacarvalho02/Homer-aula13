package com.mycompany.atividade_do_homer;

/**
 *
 * @author T-GAMER
 */
public class ListaDuplamenteEncadeada<Nodo> {
    Nodo cabeca;
    Nodo cauda;
    int tamanho;

    void ListaDuplamenteEncadeada(){
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    // Adiciona um dado no início da lista
    void AdicionarInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.cabeca == null) {
            this.cabeca = novoNodo;
            this.cauda = novoNodo; // Quando a lista está vazia, a cauda também aponta para o novo nodo
        } else {
            novoNodo.proximo = this.cabeca;
            this.cabeca.anterior = novoNodo; // Ajusta o ponteiro anterior da cabeça
            this.cabeca = novoNodo;
        }
        this.tamanho++;
    }

    // Adiciona um dado no fim da lista
    void AdicionarFim(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.cabeca == null) {
            this.cabeca = novoNodo;
            this.cauda = novoNodo; // Quando a lista está vazia, a cauda também aponta para o novo nodo
        } else {
            this.cauda.proximo = novoNodo;
            novoNodo.anterior = this.cauda; // Ajusta o ponteiro anterior da cauda
            this.cauda = novoNodo; // Atualiza a cauda
        }
        this.tamanho++;
    }

    // Remove o dado no final da lista
    void RemoverFim() {
        if (this.cauda != null) {
            if (this.cauda.anterior != null) {
                this.cauda = this.cauda.anterior; // Atualiza a cauda
                this.cauda.proximo = null; // Desconecta o último nodo
            } else {
                this.cabeca = null; // Se a lista tiver apenas um elemento
                this.cauda = null; // A lista fica vazia
            }
            this.tamanho--;
        }
    }

    // Pega o dado na posição indicada
    int pegarDados(int posicao) {
        if (posicao < 0 || posicao >= this.tamanho) {
            return (-1); // Indicando que a posição é inválida
        }
        Nodo atual = this.cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.proximo;
        }
        return (atual.valor);
    }

    // Remove o dado no início da lista
    void RemoverInicio() {
        if (this.cabeca != null) {
            if (this.cabeca.proximo != null) {
                this.cabeca = this.cabeca.proximo;
                this.cabeca.anterior = null; // Ajusta o ponteiro anterior da nova cabeça
            } else {
                this.cabeca = null;
                this.cauda = null; // Se a lista ficar vazia, a cauda também deve ser nula
            }
            this.tamanho--;
        }
    }

    // Verifica se um valor está na lista
    boolean contem(int valor) {
        Nodo atual = this.cabeca;
        while (atual != null) {
            if (atual.valor == valor) {
                return (true);
            }
            atual = atual.proximo;
        }
        return (false);
    }

    // Insere um dado no meio da lista na posição indicada
    void InserirMeio(int posicao, int valor) {
        if (posicao <= 0) {
            AdicionarInicio(valor);
        } else if (posicao >= this.tamanho) {
            AdicionarFim(valor);
        } else {
            Nodo novoNodo = new Nodo(valor);
            Nodo atual = this.cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novoNodo.proximo = atual.proximo;
            novoNodo.anterior = atual; // Ajusta o ponteiro anterior do novo nodo
            if (atual.proximo != null) {
                atual.proximo.anterior = novoNodo; // Ajusta o ponteiro anterior do próximo nodo
            }
            atual.proximo = novoNodo;
            this.tamanho++;
        }
    }

    // Remove o dado na posição indicada
    void RemoverMeio(int posicao) {
        if (posicao <= 0) {
            RemoverInicio();
        } else if (posicao < this.tamanho) {
            Nodo atual = this.cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            Nodo nodoRemover = atual.proximo;
            atual.proximo = nodoRemover.proximo;
            if (nodoRemover.proximo != null) {
                nodoRemover.proximo.anterior = atual; // Ajusta o ponteiro anterior do próximo nodo
            } else {
                this.cauda = atual; // Se removemos o último nodo, atualizamos a cauda
            }
            this.tamanho--;
        }
    }

    // Esvazia a lista
    void EsvaziarLista() {
        while (this.TamanhoLista() > 0) {
            this.RemoverInicio();
        }
    }

    // Imprimi a lista
    void ImprimirLista() {
        Nodo atual = cabeca;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Retorna o tamanho da lista
    int TamanhoLista() {
        return (this.tamanho);
    }
}
