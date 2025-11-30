package Lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Cosumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirProduto = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Mouse", 100.32, 0.32);

        imprimirProduto.accept(p1);

        Produto p2 = new Produto("Mouse", 100.32, 0.32);
        Produto p3 = new Produto("Teclado", 132.32, 0.12);
        Produto p4 = new Produto("Fone de ouvido", 230.32, 0.32);
        Produto p5 = new Produto("Pc gamer", 10032.32, 0.12);

        List<Produto> produtos = Arrays.asList(p2, p3, p4, p5);

        produtos.forEach(imprimirProduto);
        produtos.forEach(System.out::println);
    }

}
