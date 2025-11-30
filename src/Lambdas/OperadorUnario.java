package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> somarDois = n -> n + 2;
        UnaryOperator<Integer> vezeDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = somarDois.andThen(vezeDois).andThen(aoQuadrado).apply(0);

        System.out.println(resultado1);

        int resultado2 = vezeDois.compose(aoQuadrado).compose(somarDois).apply(0);

        System.out.println(resultado2);

    }
}
