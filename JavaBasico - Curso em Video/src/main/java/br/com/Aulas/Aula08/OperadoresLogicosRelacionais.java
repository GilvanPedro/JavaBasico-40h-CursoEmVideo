package br.com.Aulas.Aula08;

import java.time.LocalDate;
import java.util.Scanner;

public class OperadoresLogicosRelacionais {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 5;

        //O QUE ESTÁ DEPOIS DA ? DEPENDE DO QUE ESTÁ ANTES.     NESSE CASO SE O QUE FOI IMPOSTO ANTES FOR VERDADEIRO, QUE NO CASO É N1>N2, A VARIAVEL VAI RECEBER O VALOR DE 0, E, SE O QUE FOR IMPOSTO FOR FALSO, A VARIAVEL RECEBERÁ O VALOR DE 1
        int maior = n1 > n2 ? 0 : 1;
        System.out.println(maior);

        //COMPARACAO DE STRING
        String nome1, nome2, nome3, res1, res2;
        nome1 = "Gustavo";
        nome2 = "Gustavo";
        nome3 = new String("Gustavo");

        res1 = nome1 == nome3 ? "igual" : "diferente";
        res2 = nome1.equals(nome3) ? "igual" : "diferente";

        System.out.println(res1);
        System.out.println(res2);

        //VERIFICAR IDADE
        LocalDate dataAtual = LocalDate.now();
        Scanner sc = new Scanner(System.in);

        int anoInt = dataAtual.getYear();
        int idade, anoN;
        String maiorIdade, voto;

        System.out.println("Digite o ano de nascimento: ");
        anoN = sc.nextInt();
        idade = anoInt - anoN;

        maiorIdade = idade >= 18 ? "Maior de idade" : "Menor de idade";
        System.out.println(maiorIdade);

        //VERIFICAR VOTO
        voto = (idade >= 16 && idade < 18) || (idade > 70) ? "voto opcional" : "voto obrigatório";
        System.out.println(voto);
    }
}
