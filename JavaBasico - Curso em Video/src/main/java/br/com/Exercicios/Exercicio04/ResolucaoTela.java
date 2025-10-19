package br.com.Exercicios.Exercicio04;

import java.awt.*;

public class ResolucaoTela {
    public static void main(String[] args) {
        Toolkit tk = Toolkit.getDefaultToolkit();

        Dimension d = tk.getScreenSize();
        int width = d.width;
        int height = d.height;

        System.out.println("A resolução da tela é: " + width + "px de largura x " + height + "px de altura");
    }
}
