package br.com.Aulas.Aula10;

import java.util.Scanner;

public class QuantidadePernas {
    public static void main(String[] args) {
        int pernas;
        String tipo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o numero de pernas: ");
        pernas = sc.nextInt();

        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Quadúpede";
                break;
            case 4:
                tipo = "Touro";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println("Isso é um(a) "+tipo);
    }
}
