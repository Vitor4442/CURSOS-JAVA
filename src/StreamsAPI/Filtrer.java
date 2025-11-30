package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filtrer {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 9.8);
        Aluno a2 = new Aluno("Gui", 1.8);
        Aluno a3 = new Aluno("Ze", 3.8);
        Aluno a4 = new Aluno("Carlos", 10.0);
        Aluno a5 = new Aluno("Marcos", 6.8);
        Aluno a6 = new Aluno("Maiara", 7.8);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
        Predicate<Aluno> aprovado = a -> a.nota >= 7.0;
        Function<Aluno, String> passou = a -> "Parabens " + a.nome;


        alunos.stream()
                .filter(aprovado)
                .map(passou)
                .forEach(System.out::println);
    }
}
