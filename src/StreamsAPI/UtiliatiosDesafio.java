package StreamsAPI;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UtiliatiosDesafio {
    public static Function<Integer, String> intToStringBinary = b -> Integer.toBinaryString(b);
    public static UnaryOperator<String> inverter = b ->  new StringBuilder(b).reverse().toString();
    public static Function <String, Integer> stringTointBinario = l -> Integer.parseInt(l, 2);

}
