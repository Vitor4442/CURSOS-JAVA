package Lambdas;

import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class Desafio {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "br"));

        Double imposto = 8.5;

        Produto produto = new Produto("Faca pp47", 3500, 0.10);

        Function<Produto, Double> valorTotal = prod -> prod.preco - (prod.preco* prod.desconto);

        Function<Double, Double> aplicarImposto = valorFinal -> valorFinal >= 2800 ? valorFinal - (valorFinal* (imposto/100)) : valorFinal;

        Function<Double, Double> AplicarFrete = valorComimposto -> {
            Double frete = 50.0;
            frete = valorComimposto >= 3000 ? frete = 100.0 : frete;
            return frete;
        };

        Consumer<Double> imprimirProduto = dados -> System.out.printf("Produto: %s R$ %.2f%n", produto.nome, dados);
        Consumer<Double> imprimirFrete = dados -> System.out.printf("Valor do frete : R$ %.2f%n", dados);


        Double valorFinal = valorTotal.andThen(aplicarImposto).apply(produto);
        Double frete = AplicarFrete.apply(valorFinal);

        imprimirProduto.accept(valorFinal);
        imprimirFrete.accept(frete);

        //arrendondar deixa duas casas decimais
        //formatar para R$
    }


}
