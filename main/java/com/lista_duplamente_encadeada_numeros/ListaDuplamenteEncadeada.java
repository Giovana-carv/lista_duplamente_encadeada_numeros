package com.lista_duplamente_encadeada_numeros;


public class ListaDuplamenteEncadeada {

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

        }

        else if (valor < inicio.valor) {

            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;

        }


        else if (valor >= fim.valor) {

            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;

        }


        else {

            No atual = inicio;

            while (atual != null && atual.valor <= valor) {

                atual = atual.proximo;

            }

            novoNo.proximo = atual;
            novoNo.anterior = atual.anterior;

            atual.anterior.proximo = novoNo;
            atual.anterior = novoNo;

        }

    }

    public void exibirCrescente() {

        No atual = inicio;

        while (atual != null) {

            System.out.print(atual.valor + " ");

            atual = atual.proximo;

        }

        System.out.println();

    }

    public void exibirDecrescente() {

        No atual = fim;

        while (atual != null) {

            System.out.print(atual.valor + " ");

            atual = atual.anterior;

        }

        System.out.println();

    }


    private boolean ehPrimo(int valor) {

        if (valor < 2) {

            return false;

        }

        for (int i = 2; i <= valor / i; i++) {

            if (valor % i == 0) {

                return false;

            }

        }

        return true;

    }


    public void removerPrimos() {

        No atual = inicio;

        while (atual != null) {

            No proximo = atual.proximo;

            if (ehPrimo(atual.valor)) {


                if (atual.anterior == null) {

                    inicio = atual.proximo;

                } else {

                    atual.anterior.proximo = atual.proximo;

                }

                if (atual.proximo == null) {

                    fim = atual.anterior;

                } else {

                    atual.proximo.anterior = atual.anterior;

                }

                atual.anterior = null;
                atual.proximo = null;

            }

            atual = proximo;

        }

    }

}
