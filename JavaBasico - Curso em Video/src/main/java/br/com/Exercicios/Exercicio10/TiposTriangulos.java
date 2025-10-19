package br.com.Exercicios.Exercicio10;

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        int triangulo, a, b, c, conta;
        String tipo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o segmento A: ");
        a = sc.nextInt();
        System.out.print("Digite o segmento B: ");
        b = sc.nextInt();
        System.out.print("Digite o segmento C: ");
        c = sc.nextInt();

        if(a < b + c && b < a + c && c < a + b){
            System.out.println("É um Triângulo!");

            if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
                System.out.println("Triângulo Isósceles");
            } else if(a == b && b == c){
                System.out.println("Triângulo Equilátero");
            } else if(a != b && b != c && a != c){
                System.out.println("Triângulo Escaleno");
            }
        }else{
            System.out.println("Não é um Triângulo!");
        }
    }
}
