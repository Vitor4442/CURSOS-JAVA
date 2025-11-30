package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        nums.stream()
                .map(UtiliatiosDesafio.intToStringBinary)
                .map(UtiliatiosDesafio.inverter)
                .map(UtiliatiosDesafio.inverter)
                .map(UtiliatiosDesafio.stringTointBinario)
                .forEach(System.out::println);
        /*
        *1. Numero para String binario 6 => "110"
        * 2. reverter a string "110" => "011"
        * 3. converte para o valor inteiro => "011" => 3
        * */
    }
}
