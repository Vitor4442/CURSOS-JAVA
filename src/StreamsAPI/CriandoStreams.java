package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "br"));
        Consumer<String> print = System.out::print;
        Stream <String> langs = Stream.of("java ", "Lua ", "JavaScript \n");
        langs.forEach(print);

        String[] maisLands = {"CSS ", "HTML ", "SQL ", "PYTHON \n"};

        Stream.of(maisLands).forEach(print);

        Arrays.stream(maisLands).forEach(print);

        Arrays.stream(maisLands, 1, 2).forEach(print);

        List<String> outrasLinguagens = Arrays.asList("PHP ", "GO ", "KOTLIN \n");
        outrasLinguagens.stream().forEach(print);

        Stream.generate(() -> "A").forEach(print);
        Stream.iterate(0, n -> n + 1).forEach(System.out::println);





    }
}
