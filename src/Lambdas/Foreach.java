package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("ana", "bia", "guit");

        System.out.println("forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda na versão 1");

        aprovados.forEach(nome -> System.out.println(nome + "!!"));

        System.out.println("/n Method reference...");
        aprovados.forEach(System.out::println);

        System.out.println("\nLambda na versão 2");
        aprovados.forEach(nome -> meuImprimir(nome));
    }

        static void  meuImprimir (String nome ){
            System.out.println("Oi! Meu nome é: " + nome);
        }


}
