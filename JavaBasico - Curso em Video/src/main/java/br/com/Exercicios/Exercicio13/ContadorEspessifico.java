package br.com.Exercicios.Exercicio13;

import java.util.Scanner;

public class ContadorEspessifico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, in, fim, pass;

        System.out.print("Digite onde inicia: ");
        in = sc.nextInt();
        System.out.print("Digite onde termina: ");
        fim = sc.nextInt();
        System.out.print("Digite os passos: ");
        pass = sc.nextInt();

        int i;
        for (i = in; i <= fim; i+=pass){
            System.out.println(i);
        }
    }
}
