package com.lista_duplamente_encadeada_numeros;

public class No {

    int valor;
    No anterior;
    No proximo;

    public No(int valor) {

        this.valor = valor;
        this.anterior = null;
        this.proximo = null;

    }

}
