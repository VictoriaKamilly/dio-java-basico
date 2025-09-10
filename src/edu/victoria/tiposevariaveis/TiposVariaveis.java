package edu.victoria.tiposevariaveis;

public class TiposVariaveis {
    
    public static void main(String[] args) {
        
        // byte: -128 a 127
        byte idade = 25;

        // short: -32.768 a 32.767
        short quantidade = 32000;

        // int: -2 bilhões a 2 bilhões
        int populacaoCidade = 1500000;

        // long: números bem grandes
        long populacaoMundial = 7800000000L; // precisa do L no final

        // boolean: verdadeiro ou falso
        boolean ativo = true;

        // char: um caractere
        char letra = 'A';

        // float: número decimal (precisa do f no final)
        float preco = 19.99f;

        // double: número decimal com maior precisão
        double salario = 3500.75;

        // Exibindo valores
        System.out.println("Idade (byte): " + idade);
        System.out.println("Quantidade (short): " + quantidade);
        System.out.println("População da cidade (int): " + populacaoCidade);
        System.out.println("População mundial (long): " + populacaoMundial);
        System.out.println("Ativo (boolean): " + ativo);
        System.out.println("Letra (char): " + letra);
        System.out.println("Preço (float): " + preco);
        System.out.println("Salário (double): " + salario);

         // Criando Strings
        String nome = "Victoria"; // forma mais comum
        String sobrenome = new String("Silva"); // forma menos usada

        // Concatenando Strings
        String nomeCompleto = nome + " " + sobrenome;

        // Métodos úteis da classe String
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Tamanho do nome: " + nomeCompleto.length()); // quantidade de caracteres
        System.out.println("Maiúsculo: " + nomeCompleto.toUpperCase());
        System.out.println("Minúsculo: " + nomeCompleto.toLowerCase());
        System.out.println("Primeira letra: " + nomeCompleto.charAt(0));
        System.out.println("Contém 'Silva'? " + nomeCompleto.contains("Silva"));
        System.out.println("Substituir: " + nomeCompleto.replace("Silva", "Souza"));
        System.out.println("Parte do texto: " + nomeCompleto.substring(0, 8)); // pega pedaço da String
    }
}


