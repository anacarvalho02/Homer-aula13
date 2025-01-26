public class Main {
    public static void main(String[] args) {
        // Lista Simplesmente Encadeada
        ListaSimplesmenteEncadeada listaSimples = new ListaSimplesmenteEncadeada();
        listaSimples.adicionarInicio(10);
        listaSimples.adicionarFim(20);
        listaSimples.adicionarFim(30);
        listaSimples.adicionarInicio(50);
        listaSimples.inserirMeio(1, 15);

        System.out.println("Valor na posição 1: " + listaSimples.pegarDados(1));
        System.out.println("A lista contém 20? " + listaSimples.contem(20));
        listaSimples.removerInicio();
        listaSimples.removerMeio(1);
        System.out.println("Tamanho da lista: " + listaSimples.tamanhoLista());

        // Lista Duplamente Encadeada
        ListaDuplamenteEncadeada listaDupla = new ListaDuplamenteEncadeada();
        listaDupla.inserir(10);
        listaDupla.inserir(20);
        listaDupla.inserir(30);
        listaDupla.exibir();
        listaDupla.remover(20);
        listaDupla.exibir();
    }
}
