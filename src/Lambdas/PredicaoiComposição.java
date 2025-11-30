package Lambdas;

import java.util.function.Predicate;

public class PredicaoiComposição {
    public static void main(String[] args) {
        Predicate<Integer> isPar = valor -> valor %2 == 0;
        Predicate<Integer> isNum3Dig = valor -> valor >= 100 && valor <= 999;

        System.out.println(isNum3Dig.and(isPar).negate().test(22)); //true
        System.out.println(isNum3Dig.and(isPar).test(22)); //false
        System.out.println(isNum3Dig.or(isPar).test(22)); //true

    }
}
