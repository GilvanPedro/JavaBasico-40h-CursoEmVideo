package br.com.Exercicios.Exercicio12;

import java.util.Scanner;

public class VerificarTiposNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par=0, imp=0, num, acem=0, med=0, cont=0, som=0;

        do {
            System.out.println("Digite um numero (0 para sair): ");
            num = sc.nextInt();
            if(num > 0){
                cont++;
                if(num%2==0){
                    par++;
                }else{
                    imp++;
                }
                if(num>100){
                    acem++;
                }
                som+=num;
                med = som/cont;
            }
        }while(num!=0);

        System.out.println("Total valores: "+cont);
        System.out.println("Total pares: "+par);
        System.out.println("Total impares: "+imp);
        System.out.println("Acima de 100: "+acem);
        System.out.println("Média valores: "+med);
    }
}
