package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class operadorBinario {
    public static void main(String[] args) {
        BinaryOperator<Double> calMedia = (nota1, nota2 ) -> ( nota1 + nota2) / 2.0;

        //System.out.println(calMedia.apply((double)10,(double)8));

        BiFunction<Double, Double, String> resultado = (n1, n2) -> {
            double resultadoFinal = (n1 + n2) / 2;
            return resultadoFinal >= 7 ? "Aprovado!" : "Reprovado";
        };

        //System.out.println(resultado.apply(7.6, 4.3));

        Function<Double, String> conceito = x -> x >= 7.0 ? "Aprovado" : "Reprovado";

        System.out.println(calMedia.andThen(conceito).apply(6.5, 4.5));

    }
}
