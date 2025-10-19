package br.com.Aulas.Aula15;

public class Metodos02 {
    static String contador(int i, int f){
        String s = "";
        for(int c = i; c<=f; c++){
            s+=c+" ";
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Vai começar a contagem");
        System.out.println(contador(1, 20));
    }
}
