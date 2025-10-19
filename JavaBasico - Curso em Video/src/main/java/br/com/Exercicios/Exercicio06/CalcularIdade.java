package br.com.Exercicios.Exercicio06;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        int idade;
        int anoNascimento;
        int anoInt = dataAtual.getYear();

        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = sc.nextInt();
        idade = anoInt - anoNascimento;

        System.out.printf("Você tem ou vai fazer %d anos em %d", idade, anoInt);
    }
}
