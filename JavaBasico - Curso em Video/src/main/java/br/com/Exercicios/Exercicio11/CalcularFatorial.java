package br.com.Exercicios.Exercicio11;

import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fat, num, cont;
        fat=1;
        cont=1;

        System.out.print("Digite o valor: ");
        num = sc.nextInt();

        System.out.println(num+"! é igual a:");
        while(cont <= num){
            fat*=cont;
            if(cont == num){
                System.out.println(cont);
            }else {
                System.out.print(cont + " * ");
            }
            cont++;
        }
        System.out.println("Resposta é: "+fat);
    }
}
