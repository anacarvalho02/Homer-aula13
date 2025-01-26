package com.mycompany.atividade_do_homer;

public class Atividade_do_Homer {

    public static void main(String[] args) {
        // Teste Lista Duplamente Encadeada
        com.mycompany.atividade_do_homer.ListaDuplamenteEncadeada lista = new com.mycompany.atividade_do_homer.ListaDuplamenteEncadeada();

        // Homer é o 1
        // Marge é o 2
        // Bart é o 3
        // Moll é o 4
        // Lisa é o 5
        // Maggie é o 6
        // Ned Flanders é o 7
        // Sr. Burns é o 8

        // 1) Adicione Homer e Marge na lista e depois imprima o resultado
        lista.AdicionarInicio(1);
        lista.AdicionarInicio(2);
        lista.ImprimirLista();

        // 2) Esvazie a lista e imprima
        lista.EsvaziarLista();
        lista.ImprimirLista();

        // 3) Adicione Homer, Bart na posição 0, e Moll na posição 1 e imprima
        lista.AdicionarFim(1);
        lista.InserirMeio(0, 3);
        lista.InserirMeio(1, 4);
        lista.ImprimirLista();

        // 4) Esvazie a lista
        lista.EsvaziarLista();

        // 5) Adicione Homer, Bart e Lisa no início da lista e imprima o resultado
        lista.AdicionarInicio(1);
        lista.AdicionarInicio(2);
        lista.AdicionarInicio(5);
        lista.ImprimirLista();
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 6) Esvazie a lista e imprima
        lista.EsvaziarLista();
        lista.ImprimirLista();

        // 7) Adicione Homer, Maggie, Bart e Marge na lista e imprima
        lista.AdicionarFim(1);
        lista.AdicionarFim(6);
        lista.InserirMeio(0, 3);
        lista.InserirMeio(1, 2);
        lista.ImprimirLista();

        // Verifique se Lisa está na lista
        System.out.println("Lisa esta na lista? " + lista.contem(5));

        // 8) Esvazie a lista
        lista.EsvaziarLista();
        lista.ImprimirLista();

        // 9) Adicione Homer e Bart na lista e depois imprima o resultado
        lista.AdicionarFim(1);
        lista.AdicionarFim(3);
        lista.ImprimirLista();
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 10) Verifique se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge esta na lista? " + lista.contem(2));
        System.out.println("Homer esta na lista? " + lista.contem(1));
        System.out.println("Bart esta na lista? " + lista.contem(3));
        System.out.println("Maggie esta na lista? " + lista.contem(6));
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 11) Esvazie a lista
        lista.EsvaziarLista();

        // 12) Adicione Homer, Bart, Marge, Maggie, Ned Flanders, Sr. Burns
        lista.AdicionarInicio(1);
        lista.AdicionarFim(3);
        lista.AdicionarFim(2);
        lista.InserirMeio(1, 6);
        lista.AdicionarInicio(7);
        lista.AdicionarFim(8);
        lista.ImprimirLista();

        // 13) Remova do fim da lista e imprima
        lista.RemoverInicio();
        lista.ImprimirLista();

        // 14) Remova a posição 1, depois imprima a lista e o tamanho
        lista.RemoverMeio(1);
        lista.ImprimirLista();
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 15) Verifique se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge esta na lista? " + lista.contem(2));
        System.out.println("Homer esta na lista? " + lista.contem(1));
        System.out.println("Bart esta na lista? " + lista.contem(3));
        System.out.println("Maggie esta na lista? " + lista.contem(6));

        // 16) Remova do começo da lista, depois imprima a lista e o tamanho
        lista.RemoverInicio();
        lista.ImprimirLista();
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 17) Verifique se Marge, Homer, Bart e Maggie estão na lista
        System.out.println("Marge esta na lista? " + lista.contem(2));
        System.out.println("Homer esta na lista? " + lista.contem(1));
        System.out.println("Bart esta na lista? " + lista.contem(3));
        System.out.println("Maggie esta na lista? " + lista.contem(6));
        lista.ImprimirLista();
        System.out.println("Tamanho da lista: " + lista.TamanhoLista());

        // 18) Esvazie a lista e imprima
        lista.EsvaziarLista();
        lista.ImprimirLista();
    }
}
