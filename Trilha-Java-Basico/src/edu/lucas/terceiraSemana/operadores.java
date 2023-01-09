package edu.lucas.terceiraSemana;

public class operadores {

    // Operador de "Atribuição"
    // É utilizado para definir o valor inicial ou sobrescrever o valor de uma
    // variável.

    public static void main(String[] args) {

        String nome = "Lucas";
        int idade = 22;
        double peso = 60.3;
        char sexo = 'M';
        boolean doadorOrgao = true;

        // Aritméticos
        // É utilizado para realizar operações matemáticas entre valores numériso,
        // podendo se tornar
        // ou não uma expressão mais complexa.

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // ATENÇÃO -> o operador de adição (+), quando utilizado em variáveis do tipo
        // string realizará
        // a "concatenação de texto".

        String nomeCompleto = "linguagem " + "Java";

        System.out.print(nomeCompleto);

        // Exemplo da concateenação de texto a partir do operador de soma (+)

        String concatenacao = "?";

        concatenacao = 1 + "1" + 1 + 1;

        System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.print(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.print(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        

    }
}
