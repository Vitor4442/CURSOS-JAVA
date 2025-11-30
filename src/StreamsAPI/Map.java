package StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "AUDI ", "Honda ");

        //marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        System.out.println("Usando composição");
        marcas.stream()
                .map(Utilitarios.maiusculo)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito)
                .forEach(print);

    }
}
