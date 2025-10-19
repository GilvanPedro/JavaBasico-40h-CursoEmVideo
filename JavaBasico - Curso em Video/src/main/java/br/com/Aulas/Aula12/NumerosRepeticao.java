package br.com.Aulas.Aula12;

import java.util.Scanner;

public class NumerosRepeticao {
    public static void main(String[] args) {
        int n, s=0;
        String resp;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Digite um numero: ");
            n = sc.nextInt();
            s+=n;

            System.out.print("Quer continuar? (S/N) ");
            resp = sc.next();
        }while (resp.equals("S") || resp.equals("s"));
        System.out.println("A soma de todos os valores é: "+s);
    }
}
