package br.com.Exercicios.Exercicio14;

import java.util.Arrays;
import java.util.Scanner;

public class ModificarVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Todas as posições começam com 0
        Arrays.fill(numeros,0);

        while(true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir número em uma posição");
            System.out.println("2 - Ordenar vetor");
            System.out.println("3 - Mostrar vetor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            if (opcao == 1) {
                System.out.print("Digite a posição (0 a 9): ");
                int pos = sc.nextInt();

                if (pos < 0 || pos >= numeros.length) {
                    System.out.println("Posição inválida!");
                } else {
                    System.out.print("Digite o número: ");
                    int valor = sc.nextInt();
                    numeros[pos] = valor;
                }
            }
            else if (opcao == 2) {
                Arrays.sort(numeros);
                System.out.println("Vetor ordenado!");
            }
            else if (opcao == 3) {
                System.out.println("Vetor atual:");
                for (int i = 0; i < numeros.length; i++) {
                    System.out.println("Posição " + i + " = " + numeros[i]);
                }
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
