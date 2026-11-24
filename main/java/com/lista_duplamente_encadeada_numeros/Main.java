package com.lista_duplamente_encadeada_numeros;


public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[1000];

        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        for (int i = 0; i < vetor.length; i++) {

            vetor[i] = (int) (Math.random() * 19999) - 9999;

        }

        System.out.println("===== VETOR ORIGINAL =====");

        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");

            if ((i + 1) % 20 == 0) {

                System.out.println();

            }

        }

        System.out.println("\n");

        for (int i = 0; i < vetor.length; i++) {

            lista.inserir(vetor[i]);

        }

        System.out.println("===== LISTA EM ORDEM CRESCENTE =====");

        lista.exibirCrescente();

        System.out.println("\n===== LISTA EM ORDEM DECRESCENTE =====");

        lista.exibirDecrescente();


        lista.removerPrimos();


        System.out.println("\n===== LISTA SEM NUMEROS PRIMOS =====");

        lista.exibirCrescente();

    }

}
