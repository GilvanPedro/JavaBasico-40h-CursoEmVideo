package br.com.Aulas.Aula09;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        float media, n1, n2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeira nota:");
        n1 = sc.nextFloat();
        System.out.print("Segunda nota:");
        n2 = sc.nextFloat();

        media = (n1 + n2) / 2;

        System.out.println("Média: "+media);
        if(media >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
