package br.com.Aulas.Aula07;

import java.util.Scanner;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        float n1 = 3.3f;
        float n2 = 8.1f;
        float m = (n1+n2)/2;

        System.out.printf("A média é: %f\n\n", m);

        Scanner sc = new Scanner(System.in);

        float numero;
        float denominador;
        float divisao;
        float resto;

        System.out.print("Numerador:");
        numero = sc.nextFloat();
        System.out.print("Denominador:");
        denominador = sc.nextFloat();

        divisao = numero/denominador;
        resto = numero % denominador;

        System.out.printf("\nDivisão: %.2f\n", divisao);
        System.out.printf("Resto em divisão exata: %.0f\n\n", resto);

        // ++ ANTES OU DEPOIS DA VARIAVEL
        int num = 5;
        int num2 = 5;

        System.out.println(num);
        int valor = 5 + ++num;
        System.out.println(valor);
        int valor2 = 5 + num2++;
        System.out.println(valor2);
        System.out.println();

        //RAIZ QUADRADA
        int x = 25;
        int raiz = (int) Math.sqrt(x);
        System.out.println(raiz);
        System.out.println();

        //ARREDONDAMENTO DE NÚMEROS
        float v = 8.3f;

        int ar1 = (int) Math.ceil(v);
        int ar2 = (int) Math.floor(v);

        System.out.println(ar1);
        System.out.println(ar2);
        System.out.println();

        //NUMERO ALEATORIO
        double ale = Math.random();
        int random = (int) (1 + ale * (20-1));
        System.out.println(random);
    }
}
