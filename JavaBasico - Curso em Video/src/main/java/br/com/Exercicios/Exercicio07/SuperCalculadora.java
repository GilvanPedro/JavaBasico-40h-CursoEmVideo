package br.com.Exercicios.Exercicio07;

import java.util.Scanner;

public class SuperCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float resto;
        float numero;
        float elCubo;

        System.out.print("Informe o Número:");
        numero = sc.nextFloat();

        resto = numero % 2;
        float raiz = (float) Math.sqrt(numero);
        elCubo = numero * numero * numero;
        float raizCubica = (float) Math.cbrt(numero);
        float valorAbs = Math.abs(numero);

        System.out.printf("Resto da divisão por 2: %.0f\n", resto);
        System.out.println("Raiz quadrada: "+raiz);
        System.out.println("Elevado ao cubo: "+elCubo);
        System.out.println("Raiz cubica: "+raizCubica);
    }
}
