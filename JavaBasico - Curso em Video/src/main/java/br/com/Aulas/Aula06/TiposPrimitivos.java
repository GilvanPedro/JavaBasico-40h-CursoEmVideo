package br.com.Aulas.Aula06;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = sc.nextLine();
        System.out.println("Digite a nota do Aluno:");
        float nota = sc.nextFloat();

        System.out.print("A nota de " + nome +" nota é: " + nota);
        System.out.println("A nota de " + nome +" nota é: " + nota);
        System.out.printf("A nota de %s nota é: %.2f \n", nome, nota);
        System.out.format("A nota de %s nota é: %.2f \n", nome, nota);
        System.out.println();

        //TESTE DE TIPOS
        byte idade = 30;

        String idadeStr = Integer.toString(idade);
        System.out.println(idadeStr);

        String valor = "20";
        int valorInt = Integer.parseInt(valor);
        System.out.println(valorInt);
    }
}
