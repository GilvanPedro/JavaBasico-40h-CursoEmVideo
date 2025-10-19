package br.com.Aulas.Aula10;

import java.util.Scanner;

public class VerificarVotar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int nasc = sc.nextInt();
        int idade = 2025 -  nasc;

        if((idade < 18 && idade >= 16) || idade >= 70){
            System.out.println("Voto Opcional");
        } if(idade >= 18 && idade < 70){
            System.out.println("Voto Obrigatório");
        } else if(idade < 16) {
            System.out.println("Sem Idade para votar");
        }
        System.out.println("Idade: "+idade);
    }
}
