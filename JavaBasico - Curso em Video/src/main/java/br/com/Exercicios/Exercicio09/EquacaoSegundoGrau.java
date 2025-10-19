package br.com.Exercicios.Exercicio09;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        int teta, A, B, C;

        Scanner sc = new Scanner(System.in);

        System.out.println("Levando em conta a fórmula da equação, forneça o valor das variáveis para calcular o teta");
        System.out.println("A x^2 + B x + C = 0");

        System.out.print("Valor de A:");
        A = sc.nextInt();
        System.out.print("Valor de B:");
        B = sc.nextInt();
        System.out.print("Valor de C:");
        C = sc.nextInt();

        teta = (B*B) - 4 * A * C;

        System.out.println("O valor de teta é: "+teta);

        if(teta < 0){
            System.out.println("Não existem raizes reais");
        } else{
            System.out.println("Existem raizes reais");
        }
    }
}
