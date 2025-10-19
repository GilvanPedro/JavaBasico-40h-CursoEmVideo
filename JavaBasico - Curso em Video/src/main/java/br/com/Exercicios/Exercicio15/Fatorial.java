package br.com.Exercicios.Exercicio15;

public class Fatorial {
    private int num=0, fat= 1;
    private String formula=" ";

    public void setValor(int n){
        num = n;
        int f = 1;
        String s="";

        for(int i = 1; i<= n; i++){
            f*=i;
            s += i + " x ";
        }
        s+="=";
        fat = f;
        formula = s;
    }

    public int getFatorial(){
        return fat;
    }

    public String getFormula(){
        return formula;
    }
}
