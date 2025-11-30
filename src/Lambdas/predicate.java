package Lambdas;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto) >= 750);

        Produto produto = new Produto("Notebook", 3450.32, 0.14);

        System.out.println(isCaro.test(produto));
    }
}
