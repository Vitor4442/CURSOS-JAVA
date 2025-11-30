package StreamsAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("lu", "gui", "Ana");

        for (String aprovado : aprovados){
            System.out.println(aprovado);
        }

        //Na Stream API, o iterator é o mecanismo interno que percorre os elementos da coleção, só que você não vê.
        //É por isso que dizemos que Streams usam iteração interna (internal iteration), enquanto o for e o while usam iteração externa (external iteration).

        System.out.println("\nUsando interator: ");
        Iterator<String> it = aprovados.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("\nUsando Stream");

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);


    }
}
