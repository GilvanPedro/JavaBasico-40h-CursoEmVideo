package br.com.Aulas.Aula09;

import java.util.Scanner;

public class VerificarPar {
    public static void main(String[] args) {
        int num, res;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num%2==0){
            System.out.println("O número é par");
        }else{
            System.out.println("O número é impar");
        }
    }
}
