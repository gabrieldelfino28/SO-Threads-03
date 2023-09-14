package controller;

public class ThreadVetor extends Thread {
    int[] vetor;
    int num;

    public ThreadVetor(int num, int[] vetor) {
        this.vetor = vetor;
        this.num = num;
    }

    @Override
    public void run() {
        PercorrerVetor();
    }

    private void PercorrerVetor() {

        if (num % 2 == 0) {
            //
            double inicio = System.nanoTime();
            for (int i = 0; i < vetor.length; i++) {
                //Percorrendo vetor
            }
            double fim = System.nanoTime();
            double duracao = fim - inicio;
            duracao /= Math.pow(10, 9);
            System.out.println("Duração for norm: \n" + String.format("%.9f", duracao) + " segundos");
        }
        if (num % 2 != 0) {
            //
            double inicio = System.nanoTime();
            for (int i : vetor) {
                //Percorrendo vetor
            }
            double fim = System.nanoTime();
            double duracao = fim - inicio;
            duracao /= Math.pow(10, 9);
            System.out.println("Duração for each: \n" + String.format("%.9f", duracao) + " segundos");
        }

    }


}
