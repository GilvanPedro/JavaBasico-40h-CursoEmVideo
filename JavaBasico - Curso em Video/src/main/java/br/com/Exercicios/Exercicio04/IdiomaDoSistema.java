package br.com.Exercicios.Exercicio04;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] args) {
        Locale localePadrao = Locale.getDefault();

        String codigoIdioma = localePadrao.getDisplayLanguage();
        System.out.println("O idioma do sistema operacional é: "+codigoIdioma);
    }
}
