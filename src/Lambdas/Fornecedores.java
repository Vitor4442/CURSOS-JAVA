package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedores {
    public static void main(String[] args) {

        Supplier<List<String>> listaFornecedores = () -> Arrays.asList("Ana", "gui", "zé");

        System.out.println(listaFornecedores.get());
    }
}
