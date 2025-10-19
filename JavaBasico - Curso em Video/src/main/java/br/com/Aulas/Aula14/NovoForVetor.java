package br.com.Aulas.Aula14;

import java.util.Arrays;

public class NovoForVetor {
    public static void main(String[] args) {
        double[] vetor = {3.5, 2.75, 9, -4.5};
        System.out.println("Vetores desordenados");
        for(double valor: vetor){
            System.out.print(valor+" ");
        }

        //BUSCA EM UM VETOR
        int pos = Arrays.binarySearch(vetor, 9);
        System.out.println("\nEncontrei o valor na posição "+(pos+1));

        //ORDENAR VETOR
        System.out.println("\nVetores ordenados");
        Arrays.sort(vetor);
        for(double valor: vetor){
            System.out.print(valor+" ");
        }

        //BUSCA EM UM VETOR
        pos = Arrays.binarySearch(vetor, 9);
        System.out.println("\nEncontrei o valor na posição "+(pos+1));

        //FAZER OS VETORES RECEBEREM O MESMO VALOR
        System.out.println();
        int num[] = new int [5];
        Arrays.fill(num,69);
        for(int valor: num){
            System.out.print(valor+" ");
        }
    }
}
