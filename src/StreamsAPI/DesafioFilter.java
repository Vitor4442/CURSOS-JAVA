package StreamsAPI;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {
    public static void main(String[] args) {
        Produto p1 = new Produto("Caneca", 32, 9.0, true);
        Produto p2 = new Produto("Blusa", 12, 32.0, true);
        Produto p3 = new Produto("Calça", 72, 100.0, false);
        Produto p4 = new Produto("Aliança", 3, 311.0, true);
        Produto p5 = new Produto("meia", 100, 6.5, false);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        produtos.stream()
                .filter(FunctionsProduto.estoqueBaixo)
                .map(FunctionsProduto.itensComEstoqueBaixo)
                .forEach(System.out::println);

        produtos.stream()
                .filter(FunctionsProduto.anuncioBom)
                .map(FunctionsProduto.itensComAnuncioRuim)
                .forEach(System.out::println);
    }



}

