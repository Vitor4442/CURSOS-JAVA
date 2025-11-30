package StreamsAPI;

import java.util.function.UnaryOperator;

public class Utilitarios {
    public final static UnaryOperator<String> maiusculo = l -> l.toUpperCase();

    public final static UnaryOperator<String> primeiraLetra = l -> l.charAt(0) + "";

    public final static UnaryOperator<String> grito = l -> l  + "!!!";
}
