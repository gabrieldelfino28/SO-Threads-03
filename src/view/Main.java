package view;

import controller.ThreadVetor;

public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Thread t = new ThreadVetor(2,vetor);
        Thread t2 = new ThreadVetor(1,vetor);
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * 100 + 1);
        }
        t.start();
        t2.start();
    }
}
