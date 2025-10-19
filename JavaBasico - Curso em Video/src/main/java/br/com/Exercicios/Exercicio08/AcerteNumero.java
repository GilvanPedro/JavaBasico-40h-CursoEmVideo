package br.com.Exercicios.Exercicio08;

import java.util.Scanner;

public class AcerteNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, random;
        int vidas = 5;
        random = (int) (1+ Math.random() * (20-1));

        while (true && vidas > 0){
            System.out.println("chute um número de 1 - 20");
            num = sc.nextInt();
            vidas--;

            if (num == random){
                System.out.println("Você ganhou!!");
                break;
            } else if(num < random){
                System.out.println("O número precisa ser maior");
            } else if(num > random){
                System.out.println("O número precisa ser menor");
            }
            System.out.println("vidas: " + vidas);
            if (vidas == 0){
                System.out.println("Suas vidas acabaram");
            }
        }
    }
}
