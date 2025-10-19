package br.com.Aulas.Aula09;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        int idade, anoN, ano;
        ano = 2025;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        anoN = sc.nextInt();
        idade = ano - anoN;

        if(idade >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
    }
}
