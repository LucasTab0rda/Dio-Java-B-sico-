package edu.lucas.terceiraSemana;

public class tiposEVariaveis {

    public static void main (String [] args) {
    
        double salarioMinimo = 2500.3;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
    //  O cast adicionado abaixo (short) tem como objetivo "refatorar" o tipo
    //  da variavel para assim ser mais abrangente conforme o objetivo.
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        //Em JavaScript declaramos contantes (variaveis que os seus valores não serão alterados)
        //Já em Java declaramos como: "final" seguido do tipo e por fim em caixa alta o nome 
        // da variável.
        final double VALOR_DE_PI = 3.14;

         

    }
}
